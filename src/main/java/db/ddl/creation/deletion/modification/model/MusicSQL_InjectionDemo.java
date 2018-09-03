package db.ddl.creation.deletion.modification.model;

import java.util.List;
import java.util.Scanner;

public class MusicSQL_InjectionDemo {
    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if (!datasource.open()) {
            System.out.println("No nie udało się połączyć z bazą danych ");
            return;
        }

        System.out.println("Liczba piosenek " + datasource.getCount(DataSource.TABLE_SONGS));

        datasource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: Go Your Own Way\nto invoke SQL Injection you should put\n" +
                "Go Your Own Way\" or 1=1 or \"");
        String title = scanner.nextLine();

        List<SongArtist> songArtists = datasource.querySQLsafe(title);
//        List<SongArtist>songArtists = datasource.querySongInfoView(title); // SQL INJECTION NOT SAFE
        if (songArtists.isEmpty()) { // GOOD PRACTICE IS EMPTY INSTEAD OF NULL !!!
            System.out.println("Nie ma takiej piosenki ");
            return;
        }
        for (SongArtist artist : songArtists) {
            System.out.println("WIDOK - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }
        datasource.close();
    }
    /* SQL INJECTION NIUANSE !!!!!!!!!!!*/
    // SELECT name, album, track FROM artist_list WHERE title = "Go Your Own Way" or 1=1 or ""

    // SELECT name, album, track FROM artist_list WHERE title = "Go Your Own Way or 1=1 or ""

    // SELECT name, album, track FROM artist_list WHERE title = ? OR artist = ?
}
