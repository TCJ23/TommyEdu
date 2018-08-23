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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title i.e: Go Your Own Way\nthis sing make query behave normal\n " +
                            "use tis for SQL Injection:\nGo Your Own Way\" or 1=1 or \"");
        String title = scanner.nextLine();

        List<SongArtist> songArtists = datasource.querySongInfoView(title);
        if (songArtists.isEmpty()) {
            System.out.println("Nie ma takiej piosenki ");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("WIDOK - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        datasource.close();
        /*           SQL INJECTION NIUANS!!!                            */
        /* SELECT name, album, track FROM artist_list WHERE title = "Go Your Own Way" or 1=1 or ""

         SELECT name, album, track FROM artist_list WHERE title = "Go Your Own Way or 1=1 or ""  */
    }
}
