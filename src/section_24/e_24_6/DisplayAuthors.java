package section_24.e_24_6;

import java.sql.*;

public class DisplayAuthors {
    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:derby:books";
        final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors";

        try{

            Connection connection = DriverManager.getConnection(DATABASE_URL,"deitel","deitel");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.printf("Tabela authors bazy danych books:%n%n");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()){
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
