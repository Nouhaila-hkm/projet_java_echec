import java.util.ArrayList;

public class Roi extends Piece{
    private ArrayList<Position> ListePossibilite ;
    public Roi() {
        super("Blanc", new Position(0,1));
    }

    public Roi(String couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public String getType() {
        return "roi";
    }

    @Override
    ArrayList<Position> getDeplacementPossible(Plateau plateau) {

        ListePossibilite = new ArrayList<>();
        Position position = this.getPosition();
        int x = position.getX();
        int y = position.getY();


        if(((x-1) >= 0 && (x-1)<8 && (y-1) >=0 && (y-1)<8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x-1, y-1) == null){
                ListePossibilite.add(new Position(x-1,y-1));
            }else{
                if(plateau.getCase(x-1, y-1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x-1,y-1));
                }
            }
        }

        if(((x) >= 0 && (y+1) >= 0 && (x) < 8 && (y+1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x, y+1) == null){
                ListePossibilite.add(new Position(x,y+1));
            }else{
                if(plateau.getCase(x, y+1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y+1));
                }
            }
        }

        if(((x) >= 0 && (y-1) >= 0 && (x) < 8 && (y-1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x, y-1) == null){
                ListePossibilite.add(new Position(x,y-1));
            }else{
                if(plateau.getCase(x, y-1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y-1));
                }
            }
        }

        if(((x+1) >= 0 && (y) >= 0 && (x+1) < 8 && (y) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x+1, y) == null){
                ListePossibilite.add(new Position(x+1,y));
            }else{
                if(plateau.getCase(x+1, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x+1,y));
                }
            }
        }

        if(((x-1) >= 0 && (y) >= 0 && (x-1) < 8 && (y) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x-1, y) == null){
                ListePossibilite.add(new Position(x-1,y));
            }else{
                if(plateau.getCase(x-1, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x-1,y));
                }
            }
        }

        if(((x+1) >= 0 && (y+1) >= 0 && (x+1) < 8 && (y+1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x+1, y+1) == null){
                ListePossibilite.add(new Position(x+1,y+1));
            }else{
                if(plateau.getCase(x+1, y+1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x+1,y+1));
                }
            }
        }

        if(((x-1) >= 0 && (y+1) >= 0 && (x-1) < 8 && (y+1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x-1, y+1) == null){
                ListePossibilite.add(new Position(x-1,y+1));
            }else{
                if(plateau.getCase(x-1, y+1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x-1,y+1));
                }
            }
        }

        if(((x+1) >= 0 && (y-1) >= 0 && (x+1) < 8 && (y-1) < 8)){ // Vérification de la case sur l'échiquier
            if(plateau.getCase(x+1, y-1) == null){
                ListePossibilite.add(new Position(x+1,y-1));
            }else{
                if(plateau.getCase(x+1, y-1).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x+1,y-1));
                }
            }
        }
        return ListePossibilite;
    }
}
