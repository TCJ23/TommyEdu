package codewars;

import db.ddl.creation.deletion.modification.model.Artist;
import db.ddl.creation.deletion.modification.model.DataSource;

import java.util.List;

public class MusicDB {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()) {
            System.out.println("No nie udało się połączyć z bazą danych ");
            return;
        }
        List<Artist> artists = dataSource.queryArtist();
        if (artists == null) {
            System.out.println("Nie znalazłem żadnych artystów ");
            return;
        }
        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }
        dataSource.close();
    }
}
