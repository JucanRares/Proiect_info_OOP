class TIR extends Autovehicul {

    private int masa_remorca;

    TIR(int an_fabricatie, String brand, String model, String culoare, Motor motor,  String cutie_viteze, int putere, int masa_remorca, int masa, float valoare) {

        super(an_fabricatie, brand, model, culoare, motor, cutie_viteze, putere, masa, valoare);
        this.numar_roti = 6;
        this.masa_remorca = masa_remorca;
    }
}