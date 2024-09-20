package DatabaseConnection;
import java.sql.*;

public class InsertUserData {

    public int insertUserData(int id,String name,int age,String gender,int seat) throws SQLException{

        String url = "jdbc:mysql://localhost:3306/BusUser";
        String user = "root";
        String pwd = "sachhin2812**";
        String query = "insert into users values (?,?,?,?,?)";

        Connection con = DriverManager.getConnection(url,user,pwd);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,age);
        st.setString(4,gender);
        st.setInt(5,seat);

        int result = st.executeUpdate();
        return result;
    }
}
