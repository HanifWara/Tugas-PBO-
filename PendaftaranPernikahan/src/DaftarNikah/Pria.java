/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaftarNikah;

/**
 *
 * @author Acer
 */
public class Pria {
    
    String id_pria,nik ,nama,alamat;
    
    public Pria(){}
    
    public void inputIDPRIA(String id){
            this.id_pria = id;
    }
    
    public String ambilIDPRIA(){
        return this.id_pria;
    }
    
    public void inputNIK(String Nik){
        this.nik = Nik;
    }
    
    public String ambilNIK(){
        return this.nik;
    }
    
    public void inputNAMA(String Nama){
        this.nama = Nama;
    }
    
    public String ambilNAMA(){
        return this.nama;
    }
    
    public void inputALAMAT(String Alamat){
        this.alamat = Alamat;  
    }
    
    public String ambilALAMAT(){
        return this.alamat; 
    }
}
