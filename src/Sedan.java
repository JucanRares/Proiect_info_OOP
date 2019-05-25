class Sedan extends Autovehicul {

    private String tractiune;

    Sedan(int an_fabricatie, String brand, String model, String culoare, Motor motor,  String cutie_viteze, int putere, String tractiune, int masa, float valoare) {

        super(an_fabricatie, brand, model, culoare, motor, cutie_viteze, putere, masa, valoare);
        this.numar_roti = 4;
        this.tractiune= tractiune;
    }
}
