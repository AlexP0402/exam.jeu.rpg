import java.util.Random;

public class monstre extends joueurs{

    private String name;
    private int minDamage;
    private int maxDamage;
    public int pvMin;
    public int pvMax;
    private static Random random = new Random();




    private monstre(String name, int minDamage, int maxDamage, int pvMin, int pvMax) {
        super("Monstre");
        this.name = "Le Monstre";
        this.minDamage = 5;
        this.maxDamage = 20;
        this.pvMin = 50;
        this.pvMax = 300;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setpvMin(int pvMin) {
        this.pvMin = pvMin;
    }

    public int getpvMin(){
        return pvMin;
    }

    public void setpvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getpvMax(){
        return pvMax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int attack() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

}
