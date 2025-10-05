import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update_Operation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/data";
        ; //spark is db name
        String username="root";
        String password="Sakshi@5555";
        String updateQuery="UPDATE boys SET name = ?, course = ? WHERE name = ?";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pr=con.prepareStatement(updateQuery);
            pr.setString(1,"neha");
            pr.setString(2,"Java");
            pr.setString(3,"sajit");
            int res=pr.executeUpdate();

            //2
            pr.setString(1,"praju");

            pr.setString(2,"cpp");
            pr.setString(3,"sabar");
            res=pr.executeUpdate();

            //3
            pr.setString(1,"mituu");

            pr.setString(2,"python");
            pr.setString(3,"nishchay");
            res=pr.executeUpdate();
            if(res>0)
            {
                System.out.println("Updated successFully");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
