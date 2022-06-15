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
public class Beli {
 public void Harga(String a, int b){
     System.out.println(""+(a+b));
 }   
 public void Harga(String a, String b, String c){
     System.out.println(""+(a+b+c));
 }
 public void Harga(String a, double b){
     System.out.println("Harga "+(a+b));
 }
}
