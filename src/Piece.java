
import java.util.ArrayList;
import java.util.Objects;

public abstract class  Piece {

    private String couleur;
    private Position position;
    //private String type;


    public Piece() {
        this.getType() ;
        //this.type = "pion";
        this.couleur="B";
        this.position = new Position(0,1);
    }

    public Piece(Piece p) {
        this.getType() ;
        //this.type = p.type;
        this.couleur = p.couleur;
        this.position = p.position;

    }

    public Piece(String type, String couleur, int x, int y) {
        this.getType();
        //this.type = type;
        this.couleur = couleur;
        this.position = new Position(x, y);

    }

    public Piece( String couleur, Position position) {
        this.couleur = couleur;
        this.position = position;
        this.getType() ;

    }

    public Piece( String couleur, String position) {
        this.getType();
        this.couleur = couleur;
        this.position = new Position(position);

    }

    public abstract String getType();
    /*public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/

    public String getCouleur() {
        return couleur;
    }


    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getNomCourt(Piece piece) {
        char first = piece.getType().charAt(0);
        char second = piece.getType().charAt(1);
        String data = "" + first + "" + second + "" + piece.couleur;
        data.toUpperCase().charAt(0);
        return data;
    }


    public String getNomLong() {
        String t = getType();
        String c = getCouleur();
        String b = c.substring(0,1).toUpperCase();
        return t+"_"+b;
    }

    abstract ArrayList<Position>  getDeplacementPossible(Plateau plateau);

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Piece piece = (Piece) o;
        return Objects.equals(this.getCouleur(), getType()) && Objects.equals(couleur, piece.couleur) && Objects.equals(position, piece.position);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getType(), couleur, position);
    }

    @Override
    public String toString() {
        if (this.couleur.toUpperCase().equals("NOIR")) {
            return
                    this.getType() + " noir en " + this.position;
        }
        return
                this.getType() + " blanc en " + this.position;
    }

}


