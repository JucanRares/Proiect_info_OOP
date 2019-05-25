public class ATV extends Autovehicul {

    private String tip_teren;

    ATV (int an_fabricatie, String brand, String model, String culoare, Motor motor,  String cutie_viteze, int putere, String tip_teren, int masa, float valoare) {

        super(an_fabricatie, brand, model, culoare, motor, cutie_viteze, putere, masa, valoare);
        this.numar_roti = 4;
        this.tip_teren = tip_teren;

    }
}
