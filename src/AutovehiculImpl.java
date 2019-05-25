public interface AutovehiculImpl {

    //Autovehicul(int an_fabricatie, int putere, int masa, float pret, Motor motor, Brand brand, String model, String culoare, String cutie_viteze);

    int getAnFabricatie();
    int getPutere();
    int getMasa();
    float getPret();
    char getConfig();
    int getNrCilindrii();
    float getCapacitate();
    String getNumeBrand();
    String getOrigineBrand();
    String getModel();
    String getCuloare();
    String getCutieViteze();

    void setAnFabricatie(int an_fabricatie);
    void setPutere(int putere);
    void setMasa(int masa);
    void setPret(float pret);
    void setConfig(char config);
    void setNrCilindrii(int nr_cilindrii);
    void setCapacitate(float capacitate);
    void setNumeBrand(String denumire);
    void setOrigineBrand(String tara_origine);
    void setModel(String model);
    void setCuloare(String culoare);
    void setCutieViteze(String cutie_viteze);

}
