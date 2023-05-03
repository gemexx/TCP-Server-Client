import com.google.gson.Gson;

public class Auto {
    public int geschwindigkeit;
    public int drehzahl;
    public int motorTemp;
    public int getriebeTemp;
    public int kuelwasserTemp;
    public int getriebegang;
    public int reifenDruck;
    public int kilometerGesamt;

    // Immer auf 100km
    public long kraftstoffverbrauch;
    public String GPS;
    public String zustand;

    public String beleuchtung;

    public int batterieSpannung;
    public int fuellstand;
    // in 360°
    public int lenkradStellung;
    public int beschleunigung;

    public Auto(int geschwindigkeit, int drehzahl, int motorTemp, int getriebeTemp, int kuelwasserTemp, int getriebegang, int reifenDruck, int kilometerGesamt, long kraftstoffverbrauch, String GPS, String zustand, String beleuchtung, int batterieSpannung, int fuellstand, int lenkradStellung, int beschleunigung) {
        this.geschwindigkeit = geschwindigkeit;
        this.drehzahl = drehzahl;
        this.motorTemp = motorTemp;
        this.getriebeTemp = getriebeTemp;
        this.kuelwasserTemp = kuelwasserTemp;
        this.getriebegang = getriebegang;
        this.reifenDruck = reifenDruck;
        this.kilometerGesamt = kilometerGesamt;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
        this.GPS = GPS;
        this.zustand = zustand;
        this.beleuchtung = beleuchtung;
        this.batterieSpannung = batterieSpannung;
        this.fuellstand = fuellstand;
        this.lenkradStellung = lenkradStellung;
        this.beschleunigung = beschleunigung;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getDrehzahl() {
        return drehzahl;
    }

    public int getMotorTemp() {
        return motorTemp;
    }

    public int getGetriebeTemp() {
        return getriebeTemp;
    }

    public int getKuelwasserTemp() {
        return kuelwasserTemp;
    }

    public int getGetriebegang() {
        return getriebegang;
    }

    public int getReifenDruck() {
        return reifenDruck;
    }

    public int getKilometerGesamt() {
        return kilometerGesamt;
    }

    public long getKraftstoffverbrauch() {
        return kraftstoffverbrauch;
    }

    public String getGPS() {
        return GPS;
    }

    public String getZustand() {
        return zustand;
    }

    public String getBeleuchtung() {
        return beleuchtung;
    }

    public int getBatterieSpannung() {
        return batterieSpannung;
    }

    public int getFuellstand() {
        return fuellstand;
    }

    public int getLenkradStellung() {
        return lenkradStellung;
    }

    public int getBeschleunigung() {
        return beschleunigung;
    }

    // Diese Funktion macht von dieser Instanz (z.B. Public int) einen JSON String.
    public String toJson() {
        return (new Gson()).toJson(this);
    }
}
