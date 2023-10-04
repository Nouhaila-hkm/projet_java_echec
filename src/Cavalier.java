import java.util.ArrayList;

public class Cavalier extends Piece{
    private ArrayList<Position> ListePossibilite ;

    public Cavalier() {
        super("Blanc", new Position(0,1));
    }

    public Cavalier(String couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public String getType() {
        return "cavalier";
    }

    @Override
    ArrayList<Position> getDeplacementPossible(Plateau plateau) {
        ListePossibilite = new ArrayList<>();
        Position position = this.getPosition();
        int x = position.getX();
        int y = position.getY();

        if(this.getCouleur().equals("blanc")){
            if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((plateau.getCase(x-2,y-1) == null) || plateau.getCase(x-2,y-1).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x-2,y-1));
            }
            if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((plateau.getCase(x-1,y-2) == null) || plateau.getCase(x-1,y-2).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x-1,y-2));
            }
            if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((plateau.getCase(x+1,y-2) == null) || plateau.getCase(x+1, y-2).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x+1,y-2));
            }
            if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((plateau.getCase(x+2,y-1) == null) || plateau.getCase(x+2,y-1).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x+2,y-1));
            }
            if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((plateau.getCase(x+2,y+1) == null) || plateau.getCase(x+2,y+1).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x+2,y+1));
            }
            if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((plateau.getCase(x+1,y+2) == null) || plateau.getCase(x+1, y+2).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x+1,y+2));
            }
            if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((plateau.getCase(x-1,y+2) == null) || plateau.getCase(x-1, y+2).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x-1,y+2));
            }
            if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((plateau.getCase(x-2,y+1) == null) || plateau.getCase(x-2,y+1).getCouleur().equals("noir"))){
                ListePossibilite.add(new Position(x-2,y+1));
            }
        }
        else{
            if(((x-2) >= 0 && (y-1) >= 0 && (x-2) < 8 && (y-1) < 8) && ((plateau.getCase(x-2,y-1) == null) || plateau.getCase(x-2,y-1).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x-2,y-1));
            }
            if(((x-1) >= 0 && (y-2) >= 0 && (x-1) < 8 && (y-2) < 8) && ((plateau.getCase(x-1,y-2) == null) || plateau.getCase(x-1,y-2).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x-1,y-2));
            }
            if(((x+1) >= 0 && (y-2) >= 0 && (x+1) < 8 && (y-2) < 8) && ((plateau.getCase(x+1,y-2) == null) || plateau.getCase(x+1, y-2).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x+1,y-2));
            }
            if(((x+2) >= 0 && (y-1) >= 0 && (x+2) < 8 && (y-1) < 8) && ((plateau.getCase(x+2,y-1) == null) || plateau.getCase(x+2,y-1).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x+2,y-1));
            }
            if(((x+2) >= 0 && (y+1) >= 0 && (x+2) < 8 && (y+1) < 8) && ((plateau.getCase(x+2,y+1) == null) || plateau.getCase(x+2,y+1).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x+2,y+1));
            }
            if(((x+1) >= 0 && (y+2) >= 0 && (x+1) < 8 && (y+2) < 8) && ((plateau.getCase(x+1,y+2) == null) || plateau.getCase(x+1, y+2).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x+1,y+2));
            }
            if(((x-1) >= 0 && (y+2) >= 0 && (x-1) < 8 && (y+2) < 8) && ((plateau.getCase(x-1,y+2) == null) || plateau.getCase(x-1, y+2).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x-1,y+2));
            }
            if(((x-2) >= 0 && (y+1) >= 0 && (x-2) < 8 && (y+1) < 8) && ((plateau.getCase(x-2,y+1) == null) || plateau.getCase(x-2,y+1).getCouleur().equals("blanc"))){
                ListePossibilite.add(new Position(x-2,y+1));
            }
        }
        return ListePossibilite;
    }
}
