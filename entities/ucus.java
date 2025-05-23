package entities;

import java.time.LocalDateTime;

public class Ucus {
    private Lokasyon kalkis;
    private Lokasyon varis;
    private LocalDateTime saat;
    private Ucak ucak;
    private int rezerveKoltuk;

    public Ucus(Lokasyon kalkis, Lokasyon varis, LocalDateTime saat, Ucak ucak) {
        this.kalkis = kalkis;
        this.varis = varis;
        this.saat = saat;
        this.ucak = ucak;
        this.rezerveKoltuk = 0;
    }

    public Lokasyon getKalkis() { return kalkis; }
    public Lokasyon getVaris() { return varis; }
    public LocalDateTime getSaat() { return saat; }
    public Ucak getUcak() { return ucak; }
    public int getRezerveKoltuk() { return rezerveKoltuk; }

    public boolean koltukAyir() {
        if(rezerveKoltuk < ucak.getKapasite()) {
            rezerveKoltuk++;
            return true;
        }
        return false;
    }

    public String toString() {
        return kalkis + " -> " + varis + " | " + saat + " | " + ucak;
    }
}
