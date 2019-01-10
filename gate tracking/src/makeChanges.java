
import java.sql.*;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author negi
 */
public class makeChanges {

    String table;

    public makeChanges(String tablename) {
        table = tablename;
    }

    public void change(JCheckBox j, int id) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gate", "root", "negi");
            String sql;

            if (j.isSelected() == true) {
                sql = "update " + table + " set status='yes' where id=" + id + ";";
            } else {
                sql = "update " + table + " set status='no' where id=" + id + ";";
            }

            Statement st = con.createStatement();
            int i = st.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void show(JCheckBox[] cb) {

        try {
            int i = 1;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gate", "root", "negi");

            String sql;
            sql = "select status from " + table + ";";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString(1).equals("yes")) {
                    cb[i].setSelected(true);
                }
                i++;
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
