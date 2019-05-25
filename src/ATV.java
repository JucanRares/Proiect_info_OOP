public class ATV extends Autovehicul {

    final int numar_roti = 4;
    String tip_teren;

    ATV (int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze, String tip_teren) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);

        this.tip_teren = tip_teren;

    }
}
