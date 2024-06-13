package kullanicihizmeti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Dosya {

    private String dosyaYolu;

    public Dosya() {
    }

    public Dosya(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    void setDosyaYolu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    String getDosyaYolu() {
        return dosyaYolu;
    }

    // Dosyaya veri yazma metodu
    public void dosyayaYaz(String[] veriler) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu, true))) {
            for (String veri : veriler) {
                writer.write(veri + ", ");

            }
            writer.newLine();
        }
    }

    // Dosyadan veri okuma metodu
    public void dosyadanOku() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
        String satir = br.readLine();
        while (satir != null) {
            System.out.println(satir);
            satir = br.readLine();

        }

    }

    public boolean dosyaMevcutMu() {
        File file = new File(dosyaYolu);
        return file.exists() && !file.isDirectory();
    }
    /* 
public String[] dosyadanOku() throws IOException {
        // Geçici olarak 100 satır kapasiteli bir dizi kullanıyoruz
        String[] veriler = new String[100];
        int index = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = reader.readLine()) != null && index < veriler.length) {
                veriler[index++] = satir;
            }
        }

        // Sonuç dizisini kesin boyutunda döndürüyoruz
        String[] sonuc = new String[index];
        System.arraycopy(veriler, 0, sonuc, 0, index);
        return sonuc;
    }
     */
}
