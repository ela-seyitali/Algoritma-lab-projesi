package kullanicihizmeti;

public class Ogrenci extends Kullanici {

    void SetAdSoyad(String adSoyad) {
        super.adSoyad = adSoyad;
    }

    private String[] adSoyadlar = {
        "Ayse Yilmaz",
        "Zeynep Kaya",
        "Elif Demir",
        "Ceren Aslan",
        "Duygu Yildirim",
        "Aylin Yildiz",
        "Seda Nur",
        "Ceyda Erdogan",
        "Nazli Ece",
        "Gizem Su",
        "Sibel Zeynep",
        "Eda Derya",
        "Berfin Demir",
        "Pelin Aysu",
        "Banu Ilayda",
        "Merve Arslan",
        "Hande Ipek",
        "Selin Kaya",
        "Nihal Seren",
        "Esra Dilara",
        "Buse Seda",
        "Irem Defne",
        "Simge Naz",
        "Aysun Canan",
        "Yasemin Ezgi",
        "Melis Ceren",
        "Leyla Aysegul",
        "Hulya Yasemin",
        "Funda Derya",
        "Ebru Zeynep",
        "Zeynep Irem",
        "Ozlem Serap",
        "Melek Aylin",
        "Gokce Berna",
        "Burcu Didem",
        "Dilek Neslihan",
        "Serpil Melike",
        "Fatos Cigdem",
        "Asuman Sevda",
        "Nevin Gul",
        "Feride Hatice",
        "Gamze Asli",
        "Elmas Ozge",
        "Aysel Nazli",
        "Birsen Zuhal",
        "Kubra Sinem",
        "Fatma Binnur",
        "Nevra Deniz",
        "Pinar Esin",
        "Figen Gulsen",
        "Lale Hulya",
        "Sema Arzu",
        "Jale Tulin",
        "Sule Demet",
        "Selma Sevil",
        "Cigdem Senem",
        "Seher Alev",
        "Zeynep Nil",
        "Sibel Yasemin",
        "Zehra Sevim",
        "Handan Dilek",
        "Meryem Irem",
        "Neslihan Nur",
        "Esra Merve",
        "Sema Nur",
        "Irem Aysen",
        "Nurcan Nuray",
        "Birgul Meral",
        "Hatice Zehra"
    };

    private boolean bulundu;

    void ogrenciCagirma(String ogrenciAdi) {
        for (int i = 0; i < adSoyadlar.length; i++) {
            if (adSoyadlar[i].equalsIgnoreCase(ogrenciAdi)) {
                System.out.println(ogrenciAdi + " adli ogrenci cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                bulundu = true;
            }

        }
        if (bulundu) { //bulundu değeri false oldugu için !bulundu yazsak true olabileceği duşuncesiyle ! koymadım..
            System.out.println(ogrenciAdi + " adli ogrenci bulunmamistir..");
        }

    }
}
