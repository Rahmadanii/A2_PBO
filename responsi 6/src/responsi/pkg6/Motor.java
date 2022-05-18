/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.pkg6;

/**
 *
 * @author Asus
 */
public class Motor {
    public static void main(String[] args){
        System.out.println("Nama        : " + Responsi6.Nama);
    }
}

class inter implements Responsi6 {
    
    @Override
    public void Matic(){
        System.out.println("Ini motor matic");
    };
    @Override
    public void Kopling(){
        System.out.println("Ini motor Kopling");
    };

}
