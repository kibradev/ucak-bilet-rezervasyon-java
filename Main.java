import entities.*;
import java.util.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dummy data
        Ucak ucak1 = new Ucak("737", "Boeing", "SN1001", 5);
        Ucak ucak2 = new Ucak("A320", "Airbus", "SN2002", 3);

        Lokasyon lok1 = new Lokasyon("Türkiye", "İstanbul", "IST", true);
        Lokasyon lok2 = new Lokasyon("Almanya", "Berlin", "BER", true);

        Ucus ucus1 = new Ucus(lok1, lok2, LocalDateTime.of(2025,5,26,13,0), ucak1);
        Ucus ucus2 = new Ucus(lok2, lok1, LocalDateTime.of(2025,5,27,14,30), ucak2);

        List<Ucus> ucuslar = new ArrayList<>();
        ucuslar.add(ucus1);
        ucuslar.add(ucus2);

        List<Rezervasyon> rezervasyonlar = new ArrayList<>();

        while(true) {
            System.out.println("\n1) Uçuşları Listele\n2) Rezervasyon Yap\n3) Rezervasyonları Göster\n4) Kaydet ve Çık");
            System.out.print("Seçim: ");
            int secim = sc.nextInt();
            sc.nextLine();

            if(secim == 1) {
                for(int i=0; i<ucuslar.size(); i++) {
                    System.out.println((i+1) + ") " + ucuslar.get(i));
                }
            } else if(secim == 2) {
                System.out.print("Uçuş numarası: ");
                int ucusNo = sc.nextInt()-1;
                sc.nextLine();

                if(ucusNo >= 0 && ucusNo < ucuslar.size()) {
                    Ucus seciliUcus = ucuslar.get(ucusNo);
                    if(seciliUcus.koltukAyir()) {
                        System.out.print("Ad: ");
                        String ad = sc.nextLine();
                        System.out.print("Soyad: ");
                        String soyad = sc.nextLine();
                        System.out.print("Yaş: ");
                        int yas = sc.nextInt();
                        sc.nextLine();
                        Rezervasyon rez = new Rezervasyon(seciliUcus, ad, soyad, yas);
                        rezervasyonlar.add(rez);
                        System.out.println("Rezervasyon başarılı!");
                    } else {
                        System.out.println("Koltuk kalmadı amk!");
                    }
                } else {
                    System.out.println("Yanlış uçuş seçtin aw.");
                }
            } else if(secim == 3) {
                if(rezervasyonlar.isEmpty()) System.out.println("Hiç rezervasyon yok.");
                for (Rezervasyon r : rezervasyonlar) System.out.println(r);
            } else if(secim == 4) {
                JsonHelper.rezervasyonKaydet(rezervasyonlar, "rezervasyonlar.json");
                System.out.println("Çıkılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim, birader.");
            }
        }
    }
}
