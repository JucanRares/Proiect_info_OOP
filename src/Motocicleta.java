class Motocicleta extends Autovehicul {

    private String clasa;

    Motocicleta(int an_fabricatie, String brand, String model, String culoare, Motor motor,  String cutie_viteze, int putere, String clasa, int masa, float valoare) {

        super(an_fabricatie, brand, model, culoare, motor, cutie_viteze, putere, masa, valoare);
        this.numar_roti = 2;
        this.clasa = clasa;

    }
}
