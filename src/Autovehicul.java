public class Autovehicul implements AutovehiculImpl {

    //PARAMETRII

    private int an_fabricatie;
    private int putere;
    private int masa;
    protected int numar_roti;
    private float valoare;
    private Motor motor;
    private String brand;
    private String model;
    private String culoare;
    private String cutie_viteze;

    //CONSTRUCTOR

    Autovehicul(int an_fabricatie, int putere, int masa, float valoare, Motor motor, String brand, String model, String culoare, String cutie_viteze){
        this.an_fabricatie = an_fabricatie;
        this.brand = brand;
        this.putere = putere;
        this.masa = masa;
        this.valoare = valoare;
        this.model = model;
        this.culoare = culoare;
        this.motor = motor;
        this.cutie_viteze = cutie_viteze;
    }

    //GETTERS

    public int getAnFabricatie(){ return this.an_fabricatie; }
    public int getPutere(){ return this.putere; }
    public int getMasa(){ return this.masa; }
    public float getValoare(){ return this.valoare; }
    public char getConfig(){ return this.motor.config; }
    public int getNrCilindrii(){ return this.motor.nr_cilindrii; }
    public float getCapacitate(){ return this.motor.capacitate; }
    public String getNumeBrand(){ return this.brand; }
    public String getModel(){ return this.model; }
    public String getCuloare(){ return this.culoare; }
    public String getCutieViteze(){ return this.cutie_viteze; }

    //SETTERS

    public void setAnFabricatie(int an_fabricatie){ this.an_fabricatie = an_fabricatie; }
    public void setPutere(int putere){ this.putere = putere; }
    public void setMasa(int masa){ this.masa = masa; }
    public void setValoare(float valoare){ this.valoare = valoare; }
    public void setConfig(char config){ this.motor.config = config; }
    public void setNrCilindrii(int nr_cilindrii){ this.motor.nr_cilindrii = nr_cilindrii; }
    public void setCapacitate(float capacitate){ this.motor.capacitate = capacitate; }
    public void setNumeBrand(String denumire){ this.brand = denumire; }
    public void setModel(String model){ this.model = model; }
    public void setCuloare(String culoare){ this.culoare = culoare; }
    public void setCutieViteze(String cutie_viteze){ this.cutie_viteze = cutie_viteze; }
}

class Motor {

    char config;
    int nr_cilindrii;
    float capacitate;
}


