import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/spark";
        ; //spark is db name
        String username="root";
        String password="Sakshi@5555";

        String deletequery="DELETE FROM STUDENT WHERE ID=?";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pr=con.prepareStatement(deletequery);
            pr.setInt(1,1);
            int update=pr.executeUpdate();
            if(update>0)
            {
                System.out.println("Data deleted");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
