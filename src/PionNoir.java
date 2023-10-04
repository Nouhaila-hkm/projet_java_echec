import java.util.ArrayList;

public class PionNoir extends Pion{
    private ArrayList<Position> ListePossibilite ;
    private boolean premierCoup = true;


    public PionNoir() {
        super("noir", new Position(0,1));
    }

    public PionNoir(Position position) {
        super("noir", position);
    }

    @Override
    public String getType() {
        return "pion";
    }

    @Override
    ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        ListePossibilite = new ArrayList<>();
        Position position = this.getPosition();
        int x = position.getX();
        int y = position.getY();
        if(((x+1) >= 0 && (y-1) >= 0 && (x+1) < 8 && (y-1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x+1, y-1) != null){ // Vérification de la présence d'une pièce dans la case
                if(plateau.getCase(x+1, y-1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x+1,y-1));
                }
            }
        }

        if(((x-1) >= 0 && (y-1) >= 0 && (x-1) < 8 && (y-1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x-1, y-1) != null){ // Vérification de la présence d'une pièce dans la case
                if(plateau.getCase(x-1, y-1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x-1,y-1));
                }
            }
        }
        if(y >= 2 && premierCoup && plateau.getCase(x, y-1) == null && plateau.getCase(x, y-2) == null){
            ListePossibilite.add(new Position(x,y-1));
            ListePossibilite.add(new Position(x,y-2));
        }
        if(y > 0 && plateau.getCase(x, y-1) == null){
            ListePossibilite.add(new Position(x,y-1));
        }
        return ListePossibilite;
    }
}
