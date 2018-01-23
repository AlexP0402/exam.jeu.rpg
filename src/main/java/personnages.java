public class personnages{

    private int pv;
    private int degatArme;
    private String typePersonnages;
    private String etatDuPersonnage;



    public personnages(String chaine) {
        this.typePersonnages=typePersonnages;
    }


    public void setTypePersonnages(String typePersonnages) {
        this.typePersonnages = typePersonnages;
    }

    public String getTypePersonnages() {
        return typePersonnages;
    }

    public void setDegatArme(int degatArme) {
        this.degatArme = degatArme;
    }

    private void recevoirDegats(int degats) {

        this.pv -= degats * this.degatArme;

        if(pv < 0)
            pv = 0;
    }

    public void setEtatDuPersonnage(String etatDuPersonnage) {
        this.etatDuPersonnage = etatDuPersonnage;
    }


    public String getEtatDuPersonnage() {
        return etatDuPersonnage;
    }

    public boolean EtatDuPersonnage() {

        if(this.getPv() > 0) {
            etatDuPersonnage = "Vivant";
            return true;
        }
        else {
            etatDuPersonnage = "Mort";
            return false;
        }
    }

    public int getPv() {

        return this.pv;
    }



}