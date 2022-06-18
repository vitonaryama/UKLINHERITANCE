/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.inheritance;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Murid extends Guru{
    //deklarasi variable
    double nilaimax=99.9;
    String nama;
    int age = 16;
    String kelas;
    
    //deklarasi method mutator
    public void setnama(String nama){
        this.nama=nama;
        
    }
    public void setkelas(String kelas){
        this.kelas=kelas;
    }
    //deklarasi method cetak
    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama"+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        System.out.println("kelas "+kelas);
        super.hobbi(); //keyword super untuk memanggil variable/method di class induk
    }
}
