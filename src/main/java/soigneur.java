public class soigneur extends joueurs{

    private int pv;
    private int degatArme;
    private String pseudo;



    public soigneur(String pseudo, int pv, int degatArme){
        super(pseudo);
        this.pseudo = "Le Soigneur";
        this.pv = 50;
        this.degatArme = 5;
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
