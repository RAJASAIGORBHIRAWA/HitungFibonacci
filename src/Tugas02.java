
import java.util.Scanner;


public class Tugas02 {
    public static void main(String[] args) {
        System.out.println("Rajasa Igor Bhirawa / X RPL 3 / 33");
        
        System.out.println(" 7 KG = Rp 10.000");
        System.out.println(" 5 KG = Rp 7.000");
        System.out.println(" 4 KG = Rp 5.000");
        System.out.println(" 3 KG = Rp 3.000");
        System.out.println(" 2 KG = Rp 2.000");
        int[] Berat = new int[]{7, 5, 4, 3, 2};
        int[] Harga = new int[]{10000, 7000, 5000, 3000, 2000};
        
        int berat = input();
        
        Proses(berat, Berat, Harga);
    }
    private static int input()
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("berat barang : ");
        int berat = baca.nextInt();
        
        return berat;
    }
    private static void Proses(int berat, int[] Berat, int[] Harga) {
        int jumlah = 0;
        for(int i = 0; i < Berat.length; i++)
        {
            int n = 0;
            while(berat >= Berat[i])
            {
                berat = berat - Berat[i];
                n++;
            }
            int total = n * Harga[i];
            System.out.println(Berat[i] + " Kg" + "Sebanyak " + n + " dengan total harga Rp " + total);
            jumlah = jumlah + total;
        }
        System.out.println("\nTotal Bayaran : Rp " + jumlah);
        
    }
    
    
    
    
}
