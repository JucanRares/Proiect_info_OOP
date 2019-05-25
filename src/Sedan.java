class Sedan extends Autovehicul {

    final int numar_roti = 4;
    int volum_portbagaj;

    Sedan(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze, int volum_portbagaj) {

        super(an_fabricatie, putere, masa, pret, motor, brand, model, culoare, cutie_viteze);

        this.volum_portbagaj = volum_portbagaj;
    }
}
