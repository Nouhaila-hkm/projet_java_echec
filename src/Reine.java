import java.util.ArrayList;

public class Reine extends Piece{
    private ArrayList<Position> ListePossibilite ;

    public Reine() {
        super("Blanc", new Position(0,1));
    }

    public Reine(String couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public String getType() {
        return "reine";
    }

    @Override
    ArrayList<Position> getDeplacementPossible(Plateau plateau) {

        ListePossibilite = new ArrayList<>();
        Position position = this.getPosition();
        boolean obstacle = false;

        int x = position.getX()+1;
        int y = position.getY();

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x++;
        }
        obstacle=false;

        x = position.getX()-1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x--;
        }
        obstacle=false;

        x = position.getX();
        y = position.getY()+1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            y++;
        }
        obstacle=false;

        x = position.getX();
        y = position.getY()-1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            y--;
        }
        obstacle=false;

        x = position.getX()+1;
        y = position.getY()+1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x++;
            y++;
        }
        obstacle=false;

        x = position.getX()-1;
        y = position.getY()-1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x--;
            y--;
        }
        obstacle=false;


        x = position.getX()-1;
        y = position.getY()+1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x--;
            y++;
        }
        obstacle=false;

        x = position.getX()+1;
        y = position.getY()-1;

        while(x<8 && x>=0 && y>=0&& y<8 && obstacle==false){
            if (plateau.getCase(x, y) == null){
                ListePossibilite.add(new Position(x,y));
            }else{
                obstacle=true;
                if (plateau.getCase(x, y).getCouleur() != this.getCouleur()){
                    ListePossibilite.add(new Position(x,y));
                }
            }
            x++;
            y--;
        }
        obstacle=false;

        return ListePossibilite;

    }
}
