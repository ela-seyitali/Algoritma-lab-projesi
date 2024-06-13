package kullanicihizmeti;

public class Kullanici {
// değişkenleri tanımlama

    String adSoyad;
    String rol;
    String telefonNo;
    private boolean yurttaMi;
    String gorev;
    private String toString;

    // default (Argumansız\Parametresiz) constructor oluşturma
    Kullanici() {
    }
// parametreli constructor
    Kullanici(String adSoyad, String rol, String telefonNo, boolean yurttaMi) {

        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;
        this.yurttaMi = yurttaMi;
    }

    void setYurttaMi(boolean yurttaMi) {
        this.yurttaMi = yurttaMi;
    }
// verileri txt dosyasına yazdırmadan önce String dizisinde saklıyoruz.. o yuzden yurttaMi değişkenini boolean'den String'e dönüştürdük..
    String getStringYurttaMi() {
        if (yurttaMi) {
            toString = "true";
        } else if (!yurttaMi) {
            toString = "false";
        }
        return toString;

    }

    void GorevliYeniKayit(String adSoyad, String rol, String telefonNo, String gorev) {

        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;
        this.gorev = gorev;
    }

    void OgrenciYeniKayit(String adSoyad, String rol, String telefonNo) {


        this.adSoyad = adSoyad;
        this.rol = rol;
        this.telefonNo = telefonNo;

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
