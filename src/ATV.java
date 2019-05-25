public class ATV extends Autovehicul {

    private String tip_teren;

    ATV (int an_fabricatie, int putere, int masa, float pret, Motor motor, String brand, String model, String culoare, String cutie_viteze, String tip_teren) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);
        this.numar_roti = 4;
        this.tip_teren = tip_teren;

    }
}
