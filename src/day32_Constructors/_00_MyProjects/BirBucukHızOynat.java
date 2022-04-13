package day32_Constructors._00_MyProjects;

import java.util.Scanner;

public class BirBucukHızOynat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Saati gir: ");
        int saat =scan.nextInt();


        System.out.println("Dakikayı gir: ");
        int dk =scan.nextInt();

        System.out.println("Başlayacağın saati gir: ");
        int baslaSaat =scan.nextInt();

        System.out.println("Başlayacağın dakikayı gir: ");
        int baslaDk =scan.nextInt();

        int TotalDk = (saat * 60) + dk;

        System.out.println("Girilen Toplam Dakika = " + TotalDk + "dk  ---> "+ saat + "saat " + dk +"dk");

        int kalanDk = TotalDk*2/3;
        int kalanSaat= kalanDk/60;
        int kalanDk1= kalanDk%60;
        System.out.println("    1.5 hız için      = " + kalanDk + "dk  ---> " + kalanSaat + "saat " + kalanDk1 +"dk");

        if (kalanDk1>dk) {
            saat = saat - 1;
            dk = 60 + dk;
        }

        int kazanDk = dk - kalanDk1;
        int kazanSaat = saat - kalanSaat;

        System.out.println("  Kazanılan Zaman   --------------> " + kazanSaat + "saat " + kazanDk +"dk" );

        System.out.println("__________________________________________________\n");

        int bitDk = baslaDk + kalanDk1;
        int bitSaat = baslaSaat + kalanSaat;

        if (bitDk>=60) {
            bitSaat+=1;
            bitDk-=60;
        }

        System.out.println( baslaSaat + "." +baslaDk + "\'da basladım. Ara vermezsem, " + bitSaat+ "." +bitDk + "\'da bitecek.  " );

        System.out.println("__________________________________________________\n");
    }

}
