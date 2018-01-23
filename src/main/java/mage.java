public class mage extends joueurs{

    private int pv;
    private int degatArme;
    private String pseudo;



    public mage(String pseudo, int pv, int degatArme) {
        super(pseudo);
        this.pseudo = "Le Mage";
        this.pv = 100;
        this.degatArme = 20;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPv(){
        return this.pv;
    }

    public void setDegatArme(int degatArme) {
        this.degatArme = degatArme;
    }

    public int getDegatArme(){
        return this.degatArme;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    protected String getPseudo(){
        return this.pseudo;
    }
}
