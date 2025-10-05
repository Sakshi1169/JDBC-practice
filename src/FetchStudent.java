import java.sql.*;

public class FetchStudent {
    public static void main(String[] args) {
        //to connect database
        //1)load
        String url ="jdbc:mysql://localhost:3306/spark"; //spark is db name
        String username="root";
        String password="Sakshi@5555";

        String query="select * from student"; //driver
        try {
            //1)load
            //Class.forName("com.mysql.cj.jdbc.Driver");--> optional after java 1.8 and jdbc 4 -->in intellij its allready in stmt class
            //2)connection established
            Connection con= DriverManager.getConnection(url,username,password);
            //cretae stmnt
            Statement stmt=con.createStatement(); //statment is use for execute static Query
            //4)execute query
            ResultSet resultSet =stmt.executeQuery(query);

            // get result--.retrive from resultset
            System.out.println("Id | Name | Age | Course");
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt("id")+ " | "+resultSet.getString("Name")+" | "
                        +resultSet.getInt("Age")+" | "+resultSet.getString("Course")+" | ");
            }




        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
    }
}
