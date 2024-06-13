package kullanicihizmeti;

public class Parola extends Kullanici {

    private String parola;

    void setParola(String parola) {
        this.parola = parola;
    }

    void parolaDegistir(String eskiParola, String yeniParola) {
        if (parola.equals(eskiParola)) {
            this.parola = yeniParola;
        } else {
            System.err.println("Eski parola hatalıdır.");
        }
    }

}
