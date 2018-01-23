public class armes {

    private int degatArme;
    private String Arme;



    public armes(String Arme, int degatArme){
        this.Arme = Arme;
        this.degatArme = degatArme;
    }

    public void setArme(String Arme){
        this.Arme = Arme;
    }

    public String getArme(){
        return Arme;
    }

    public void setDegatArme1(int degatArme1){
        this.degatArme = degatArme1;
    }

    public int getDegatArme1(){
        return degatArme;
    }

}
