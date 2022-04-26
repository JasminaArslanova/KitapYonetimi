package KitapYonetimiCozum2;

import Kitap02.EklenenKitaplar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
    public static int kitapNo=1000;
   public static Map<Integer,Kitap> kitapMap=new HashMap<Integer,Kitap>();
   static Scanner scan=new Scanner(System.in);


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

       int islem= scan.nextInt();

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
                bilgiIleGoruntule();
                girisPaneli();
                break;
            case 4:
                numaraIleKitapSil();
                girisPaneli();
                break;
            case 5:
                kitaplariListele();
                girisPaneli();
                break;
            case 6:
                cikis();
                break;

            default:
                System.out.println("Gecerli islem numarasi giriniz");
        }}

    private static void kitaplariListele() {
    }

    private static void numaraIleKitapSil() {
    }

    private static void bilgiIleGoruntule() {
        System.out.println("Kitap adi ile aramak icin - 1\nKitap yazari ile aramak icin- 2");
        int islem= scan.nextInt();
        switch (islem){
            case 1:
                System.out.println("ad gir");
                scan.nextLine();
                String arananKitapAdi=scan.nextLine();

                for (Kitap each: kitapMap.values()) {
                    if( each.getKitapAdı().equalsIgnoreCase(arananKitapAdi)){
                        System.out.println("Kitap adi:  "+each.getKitapAdı()+"Kitap Yazari:  "+each.getYazar()+"Kitap fiyati:  "+each.getKitapFiyatı());
                    }else System.out.println("Girdiginiz adli kitap yok");}
                break;
            case 2:
                System.out.println("yazar gir");
                scan.nextLine();
                String arananYazarAdi=scan.nextLine();

                for (Kitap each: kitapMap.values()) {
                    if( each.getKitapAdı().equalsIgnoreCase(arananYazarAdi)){
                        System.out.println("Kitap adi:  "+each.getKitapAdı()+"Kitap Yazari:  "+each.getYazar()+"Kitap fiyati:  "+each.getKitapFiyatı());
                    }else System.out.println("Girdiginiz adli kitap yok");}
        }
    }

    private static void cikis() {
        System.out.println("Cikis yapildi");}

    private static void numaraIleKitapGoruntule() {
        System.out.println("aranan kitap numarasi giriniz");
        int arananNumara=scan.nextInt();

        if (kitapMap.containsKey(arananNumara)){
            System.out.println(arananNumara+" numarali:  "+ kitapMap.get(arananNumara));

        }else System.out.println("Girdiginiz numarada kitap bulunmadi");
    }

    public static void kitapEkleMethodu(){
        Scanner scan= new Scanner (System.in);
        System.out.println("Kitap adini giriniz");
        String kitapAdi= scan.nextLine();
        System.out.println("Kitap Yazarını giriniz");
        String kitapYazari= scan.nextLine();
        System.out.println("Kitap Fiyatı giriniz");
        double kitapFiyati= scan.nextInt();

        Kitap kitapObjesi= new Kitap(kitapAdi,kitapYazari,kitapFiyati);
        kitapMap.put(kitapNo,kitapObjesi);

        System.out.println(kitapMap);

        kitapNo++;

    }
}
