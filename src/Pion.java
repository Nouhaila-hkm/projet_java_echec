import java.util.ArrayList;

public abstract class Pion extends Piece{



    public Pion(String couleur, Position position) {
        super(couleur, position);
    }

    @Override
    public abstract String getType() ;

    @Override
    abstract ArrayList<Position> getDeplacementPossible(Plateau plateau) ;
}
