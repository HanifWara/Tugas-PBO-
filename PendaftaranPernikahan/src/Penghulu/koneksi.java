/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penghulu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;   

/**
 *
 * @author Acer
 */
public class koneksi {
    
    private String databaseName = "dbpernikahan";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    public koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        } catch (Exception e){
            System.err.println(e.toString());
        }
    }
    public void Simpanjadwal(int paramidjadwal, String paramkegiatan, String paramwaktu, String paramidpria,
            String paramnik,String paramnama,String paramalamat){
        
        try {
            String SQL = "INSERT INTO jadwal(id_jadwal, kegiatan, waktu, id_pria, nik, nama, alamat)"
                    + "VALUES(?,?,?,?,?,?,?)";
        
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramidjadwal);
            perintah.setString(2, paramkegiatan);
            perintah.setString(3, paramwaktu);
            perintah.setString(4, paramidpria);
            perintah.setString(5, paramnik);
            perintah.setString(6, paramnama);
            perintah.setString(7, paramalamat);
            perintah.executeUpdate();
                System.out.println("Data Berhasil diSimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Ubahjadwal(int paramidjadwal, String paramkegiatan, String paramwaktu, String paramidpria,
            String paramnik,String paramnama,String paramalamat){
        
        try {
            String SQL = "UPDATE jadwal SET kegiatan=?, waktu=?, id_pria=?," 
                    + "nik=?, nama=?, alamat=? WHERE id_jadwal=?";
        
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, paramkegiatan);
            perintah.setString(2, paramwaktu);
            perintah.setString(3, paramidpria);
            perintah.setString(4, paramnik);
            perintah.setString(5, paramnama);
            perintah.setString(6, paramalamat);
            perintah.setInt(7, paramidjadwal);
            perintah.executeUpdate();
                System.out.println("Data Berhasil diUbah");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Hapusjadwal(int paramidjadwal){
        try{
            String SQL = "DELETE FROM jadwal WHERE id_jadwal=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramidjadwal);
            perintah.executeUpdate();
            System.out.println("Data Berhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void Carijadwal(int paramidjadwal){
       try{
           String SQL = "SELECT * FROM jadwal WHERE id_jadwal=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, paramidjadwal);
           ResultSet data = perintah.executeQuery();
           while(data.next()){
               System.out.println("id_jadwal : "+data.getInt("id_jadwal"));
               System.out.println("kegiatan : "+data.getString("kegiatan"));
               System.out.println("waktu : "+data.getString("waktu"));
               System.out.println("id_pria : "+data.getString("id_pria"));
               System.out.println("nik : "+data.getString("nik"));
               System.out.println("nama : "+data.getString("nama"));
               System.out.println("alamat : "+data.getString("alamat"));            
           }
       } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void Datajadwal(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM jadwal  ORDER BY id_jadwal ASC");
            while(baris.next()){
            System.out.println(baris.getInt("id_jadwal")+" | "+
                                baris.getString("kegiatan")+" | "+
                                baris.getString("waktu")+" | "+
                                baris.getString("id_pria")+" | "+
                                baris.getString("nik")+" | "+
                                baris.getString("nama")+" | "+
                                baris.getString("alamat"));
                                 
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
