package kullanicihizmeti;
// ************************************ onemli **************************************
//1/ yeni kayit icin main sınıfından çağırma yap. Verileri arrayde sakla ondan 
//sonra Dosya sınıfın nesnesini kullanarak verileri istediğin txt dosyasına yazdır..
//2/ şifreleri kur , şifreler Data base te saklanması gerekiyor muuuuu ? evet bence

public class Kullanici {

    String adSoyad;
    String rol;
    String telefonNo;
    private boolean yurttaMi;
    String gorev;
 private String toString;
    Kullanici() {
    }

    Kullanici(String adSoyad, String rol, String telefonNo, boolean yurttaMi) {

        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;
        this.yurttaMi = yurttaMi;
    }

    void setYurttaMi(boolean yurttaMi) {
        this.yurttaMi = yurttaMi;
    }
  
    String getStringYurttaMi() {
        if (yurttaMi) {
           toString = "true";
        } else if (!yurttaMi) {
            toString = "false";
        }
        return toString;
                
    }

    void GorevliYeniKayit(String adSoyad, String rol, String telefonNo, String gorev) {
// txt dosyasında eğer bu bilgiler varsa "bu kullanıcı zaten kayıtlıdır" yazılır. 
// bu bilgiler yoksa şifre oluşturmak üzere GirisCikis sınıfından yeni nesne oluşturup parola oluşturulur
//                       bu  işlemler main sayfasında tedkik edilir.

        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;
        this.gorev = gorev;
// bu bilgileri txt dosyasına kaydetme kodunu yaz. ardından main sayfasında password oluşturup onu da txt dosyasına ekle
    }

    void OgrenciYeniKayit(String adSoyad, String rol, String telefonNo) {
// txt dosyasında eğer bu bilgiler varsa "bu kullanıcı zaten kayıtlıdır" yazılır. 
// bu bilgiler yoksa şifre oluşturmak üzere GirisCikis sınıfından yeni nesne oluşturup parola oluşturulur
//                       bu  işlemler main sayfasında tedkik edilir.

        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;

// bu bilgileri txt dosyasına kaydetme kodunu yaz. ardından main sayfasında password oluşturup onu da txt dosyasına ekle
    }

    void yurdaGiris() {
        if (yurttaMi) {
            System.out.println("Zaten yurttasiniz..");
        } else {
            yurttaMi = true;
        }

    }

    void yurttanCikis() {
        if (yurttaMi) {
            yurttaMi = false;
        } else {
            System.out.println("Zaten yurtta degilsiniz..");
        }
    }
}
