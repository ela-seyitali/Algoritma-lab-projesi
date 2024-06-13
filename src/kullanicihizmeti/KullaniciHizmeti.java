package kullanicihizmeti;
/// add exeption handling 
/// parametreleri duzenle

import java.io.IOException;
import java.util.Scanner;

public class KullaniciHizmeti {
// dosya sınıfını kullanmak için öncelikle verileri dizide saklamamız gerekmektedir... burda duruyorum 

    public static void main(String[] args) {
        //nesne  tanımlama 
        Scanner in = new Scanner(System.in);
        Dosya dosya = new Dosya();
        Kullanici gorevli = new Kullanici();
        Kullanici ogrenci = new Kullanici();
        Kullanici idari = new Kullanici();
        Gorevli GNesne = new Gorevli();
        Ogrenci ONesne = new Ogrenci();
        /// Gorevli gorevli = new gorevli();

        //değişken tanımlama
        System.out.println("***********YURT GIRIS SISTEMI***********");
        System.out.println("Lutfen rolunuzu giriniz (Roller: Idari, Gorevli, Ogrenci) :");
        String rol = in.next();
        switch (rol.toLowerCase()) {
            case "idari":
                System.out.println("Yapilabilecek islemler: ");
                System.out.println("1) Yurt kurallarini goruntuleme");
                System.out.println("2) Ogrenci bilgilerini goruntuleme");
                System.out.println("3) Gorevli bilgilerini goruntuleme");
                System.out.println("4) Yeni ogrenci kaydi olusturma");
                System.out.println("5) Yeni Gorevli kaydi olusturma");
                System.out.println("6) Yurda giris yapma");
                System.out.println("7) Yurttan cikis yapma");
                System.out.println("8) Gorevliyi cagirma");
                System.out.println("9) Ogrenciyi cagirma");

                System.out.println("Olmak uzere yapmak istediginiz islem numarasini giriniz:");
                int idariİslemNo = in.nextInt();
                switch (idariİslemNo) {

                    case 1:

                        try {
                            dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\YurtKurallari.txt");
                            dosya.dosyadanOku();
                            // nesne.dosyadanOku();
                        } catch (IOException ex) {
                            System.err.println("Hata: " + ex.toString());
                        }

                        break;

                    case 2:
                        try {
                            dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\OgrenciBilgileri.txt");
                            dosya.dosyadanOku();
                        } catch (IOException ex) {
                            System.err.println("Hata: " + ex.toString());
                        }
                        break;

                    case 3:
                        try {
                            dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\GorevliBilgileri.txt");
                            dosya.dosyadanOku();
                        } catch (IOException ex) {
                            System.err.println("Hata: " + ex.toString());
                        }
                        break;

                    case 4:
                        System.out.println("Yeni bir ogrencinin yurt sistemine kaydedilmesi icin asagidaki bilgileri doldurun.");
                        System.out.println("Ogrenci yurtta ise 1, degilse 0 giriniz:");
                        int ogrenciDurum = in.nextInt();
                        in.nextLine();
                        if (ogrenciDurum == 1) {
                            ogrenci.setYurttaMi(true);

                        } else if (ogrenciDurum == 0) {
                            ogrenci.setYurttaMi(false);
                        } else {
                            System.err.println("hatali giris!");
                        }
                        System.out.println("Ogrenci ad ve soyadi:");
                        String OAdSoyad = in.nextLine();
                        System.out.println("Ogrenci telefon numarasi:");
                        String OTelNo = in.nextLine();

                        ogrenci.OgrenciYeniKayit(OAdSoyad, "Ogrenci", OTelNo);
                        String[] YeniOgrenciBilgileri = {OAdSoyad, "Ogrenci", OTelNo, ogrenci.getStringYurttaMi()};
                         {
                            try {
                                dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\OgrenciBilgileri.txt");
                                dosya.dosyayaYaz(YeniOgrenciBilgileri);
                            } catch (IOException ex) {
                                System.err.println("Hata: " + ex.toString());
                            }
                            try {
                                dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\KullaniciBilgileri.txt");
                                dosya.dosyayaYaz(YeniOgrenciBilgileri);
                            } catch (IOException ex) {
                                System.err.println("Hata: " + ex.toString());
                            }
                        }
                        System.out.println("kayit basarili bir sekilde olusturulmustur.");
                        break;

                    case 5:
                        System.out.println("Yeni bir gorevlinin yurt sistemine kaydedilmesi icin asagidaki bilgileri doldurun.");
                        System.out.println("Gorevli yurtta ise 1, degilse 0 giriniz:");
                        int gorevliDurum = in.nextInt();
                        in.nextLine();
                        if (gorevliDurum == 1) {
                            gorevli.setYurttaMi(true);

                        } else if (gorevliDurum == 0) {
                            gorevli.setYurttaMi(false);
                        } else {
                            System.err.println("hatali giris!");
                        }
                        System.out.println("Gorevlinin Adi ve soyadi:");
                        String GAdSoyad = in.nextLine();
                        System.out.println("Gorevlinin telefon numarasi :");
                        String GTelNo = in.nextLine();
                        System.out.println("Gorevlinin gorevini giriniz:");
                        String gorevi = in.nextLine();

                        gorevli.GorevliYeniKayit(GAdSoyad, "Gorevli", GTelNo, gorevi);
                        String[] YeniGorevliBilgileri = {GAdSoyad, "Gorevli", GTelNo, gorevi, gorevli.getStringYurttaMi()};
                         {
                            try {
                                dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\GorevliBilgileri.txt");
                                dosya.dosyayaYaz(YeniGorevliBilgileri);
                            } catch (IOException ex) {
                                System.err.println("Hata: " + ex.toString());
                            }
                            try {
                                dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\KullaniciBilgileri.txt");
                                dosya.dosyayaYaz(YeniGorevliBilgileri);
                            } catch (IOException ex) {
                                System.err.println("Hata: " + ex.toString());
                            }
                        }
                        System.out.println("kayitiniz basarili bir sekilde olusturulmustur. Yurtta goreviniz: " + gorevi + ".");

                        break;

                    case 6:
                        idari.yurdaGiris();
                        break;

                    case 7:
                        idari.yurttanCikis();
                        break;

                    case 8:
                        GNesne.gorevliAdlari();
                        System.out.println("olmak uzere cagirmak istediginiz gorevli sirasini giriniz:");
                        int GNo = in.nextInt();
                        switch (GNo) {
                            case 1:
                                System.out.println("Suat Erdem adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 2:
                                System.out.println("Selin Aydin adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");

                                break;
                            case 3:
                                System.out.println("Ece Gunes adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 4:
                                System.out.println("Omer Faruk adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 5:
                                System.out.println("Zeynep Marasli adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                        }
                        break;

                    case 9:
                        System.out.println("Cagirmak istedigini ogrenci adi ve soyadini giriniz: ");
                        String OAdiSoyadi = in.nextLine();
                        ONesne.ogrenciCagirma(OAdiSoyadi);
                        break;

                }
                break;
            case "gorevli":
                System.out.println("yapabileceginiz islemler: ");
                System.out.println("1) Gorev atamalarini goruntuleme");
                System.out.println("2) Yurda giris yapma");
                System.out.println("3) Yurttan cikis yapma");
                System.out.println("4) Ogrenciyi cagirma");
                System.out.println("5) Yurt kurallarini goruntuleme");
                System.out.println("olmak uzere yapmak istediginiz islem numarasini giriniz:");
                int gorevliİslemNo = in.nextInt();
                switch (gorevliİslemNo) {

                    case 1:

                        System.out.println("lutfen ad ve soyadinizi giriniz: ");
                        String GAdSoyad = in.nextLine();
                        GNesne.gorevAtamalariGor(GAdSoyad);

                        break;

                    case 2:

                        GNesne.yurdaGiris();

                        break;

                    case 3:

                        GNesne.yurttanCikis();

                        break;

                    case 4:
                        System.out.println("Cagirmak istedigini ogrenci adi ve soyadini giriniz: ");
                        String OAdiSoyadi = in.nextLine();
                        ONesne.ogrenciCagirma(OAdiSoyadi);

                        break;

                    case 5:

                        try {
                            dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\YurtKurallari.txt");
                            dosya.dosyadanOku();
                            // nesne.dosyadanOku();
                        } catch (IOException ex) {
                            System.err.println("Hata: " + ex.toString());
                        }
                        break;
                }

                break;

            case "ogrenci":

                System.out.println("yapabileceginiz islemler: ");
                System.out.println("1) Yurt kurallarini goruntuleme");
                System.out.println("2) Yurda giris yapma");
                System.out.println("3) Yurttan cikis yapma");
                System.out.println("4) Gorevliyi cagirma");
                System.out.println("olmak uzere yapmak istediginiz islem numarasini giriniz:");
                int ogrenciİslemNo = in.nextInt();
                switch (ogrenciİslemNo) {

                    case 1:

                        try {
                            dosya.setDosyaYolu("C:\\Users\\husam\\Documents\\NetBeansProjects\\KullaniciHizmeti\\src\\kullanicihizmeti\\YurtKurallari.txt");
                            dosya.dosyadanOku();
                            // nesne.dosyadanOku();
                        } catch (IOException ex) {
                            System.err.println("Hata: " + ex.toString());
                        }
                        break;

                    case 2:
                        ONesne.yurdaGiris();
                        break;

                    case 3:
                        ONesne.yurttanCikis();
                        break;

                    case 4:
                        GNesne.gorevliAdlari();
                        System.out.println("olmak uzere cagirmak istediginiz gorevli sirasini giriniz:");
                        int GNo = in.nextInt();
                        switch (GNo) {
                            case 1:
                                System.out.println("Suat Erdem adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 2:
                                System.out.println("Selin Aydin adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");

                                break;
                            case 3:
                                System.out.println("Ece Gunes adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 4:
                                System.out.println("Omer Faruk adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                            case 5:
                                System.out.println("Zeynep Marasli adli gorevli cagirilmistir. Lutfen bir kac dakika bekleyiniz..");
                                break;
                        }
                        break;

                }
                break;
            default:
                System.out.println("Gecerli Rol Giriniz..");
                break;
        }

    }

}
