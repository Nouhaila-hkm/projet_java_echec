import MG2D.Couleur;
import MG2D.Fenetre;
import MG2D.Souris;
import MG2D.geometrie.Carre;
import MG2D.geometrie.Cercle;
import MG2D.geometrie.Point;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Dessin;
import MG2D.geometrie.Ovale;

import java.util.ArrayList;

public class MainGraphique {

    public static final int tailleCase = 75;


    public static void affichageDeLEchiquier(Fenetre f, Plateau plateau){
        f.effacer();

        for(int j=0;j<8;j++) //on parcours les lignes de l'echequier
            for(int i=0;i<8;i++) //on parcours les colonnes de l'echequier
                if(((i+j)%2)==0)
                    f.ajouter(new Carre(Couleur.GRIS_CLAIR.assombrir(),new Point(i*tailleCase,j*tailleCase),tailleCase,true)); //case noire
                else
                    f.ajouter(new Carre(Couleur.BLANC,new Point(i*tailleCase,j*tailleCase),tailleCase,true)); //case blanche


        for(int j=0;j<8;j++) //on parcours les lignes de l'echequier
            for(int i=0;i<8;i++) //on parcours les colonnes de l'echequier
                if(plateau.getCase(i,j) != null){
                    Piece piece = plateau.getCase(i,j);
                    f.ajouter(new Texture("./images/"+piece.getNomLong()+".png",new Point(i*tailleCase,j*tailleCase),tailleCase,tailleCase));
                }

        f.rafraichir();
    }


    public static void main(String[] args) throws Exception {
        Fenetre f = new Fenetre("Jeu d'échec",600,600);
        Souris s = f.getSouris();

        Plateau plateau = new Plateau();


        affichageDeLEchiquier(f, plateau);


        ArrayList<Position> ListePossibilite = new ArrayList<>() ;

        boolean secondClic = false;
        Position clicDepart = new Position();
        Position clicArrivee = new Position();


        while (true){
            try{
                Thread.sleep(16);
            }catch (Exception e){}


            if(s.getClicGauche()){
                if(secondClic ==false){

                Piece objet = plateau.getCase((s.getPosition().getX())/tailleCase,(s.getPosition().getY())/tailleCase);
                if(objet != null) {
                    System.out.println(objet);
                    affichageDeLEchiquier(f, plateau);
                    ListePossibilite = objet.getDeplacementPossible(plateau);

                    for (int j = 0; j < 8; j++)
                        for (int i = 0; i < 8; i++)
                            for (Position position : ListePossibilite) {
                                if (ListePossibilite.contains(new Position(i, j))) {
                                    Cercle c = new Cercle(Couleur.ROUGE, new Point(i * tailleCase + tailleCase / 2, j * tailleCase + tailleCase / 2), tailleCase / 4, false);
                                    f.ajouter(c);
                                    f.rafraichir();
                                }
                            }
                    clicDepart = new Position((s.getPosition().getX())/tailleCase,(s.getPosition().getY())/tailleCase);
                }
                secondClic=true;

                }else {
                    System.out.println("C'est un second clic");
                    clicArrivee = new Position((s.getPosition().getX())/tailleCase,(s.getPosition().getY())/tailleCase);
                    plateau.deplacer(clicDepart,clicArrivee);
                    secondClic=false;
                    affichageDeLEchiquier(f,plateau);
                    f.rafraichir();

                }
            }
        }


    }
}
