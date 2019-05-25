class TIR extends Autovehicul {

    final int numar_roti = 6;
    int masa_remorca_max;

    TIR(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze, int masa_remorca_max) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);

        this.masa_remorca_max = masa_remorca_max;
    }
}