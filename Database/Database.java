package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lowonganpekerjaan.Pelamar;
import lowonganpekerjaan.Perusahaan;
import lowonganpekerjaan.BerkasLamaran;
import lowonganpekerjaan.Lowongan;

public class Database {
    
    private Connection con;
    
    public void connect(){
        String url= "jdbc:mysql://localhost:3306/lowonganpekerjaan";
        String username = "root";
        String password = "";
        try{
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            con.setAutoCommit(false);
            System.out.println("Connected");
        }catch(SQLException e){
            System.out.println("Gagal Connect");
        }
    }
    public void savePelamar(Pelamar p){
        try{
            Statement s= con.createStatement();
            String query = "insert Into Pelamar Values("
                    +p.getId()+", '"
                    +p.getTanggal()+"', '"
                    +p.getNama()+"', "
                    +");";
            s.execute(query);
            con.commit();
            s.close();
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan Pada Input Data Pelamar");
        }
    }
    public void savePerusahaan(Perusahaan ph){
        try{
            Statement s = con.createStatement();
            String query = " Insert Into Perusahaan values("
                    +ph.IDPerusahaan()+", '"
                    +ph.getNama()+"', "
                    +ph.getNamaP()+"', "
                    +ph.getTanggal()+"', '"
                    +");";
            s.execute(query);
            con.commit();
            s.close();
            
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada input Data Perusahaan");
        }
    }
    public void saveBerkasLowongan(BerkasLamaran b){
        try{
            Statement s = con.createStatement();
            String query = "Insert into Berkas Lamaran values( "
                    +b.getIdLamaran()+", '"
                    +b.getEdukasi()+"', "
                    +b.getPengalaman()+"', "
                    +b.getStatus()+"', "
                    +");";
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada input berkas lamaran");
        }
    }
    public void saveLowongan(Lowongan l){
        try{
            Statement s = con.createStatement();
            String query ="Insert into Lowongan values("
                    +l.getJenis()+"', "
                    +l.getReq()+"', "
                    +");";
        }catch(Exception e){
            System.out.println("Terjadi kesalahan saat input lowongan");
        }
    }
    public Pelamar loadPelamar(Pelamar p){
        Pelamar plm = null;
        try{
            Statement s = con.createStatement();
            String query = "Insert into loadPelamar values("
                    +plm.getId()+", ' "
                    +");";
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan saat load Pelamar");
        }
        return null;
    }    
}
