package KitapYonetimi;

import java.util.Scanner;

public class Methodlar {
    public static boolean flag=true;
    public static int islem;
    static Scanner scan=new Scanner(System.in);

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
                KitapEkle.kitapEkleMethodu();

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

}
