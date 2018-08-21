import java.sql.*;

public class SQLite {
    public static void main(String[] args) {
        /*                  TRY WITH RESOURCES                                   */
        /* try (Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\Library\\TommyEDU2mvn\\testjava.db");
             Statement statement = connection.createStatement()){
            statement.execute("CREATE TABLE contatcs (name TEXT, phone INTEGER, email TEXT)");*/
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\Library\\TommyEDU2mvn\\testjava.db");
//            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");
          /*  statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Tomi', 605880002, 'tomi@email.com')");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Max', '666 666 666' , 'max@email.com')");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Dex', '+48 664 201 455', 'dex@email.com')");*/
//            statement.execute("DELETE FROM contacts WHERE name='Tomi'");
//            statement.execute("UPDATE contacts SET phone=4444 WHERE name='Max'");
            statement.execute("SELECT * FROM contacts");
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " +
                        resultSet.getInt("phone") + " " +
                        resultSet.getString("email"));
            }
            resultSet.close();

            /*      ORDER IS IMPORTANT            */
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Coś poszło nie tak " + e.getMessage());
        }
    }
}
