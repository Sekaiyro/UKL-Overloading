/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Adrian
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Beli beli = new Beli();
     beli.Harga ("Berapa Harga Pisang? ", 9000);
     beli.Harga("Apakah Pisang Ini Segar? ", "Yaa"," Segar");
     beli.Harga("Apakah Manis? ", "Yaa"," Manis");
    }
    
}
