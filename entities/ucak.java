package entities;

public class Ucak {
    private String model;
    private String marka;
    private String seriNo;
    private int kapasite;

    public Ucak(String model, String marka, String seriNo, int kapasite) {
        this.model = model;
        this.marka = marka;
        this.seriNo = seriNo;
        this.kapasite = kapasite;
    }

    public String getModel() { return model; }
    public String getMarka() { return marka; }
    public String getSeriNo() { return seriNo; }
    public int getKapasite() { return kapasite; }

    public String toString() {
        return marka + " " + model + " (" + seriNo + ") Kapasite: " + kapasite;
    }
}
