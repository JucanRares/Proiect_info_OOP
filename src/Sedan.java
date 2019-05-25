class Sedan extends Autovehicul {

    private String tractiune;

    Sedan(int an_fabricatie, int putere, int masa, float pret, Motor motor, String brand, String model, String culoare, String cutie_viteze, String tractiune) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);
        this.numar_roti = 4;
        this.tractiune= tractiune;
    }
}
