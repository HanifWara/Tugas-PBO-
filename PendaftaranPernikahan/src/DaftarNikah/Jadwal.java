/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaftarNikah;
import java.util.ArrayList;


/**
 *
 * @author Acer
 */
public class Jadwal extends Pria {
    
    String id_jadwal,kegiatan,waktu;
    
    ArrayList<String> idjadwals;
    ArrayList<String> kegiatans;
    ArrayList<String> waktus;
    
    public Jadwal (){
    
    idjadwals = new ArrayList<>();
    kegiatans = new ArrayList<>();
    waktus = new ArrayList<>();
    }
    
    public Jadwal(String id, String kegiatan, String waktu){
     this.id_jadwal = id;
     this.kegiatan = kegiatan;
     this.waktu = waktu;
    }
    
    public void isiIDJADWAL(String id){
        idjadwals.add(id);
    }
    
    public ArrayList<String>getIDJADWAL(){
        return this.idjadwals;
    }
    
    public void inputIDJADWAL(String id){
            this.id_jadwal = id;
    }
    
    public String ambilIDJADWAL(){
        return this.id_jadwal;
    }
    
    public void isiKEGIATAN(String Kegiatan){
        kegiatans.add(kegiatan);
    }
    
    public ArrayList<String>getKEGIATAN(){
        return this.kegiatans;
    }
    
    public void inputKEGIATAN(String Kegiatan){
        this.kegiatan = Kegiatan;
    }
    
    public String ambilKEGIATAN(){
        return this.kegiatan;
    }
    
    public void isiWAKTU(String Waktu){
        waktus.add(waktu);
    }
    
    public ArrayList<String>getWAKTU(){
        return this.waktus;
    }
    
    public void inputWAKTU(String Waktu){
        this.waktu = Waktu;
    }
    
    public String ambilWAKTU(){
        return this.waktu;
    }
   
}
