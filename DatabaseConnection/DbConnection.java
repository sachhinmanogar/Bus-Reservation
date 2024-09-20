package DatabaseConnection;
import java.sql.*;
public class DbConnection {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/BusUser";
        String user = "root";
        String pwd = "sachhin2812**";
        String query = "select * from users";

        Connection con = DriverManager.getConnection(url,user,pwd);
        Statement st= con.createStatement();
        ResultSet result = st.executeQuery(query);

        while (result.next())
        {
            System.out.print(result.getInt(1)+" ");
            System.out.print(result.getString(2)+" ");
            System.out.print(result.getInt(3)+" ");
            System.out.print(result.getString(4)+" ");
            System.out.print(result.getInt(5));
            System.out.println();
        }
        con.close();

    }
}
