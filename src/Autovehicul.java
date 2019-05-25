public class Autovehicul implements AutovehiculImpl {

    //PARAMETRII

    private int an_fabricatie;
    private int putere;
    private int masa;
    private float pret;
    private Motor motor;
    private Brand brand;
    private String model;
    private String culoare;
    private String cutie_viteze;

    //CONSTRUCTOR

    Autovehicul(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze){
        this.an_fabricatie = an_fabricatie;
        this.brand = brand;
        this.putere = putere;
        this.masa = masa;
        this.pret = pret;
        this.model = model;
        this.culoare = culoare;
        this.motor = motor;
        this.cutie_viteze = cutie_viteze;
    }

    //GETTERS

    public int getAnFabricatie(){ return this.an_fabricatie; }
    public int getPutere(){ return this.putere; }
    public int getMasa(){ return this.masa; }
    public float getPret(){ return this.pret; }
    public char getConfig(){ return this.motor.config; }
    public int getNrCilindrii(){ return this.motor.nr_cilindrii; }
    public float getCapacitate(){ return this.motor.capacitate; }
    public String getNumeBrand(){ return this.brand.denumire; }
    public String getOrigineBrand(){ return this.brand.tara_origine; }
    public String getModel(){ return this.model; }
    public String getCuloare(){ return this.culoare; }
    public String getCutieViteze(){ return this.cutie_viteze; }

    //SETTERS

    public void setAnFabricatie(int an_fabricatie){ this.an_fabricatie = an_fabricatie; }
    public void setPutere(int putere){ this.putere = putere; }
    public void setMasa(int masa){ this.masa = masa; }
    public void setPret(float pret){ this.pret = pret; }
    public void setConfig(char config){ this.motor.config = config; }
    public void setNrCilindrii(int nr_cilindrii){ this.motor.nr_cilindrii = nr_cilindrii; }
    public void setCapacitate(float capacitate){ this.motor.capacitate = capacitate; }
    public void setNumeBrand(String denumire){ this.brand.denumire = denumire; }
    public void setOrigineBrand(String tara_origine){ this.brand.tara_origine = tara_origine; }
    public void setModel(String model){ this.model = model; }
    public void setCuloare(String culoare){ this.culoare = culoare; }
    public void setCutieViteze(String cutie_viteze){ this.cutie_viteze = cutie_viteze; }
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


