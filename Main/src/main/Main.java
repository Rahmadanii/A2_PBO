/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.until.Scanner;


public class Main {
    public static void main(String[] args) {
       Motor beatFi = new Beat();
       Motor Rahma = new MotorRahma (beatFi);
       rahma.menghidupkanMotor();
       
       Scanner input = new Scanner(System.in);
       String aksi;
       
       while (true) {
           System.out.println("--- APLIKASI INTERFACE PADA MOTOR ---");
           System.out.println(" 1. Hidupkan Motor");
           System.out.println(" 2. Matikan Motor");
           System.out.println(" 3. Percepat Kecepatan");
           System.out.println(" 4. Perkecil Kecepatan");
           System.out.println(" 0. Keluar");
           System.out.println("-------------------------------------");
           System.out.println("Pilih aksi> ");
           aksi = input.nextLine();
           
           if (aksi.equalsIgnoreCase("1")){
               rahma.menghidupkanMotor();
           } else if (aksi.equalsIgnoreCase("2")){
               rahma.mematikanMotor();
           } else if (aksi.equalsIgnoreCase ("3")){
               rahma.kecepatanMotorNaik();
           } else if (aksi.equalsIgnoreCase ("4")) {
               rahma.
           }
       }
    }
    
}
