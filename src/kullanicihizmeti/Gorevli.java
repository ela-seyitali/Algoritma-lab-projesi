 
package kullanicihizmeti;
 
public class Gorevli extends Kullanici {
    String gorev;
    Gorevli(){}
    Gorevli(String adSoyad, String rol, String telefonNo, boolean yurttaMi,String gorev ){
    super(adSoyad,rol, telefonNo,yurttaMi);
    this.gorev=gorev;
    }
    private String [] gorevliAdlari = {"Suat Erdem","Selin Aydin","Ece Gunes","Omer Faruk","Zeynep Marasli"};
   void gorevliAdlari (){
   for(int i = 0;i<gorevliAdlari.length;i++){
       System.out.println(i+1+". "+gorevliAdlari[i]);
   }
    }
   /*
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
*/
   boolean bulundu;
   void gorevAtamalariGor(String adSoyad){
   String [] gorevAtamalari ={"Gece Nobeti","Temizlik Denetimi","Yemek Hazirliklari","Yemek Dagitimi","Giris Kontrolu","Oda Kontrolu"};
  for (int i = 0; i < gorevliAdlari.length; i++) {
            if (gorevliAdlari[i].equalsIgnoreCase(adSoyad)) {
                bulundu = true;
                System.out.println("Sayin "+gorevliAdlari[i]+" yurdumuzdaki goreviniz: "+gorevAtamalari[i]);
            }

        }
        if (bulundu==false) { 
            System.out.println(adSoyad + " adli gorevli bulunmamistir..");
        }
   }
}
