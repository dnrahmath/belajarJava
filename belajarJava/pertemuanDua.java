package belajarJava;

//button-event
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
//gui
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
//button
import java.awt.event.*; 
import javax.swing.*;

//----------------------------------------------

//koneksi
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//----------------------------------------------

import java.util.Scanner;  // tidak dapat direalisasikan pada saat gui berjalan


//public class pertemuanDua extends JFrame implements ActionListener {
public class pertemuanDua extends JFrame {
    
      // JFrame
      static JFrame jF;
      // JButton 
      static JButton varBtnNext,varBtnJalan; 
      
      static int b;
      static int i = 0;
      
      //public static void main(String[] args){ 
      pertemuanDua(String[] args){ 
          
        //---------------------------------------------------
        
        jF = new JFrame("Pertemuan 2");
        
        //view11-1
        // create a panel 
        JPanel jP = new JPanel(); 
        
        //---------------------------------------------------
        
        
        
        //view05-1
        varBtnNext = new JButton("Next CRUD Mode !!");
        varBtnNext.setBounds(50, 40, 330, 80);
        // posisi x, posisi y, panjang x , panjang y
        varBtnNext.setName("btnNext");
        varBtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnNextActionPerformed(evt);
            }
        });
        
        
        
        //view04-1
        varBtnJalan = new JButton("Jalankan !!");
        varBtnJalan.setBounds(50, 160, 330, 80);
        varBtnJalan.setName("btnJalan");
        varBtnJalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnJalanActionPerformed(evt);
            }
        });
        
        
        
        // tambahkan Button
        jF.add(varBtnJalan); 
        jF.add(varBtnNext); 
        
        // tambahkan panel to frame 
        jF.add(jP);
        
        
        //---------------------------------------------------
        
        // set the size of frame 
        jF.setSize(440, 320); 
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);
        
        jF.show(); 
        
        System.out.println("ini mode ke = " + i);
      }
      
      
      //view04-2
      //event btn
      private static void btnNextActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        System.out.print("\u000c"); //Membersihkan Layar
          
        //b = 1;
        
        //System.out.println(b);
        
        //System.out.println("Output SQL. Next MODE = Create / Read / Update / Delete ");
        
        
        if (i > 2) {
            i = 0 ;
        } else {
            i = i + 1 ;
        }
        
        System.out.println("ini mode ke = " + i);
      }
      private javax.swing.JButton btnNext;//btnNext
      
      
      //view04-2
      //event btn
      private static void btnJalanActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        String x = "6";             //Id
        String y = "Antibiotik";    //Nama
        String z = "Sulfa";         //Kandungan
          
        //b = 2;
        //System.out.println(b);
        
        //System.out.println("Output SQL. Jalan..");
        
        
        if (i == 0) {
          SqlInsert SIns = new SqlInsert(x,y,z);  //Create
          System.out.println("ini Create\n");
        } else if (i == 1) {
          SqlSelect SSel = new SqlSelect(x,y,z);  //Read
          System.out.println("ini Read\n");
        } else if (i == 2) {
          SqlUpdate SUpd = new SqlUpdate(x,y,z);  //Update
          System.out.println("ini Update\n");
        } else if (i == 3) {
          SqlDelete SDel = new SqlDelete(x,y,z);  //Delete
          System.out.println("ini Delete\n");
        } else {
          //i = 0 ;
        }
          
      }
      private javax.swing.JButton btnJalan;//btnJalan
      

}



//Create
class SqlInsert {  
      SqlInsert(String id_obat, String nama_obat, String kandungan) {  
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:C:/Users/Family/Downloads/CRUD_Data_Obat-main/CRUD_Data_Obat-main/CRUDdataObatdb.db"; 
            Connection conn = DriverManager.getConnection(dbURL);
            
            if (conn != null) {
                Statement st=conn.createStatement();        
                String sql ="INSERT INTO list_obat VALUES ("+id_obat+",'"+nama_obat+"', '"+kandungan+"');"; //SQL-INSERT
                st.executeUpdate (sql);
                conn.close();
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


//Read
class SqlSelect {
        
    //String dataSatu[][]=new String[20][5]; //Data-Array Yang di Transfer 
    
    SqlSelect(String id_obat, String nama_obat, String kandungan) {  
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:C:/Users/Family/Downloads/CRUD_Data_Obat-main/CRUD_Data_Obat-main/CRUDdataObatdb.db"; 
            Connection conn = DriverManager.getConnection(dbURL);
            
            if (conn != null) {
                int berhitung=0;
                

                Statement st=conn.createStatement();        
                ResultSet rs=st.executeQuery("SELECT * FROM list_obat;");
              
               
                System.out.println(String.format("%s", "-------------------------------------------------------"));
                System.out.println(String.format("%3s %3s %10s %10s %5s", "ID", "|", "Nama", "\t |", "Kandungan"));
                System.out.println(String.format("%s", "-------------------------------------------------------"));

                while(rs.next())
                {
                   
                 System.out.println(String.format("%3s %3s %10s %10s %5s", rs.getString(1), "|", rs.getString(2), "\t |", rs.getString(3) ));
                
                }
                System.out.println(String.format("%s", "-------------------------------------------------------"));


                conn.close();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}


//Update
class SqlUpdate {
      SqlUpdate(String id_obat, String nama_obat, String kandungan) {  
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:C:/Users/Family/Downloads/CRUD_Data_Obat-main/CRUD_Data_Obat-main/CRUDdataObatdb.db"; 
            Connection conn = DriverManager.getConnection(dbURL);
            
            if (conn != null) {
                Statement st=conn.createStatement();        
                String sql ="UPDATE list_obat SET nama_obat='"+nama_obat+"',kandungan='"+kandungan+"' WHERE id_obat="+id_obat+";"; //SQL-UPDATE
                st.executeUpdate (sql);
                conn.close();
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


//Delete
class SqlDelete {
      SqlDelete(String id_obat, String nama_obat, String kandungan) {  
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:C:/Users/Family/Downloads/CRUD_Data_Obat-main/CRUD_Data_Obat-main/CRUDdataObatdb.db"; 
            Connection conn = DriverManager.getConnection(dbURL);
            
            if (conn != null) {
                Statement st=conn.createStatement();        
                String sql = "DELETE FROM list_obat WHERE id_obat="+id_obat+";"; //SQL-DELETE
                st.executeUpdate (sql);
                conn.close();
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     }
}