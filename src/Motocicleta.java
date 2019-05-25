public class Motocicleta extends Autovehicul {

    private String clasa;

    Motocicleta(int an_fabricatie, int putere, int masa, float pret, Motor motor, String brand, String model, String culoare, String cutie_viteze, String clasa) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);
        this.numar_roti = 2;
        this.clasa = clasa;

    }
}
