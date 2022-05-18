package KitapYonetimiCozum03_Kutuphaneci_KullaniciGiris;

public class KitapClass {
    private String kitapAdı;
    private String yazar;
    private double kitapFiyatı;
    private int kitapAdedi;

    public KitapClass() {}

    protected KitapClass (String kitapAdı, String yazar, double kitapFiyatı) {
        this.kitapAdı=kitapAdı;
        this.yazar=yazar;
        this.kitapFiyatı=kitapFiyatı;
    }
    protected KitapClass (String kitapAdı, String yazar, int kitapAdedi, double kitapFiyatı) {
        this.kitapAdı=kitapAdı;
        this.yazar=yazar;
        this.kitapAdedi=kitapAdedi;
        this.kitapFiyatı=kitapFiyatı;
    }


}
