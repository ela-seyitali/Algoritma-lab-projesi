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
  
}
