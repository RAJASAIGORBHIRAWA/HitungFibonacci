/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        
        System.out.println("Rajasa Igor Bhirawa / X RPL 3 / 33");
        System.out.println("pecahannya adalah Rp 5.000, Rp 2.000, Rp 1.000, Rp 500, Rp 100");
        int uang = input();
        int[] Nominal = new int[]{5000, 2000, 1000, 500, 100};
        
        JumlahUang(uang, Nominal);
    }
    
    private static int input()
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Jumlah Uang = Rp ");
        int uang = baca.nextInt();
        
        return uang;
    }
    
    

    
}
