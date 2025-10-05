import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/spark";
        ; //spark is db name
        String username="root";
        String password="Sakshi@5555";

        String inserQuery="INSERT INTO student(name, age, course) VALUES (?,?,?)"; //driver
        try {
            //1)load
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //2)connection established
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pr=con.prepareStatement(inserQuery);
            //1
            pr.setString(1,"satyam");
            pr.setInt(2,21);
            pr.setString(3,"dsa");
            pr.executeUpdate();

            //2
            pr.setString(1,"salman");
            pr.setInt(2,50);
            pr.setString(3,"Acting");
            pr.executeUpdate();
            //3
            pr.setString(1,"samarth");
            pr.setInt(2,56);
            pr.setString(3,"dsa");
            pr.executeUpdate();
            System.out.println("Data inserted ...");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    }

