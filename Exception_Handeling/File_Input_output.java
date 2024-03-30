package Exception_Handeling;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

public class File_Input_output {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo","root","root");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("chutiya hai kya kuch bhi type karega");
        con.close();
        }

    }
}
