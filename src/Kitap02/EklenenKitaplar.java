package Kitap02;

public class EklenenKitaplar {

    public int kitapNo;
    public String kitapAdı;
    public String yazar;
    public double kitapFiyatı;

    public EklenenKitaplar() {}

    public EklenenKitaplar (int kitapNo, String kitapAdı, String yazar, int kitapFiyatı) {
        this.kitapNo=KitapciKitapEkle.count;
        this.kitapAdı=kitapAdı;
        this.yazar=yazar;
        this.kitapFiyatı=kitapFiyatı;
    }
}
