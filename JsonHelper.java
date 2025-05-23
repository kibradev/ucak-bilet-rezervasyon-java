import entities.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonHelper {
    public static void rezervasyonKaydet(List<Rezervasyon> rezervasyonlar, String dosyaAdi) {
        try {
            FileWriter fw = new FileWriter(dosyaAdi);
            fw.write("[\n");
            for (int i = 0; i < rezervasyonlar.size(); i++) {
                Rezervasyon r = rezervasyonlar.get(i);
                fw.write("  {\n");
                fw.write("    \"ad\": \"" + r.getAd() + "\",\n");
                fw.write("    \"soyad\": \"" + r.getSoyad() + "\",\n");
                fw.write("    \"yas\": " + r.getYas() + ",\n");
                fw.write("    \"ucus\": \"" + r.getUcus().toString().replace("\"", "'") + "\"\n");
                fw.write("  }" + (i < rezervasyonlar.size()-1 ? "," : "") + "\n");
            }
            fw.write("]");
            fw.close();
            System.out.println("Rezervasyonlar dosyaya kaydedildi: " + dosyaAdi);
        } catch (IOException e) {
            System.out.println("Dosyaya yazılamadı: " + e.getMessage());
        }
    }
}
