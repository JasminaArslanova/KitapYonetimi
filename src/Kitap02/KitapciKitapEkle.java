package Kitap02;

import KitapYonetimi.KitapEkle;
import KitapYonetimi.KitapListesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapciKitapEkle {

    public static int count=1000;
    public static List<EklenenKitaplar> kitapListesi=new ArrayList<>();
    public static int islem;
    static Scanner scan=new Scanner (System.in);
    public static  EklenenKitaplar eklenenKitapOBJE = new EklenenKitaplar();


    public static void girisPaneli(){
        System.out.println("//////////////// KİTAPCI PROGRAMI //////////////////");
        System.out.println(
                " 	1-kitap ekle\n" +
                        "	2-numara ile kitap goruntule\n" +
                        "	3-bilgi ile kitap goruntule\n"+
                        "	4-numara ile kitap sil\n" +
                        "	5-tum kitaplari listele\n" +
                        "	6-cikis ");
        islem= scan.nextInt();

        switch (islem){

            case 1:
               kitapEkleMethodu();

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

            default:
                System.out.println("Gecerli islem numarasi giriniz");
        }}

    public static List<EklenenKitaplar> kitapEkleMethodu(){
        Scanner scan= new Scanner (System.in);
        System.out.println("Kitap adini giriniz");
        String kitapAdi= scan.nextLine();
        System.out.println("Kitap Yazarını giriniz");
        String kitapYazari= scan.nextLine();
        System.out.println("Kitap Fiyatı giriniz");
        int kitapFiyati= scan.nextInt();

        EklenenKitaplar eklenenKitapOBJE = new EklenenKitaplar(count,kitapAdi, kitapYazari, kitapFiyati);
        kitapListesi.add(eklenenKitapOBJE);

        System.out.println(kitapListesi);
        System.out.println("Kitap Başarıyla Eklendi");
        return kitapListesi;
    }
}
