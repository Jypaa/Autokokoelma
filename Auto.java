public class Auto {

    private String mMerkki;
    private String mMalli;
    private int mVuosimalli;
    private String mVari;

    public String getmMerkki(){return mMerkki;}
    public String getmMalli(){return mMalli;}
    public int getmVuosimalli(){return mVuosimalli;}
    public String getmVari(){return mVari;}

    public void setmMerkki(String aMerkki) {mMerkki = aMerkki;}
    public void setmMalli(String aMalli) {mMalli = aMalli;}
    public void setmVuosimalli(int aVuosimalli) {mVuosimalli = aVuosimalli;}
    public void setmVari(String aVari) {mVari = aVari;}

    public Auto(String aMerkki, String aMalli){
      mMerkki = aMerkki;
      mMalli = aMalli;
    }
    public Auto(String aMerkki, String aMalli, int aVuosimalli) {
        mMerkki = aMerkki;
        mMalli = aMalli;
        mVuosimalli = aVuosimalli;
    }
    public Auto(String aMerkki, String aMalli, int aVuosimalli, String aVari) {
        mMerkki = aMerkki;
        mMalli = aMalli;
        mVuosimalli = aVuosimalli;
        mVari = aVari;
    }
    public void Tulostatiedot(){
        System.out.println("Merkki: "+ getmMerkki());
        System.out.println("Malli: "+ getmMalli());
        System.out.println("Vuosimalli: "+ getmVuosimalli());
        System.out.println("Vari: " + getmVari());
        System.out.println();
    }
}
