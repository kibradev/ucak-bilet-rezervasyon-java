package entities;

public class Lokasyon {
    private String ulke;
    private String sehir;
    private String havalimanı;
    private boolean aktif;

    public Lokasyon(String ulke, String sehir, String havalimanı, boolean aktif) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.havalimanı = havalimanı;
        this.aktif = aktif;
    }

    public String getUlke() { return ulke; }
    public String getSehir() { return sehir; }
    public String getHavalimanı() { return havalimanı; }
    public boolean isAktif() { return aktif; }

    public String toString() {
        return sehir + ", " + ulke + " - " + havalimanı + (aktif ? " (Aktif)" : " (Pasif)");
    }
}
