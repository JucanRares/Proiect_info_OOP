public interface AutovehiculImpl {

    int getAnFabricatie();
    int getPutere();
    int getMasa();
    float getValoare();
    char getConfig();
    int getNrCilindrii();
    float getCapacitate();
    String getNumeBrand();
    String getModel();
    String getCuloare();
    String getCutieViteze();

    void setAnFabricatie(int an_fabricatie);
    void setPutere(int putere);
    void setMasa(int masa);
    void setValoare(float valoare);
    void setConfig(char config);
    void setNrCilindrii(int nr_cilindrii);
    void setCapacitate(float capacitate);
    void setNumeBrand(String denumire);
    void setModel(String model);
    void setCuloare(String culoare);
    void setCutieViteze(String cutie_viteze);

}
