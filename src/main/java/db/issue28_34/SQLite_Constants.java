package db.issue28_34;

import java.sql.*;

public class SQLite_Constants {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Library\\TommyEDU2mvn\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + " text, "
                                + COLUMN_PHONE + " integer, "
                                + COLUMN_EMAIL + " text" +
                                ")");
            insertContact(statement,"Tomi", 605880002, "tomi@utk.com");
            insertContact(statement,"Tommy", 605880002, "tomi@utk.com");
            insertContact(statement,"Tommy", 605880002, "tomi@utk.com");
            insertContact(statement,"Max", 666666666, "tomi@utk.com");
            insertContact(statement,"Dex", 664201455, "tomi@utk.com");

            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + ", " +
                                COLUMN_PHONE + ", " +
                                COLUMN_EMAIL +
                                " )" +
                                "VALUES('Tomi', 605880002, 'tomi@utk.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + ", " +
                                COLUMN_PHONE + ", " +
                                COLUMN_EMAIL +
                                " )" +
                                "VALUES('TOMMY', 605880002, 'tomi@utk.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + ", " +
                                COLUMN_PHONE + ", " +
                                COLUMN_EMAIL +
                                " )" +
                                "VALUES('TOMMY', 605880002, 'tomi@utk.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + ", " +
                                COLUMN_PHONE + ", " +
                                COLUMN_EMAIL +
                                " )" +
                                "VALUES('Max', '666 666 666' , 'max@utk.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                                " ("
                                + COLUMN_NAME + ", " +
                                COLUMN_PHONE + ", " +
                                COLUMN_EMAIL +
                                " )" +
                                "VALUES('Dex', '+48 664 201 455', 'dex@utk.com')");
            statement.execute("UPDATE " + TABLE_CONTACTS +
                                " SET " + COLUMN_PHONE + " =4444" +
                                " WHERE " + COLUMN_NAME + " ='Max'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                                " WHERE " + COLUMN_NAME + "='TOMMY'");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                                    resultSet.getInt(COLUMN_PHONE) + " " +
                                    resultSet.getString(COLUMN_EMAIL));
            }
            /*      ORDER IS IMPORTANT            */
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Coś poszło nie tak " + e.getMessage());
            e.printStackTrace();
        }
    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException
    {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                        " ("
                        + COLUMN_NAME + ", " +
                        COLUMN_PHONE + ", " +
                        COLUMN_EMAIL +
                        " )" +
                        "VALUES('" + name + "', '" + phone + "', '" + email + "')");
//                        "VALUES('" + name + "', '" + phone + "', '" + email +"')");
    }
}

