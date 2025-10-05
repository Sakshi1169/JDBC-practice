import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create_Operation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/data";
        ; //spark is db name
        String username="root";
        String password="Sakshi@5555";
        String insertQuery="INSERT INTO boys(name, age, course) VALUES (?,?,?)";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pr=con.prepareStatement(insertQuery);
            pr.setString(1,"Sajit");
            pr.setInt(2,88);
            pr.setString(3,"Java");
            int res=pr.executeUpdate();

            //2
            pr.setString(1,"Sabar");
            pr.setInt(2,88);
            pr.setString(3,"cpp");
            res=pr.executeUpdate();

            //3
            pr.setString(1,"nishchay");
            pr.setInt(2,82);
            pr.setString(3,"python");
            res=pr.executeUpdate();
            if(res>0)
            {
                System.out.println("Created successFully");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
