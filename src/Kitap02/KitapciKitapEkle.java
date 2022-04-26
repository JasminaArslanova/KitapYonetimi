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
        System.out.println("//////////////// KİTAP YONETIMI PROGRAMI //////////////////");
        System.out.println(
                "1-kitap ekle\n" +
                        "	2-numara ile kitap goruntule\n" +
                        "	3-bilgi ile kitap goruntule\n"+
                        "	4-numara ile kitap sil\n" +
                        "	5-tum kitaplari listele\n" +
                        "	6-cikis ");
        System.out.print("Isleminizi secisiniz: ");

        islem= scan.nextInt();

        switch (islem){

            case 1:
               kitapEkleMethodu();
               girisPaneli();

                break;
            case 2:
                numaraIleKitapGoruntule();
                girisPaneli();
                break;
            case 3:
                girisPaneli();
                break;
            case 4:
                girisPaneli();
                break;
            case 5:
                girisPaneli();
                break;
            case 6:
                cikis();
                break;

            default:
                System.out.println("Gecerli islem numarasi giriniz");
        }}

    private static void cikis() {
        System.out.println("Cikis yapildi");
    }

    private static void numaraIleKitapGoruntule() {
        System.out.println("aranan kitap numarasi giriniz");
        int arananNumara=scan.nextInt();
        for (EklenenKitaplar each: kitapListesi) {
            if(each.getKitapNo()==arananNumara){
                System.out.println("Kitap No: "+ each.getKitapNo()+"  kitap Adi: "+each.getKitapAdı()+"  kitap Yazari: "+each.getYazar()
                +" Kitap Fiyati: "+each.getKitapFiyatı());
            }else System.out.println("girdiginiz numarada kitap bulunmadi");

        }

    }

    public static void kitapEkleMethodu(){
        Scanner scan= new Scanner (System.in);
        System.out.println("Kitap adini giriniz");
        String kitapAdi= scan.nextLine();
        System.out.println("Kitap Yazarını giriniz");
        String kitapYazari= scan.nextLine();
        System.out.println("Kitap Fiyatı giriniz");
        double kitapFiyati= scan.nextInt();

        EklenenKitaplar eklenenKitapOBJE = new EklenenKitaplar(count,kitapAdi, kitapYazari, kitapFiyati);
        kitapListesi.add(eklenenKitapOBJE);

        System.out.println("Kitap Başarıyla Eklendi");
        System.out.println(kitapListesi);

        count++;

    }
}
