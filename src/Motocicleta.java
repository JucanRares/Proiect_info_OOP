public class Motocicleta extends Autovehicul {

    final int numar_roti = 2;
    String clasa;

    Motocicleta(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze, String clasa) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);

        this.clasa = clasa;

    }
}
