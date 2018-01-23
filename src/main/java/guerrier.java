public class guerrier extends joueurs{

    private int pv;
    private int degatArme;
    private String pseudo;



    public guerrier(String pseudo, int pv, int degat, int degatArme){
        super(pseudo);
        this.pseudo = "Le Guerrier";
        this.pv = 200;
        this.degatArme = 10;
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
