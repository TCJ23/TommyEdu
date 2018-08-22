package db.ddl.creation.deletion.modification.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Library\\TommyEDU2mvn\\" + DB_NAME;


    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("No coś poszło nie tak " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Nie udało się zamknąć połączenia" + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtist() {
      /*  Statement statement = null;
        ResultSet resultSet = null;*/

        /*    TRY WITH RESOURCES sprawia że nie potrzebujemy finally blok */
        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {
        /*try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM" + TABLE_ARTISTS);*/

            List<Artist> artists = new ArrayList<>();
            while (resultSet.next()) {
                Artist artist = new Artist();
                artist.setId(resultSet.getInt(COLUMN_ARTIST_ID));
                artist.setName(resultSet.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch (SQLException e) {
            System.out.println("Złe QUERY! " + e.getMessage());
            return null;
        }
        /* finally {
         *//*     Jeśli złapało by jeden wyjątek to drugi nie byłby złapany     *//*
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                System.out.println("No i kupa nie zamknęło resultSet " + e.getMessage());
                e.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("No i dupa nie zamknęło statement " + e.getMessage());
                e.printStackTrace();
            }
        }*/
    }
}
