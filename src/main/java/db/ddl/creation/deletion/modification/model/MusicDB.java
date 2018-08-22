package db.ddl.creation.deletion.modification.model;

import java.util.List;

public class MusicDB {
    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if (!datasource.open()) {
            System.out.println("No nie udało się połączyć z bazą danych ");
            return;
        }
        List<Artist> artists = datasource.queryArtist(DataSource.ORDER_BY_DESC);
//        List<Artist> artists = datasource.queryArtist(DataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("Nie znalazłem żadnych artystów ");
            return;
        }
        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }
        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Metallica", DataSource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Nie ma takiego artysty dla tej piosenki :");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }
        datasource.querySongsMetadata();
        System.out.println("Liczba piosenek " + datasource.getCount(DataSource.TABLE_SONGS));
        datasource.close();
    }
}
