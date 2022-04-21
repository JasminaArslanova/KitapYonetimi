package KitapYonetimi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitap {

    public  static int count = 1000;

    public static List<KitapListesi> Liste = new ArrayList();

    public static List<KitapListesi> KitapEkle(){

        Scanner scan= new Scanner (System.in);
        System.out.println("Kitap adini giriniz");
       String kitapAdi= scan.nextLine();
       System.out.println("Kitap Yazarını giriniz");
       String kitapYazari= scan.nextLine();
       System.out.println("Kitap No giriniz");
       int kitapNo= scan.nextInt();
        System.out.println("Kitap Fiyatı giriniz");
        int kitapFiyati= scan.nextInt();

        KitapListesi eklenenKitap = new KitapListesi(kitapNo, kitapAdi, kitapYazari, kitapFiyati);
        Liste.add (eklenenKitap);
        System.out.println("Kitap Başarıyla Eklendi");
                return Liste;

    }

}













