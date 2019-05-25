class TIR extends Autovehicul {

    private int masa_remorca;

    TIR(int an_fabricatie, int putere, int masa, float pret, Motor motor, String brand, String model, String culoare, String cutie_viteze, int masa_remorca) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);
        this.numar_roti = 6;
        this.masa_remorca = masa_remorca;
    }
}