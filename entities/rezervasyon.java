package entities;

public class Rezervasyon {
    private Ucus ucus;
    private String ad;
    private String soyad;
    private int yas;

    public Rezervasyon(Ucus ucus, String ad, String soyad, int yas) {
        this.ucus = ucus;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public Ucus getUcus() { return ucus; }
    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public int getYas() { return yas; }

    public String toString() {
        return ad + " " + soyad + " (" + yas + " yaş) - " + ucus.toString();
    }
}
