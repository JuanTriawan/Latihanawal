package Application;

public class hewan {
    String mata, mulut, telinga, ekor;
    Integer kaki;

    //Set
    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }

    //Get
    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getEkor() {
        return ekor;
    }

    public Integer getKaki() {
        return kaki;
    }

    String bermain(String m){
        return m;
    }
    String makan(String mkn){
        return mkn;
    }
    Boolean tidur(Boolean t){
        return t;
    }
}
