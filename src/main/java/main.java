import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Combien de joueurs voulez vous ? ");
        int nbJoueurs = scan.nextInt();
        scan.nextLine();

        ArrayList<joueurs> listJoueur = new ArrayList<joueurs>();

        for (int i = 0; i < nbJoueurs ; i++) {
            System.out.println("Nom du Joueur " + (i + 1) + " : ");

            joueurs nouveauJoueur = new joueurs(scan.nextLine());

            listJoueur.add(nouveauJoueur);
        }

        System.out.println("Quel personnage voulez-vous selectionner ? mage,guerrier,soigneur");
        String chaine= scan.nextLine();
        scan.nextLine();

        personnages perso = new personnages(chaine);


    }
}