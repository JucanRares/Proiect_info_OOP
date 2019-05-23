public class Autovehicul implements AutovehiculImpl {

    //PARAMETRII
    int an_fabricatie;
    int putere;
    int masa;
    float pret;
    Motor motor;
    Brand brand;
    String culoare;
    String cutie_viteze;

    
    public void Autovehicul(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String culoare, String cutie_viteze){
        this.an_fabricatie = an_fabricatie;
        this.brand = brand;
        this.putere = putere;
        this.masa = masa;
        this.pret = pret;
        this.culoare = culoare;
        this.motor = motor;
        this.cutie_viteze = cutie_viteze;
    }


}

class Brand {

    String denumire;
    String tara_origine;

}

class Motor {

    char config;
    int nr_cilindrii;
    float capacitate;
}

class TIR extends Autovehicul {

    final int numar_roti = 6;
    int masa_remorca_max;

    public void TIR(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String culoare, String cutie_viteze, int masa_remorca_max) {
        super(an_fabricatie, putere, masa, pret, motor, brand, culoare, cutie_viteze);
        this.masa_remorca_max = masa_remorca_max;
    }
}

class Sedan extends Autovehicul {

    final int numar_roti = 4;
    int volum_portbagaj;
    String clasa;

    public void Sedan(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String culoare, String cutie_viteze, int volum_portbagaj) {
        super(an_fabricatie, putere, masa, pret, motor, brand, culoare, cutie_viteze);
        this.volum_portbagaj = volum_portbagaj;
    }
}

class Motocicleta extends Autovehicul {

    final int numar_roti = 2;
    String clasa;

    public void Motocicleta(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String culoare, String cutie_viteze, String clasa) {
        super(an_fabricatie, putere, masa, pret, motor, brand, culoare, cutie_viteze);
        this.clasa = clasa;
    }
}

class ATV extends Autovehicul {

    final int numar_roti = 4;
    String cauciucuri;

    public void ATV (int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String culoare, String cutie_viteze, String cauciucuri) {
        super(an_fabricatie, putere, masa, pret, motor, brand, culoare, cutie_viteze);
        this.cauciucuri = cauciucuri;
    }
}
