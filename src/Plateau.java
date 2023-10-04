import java.util.ArrayList;
public class  Plateau {

    private ArrayList<Piece> plateau ;
    protected Roi roi_blanc;
    protected Roi roi_noir;

    public Plateau(){
        plateau =new ArrayList<>();
        //plateau.add(new Piece("tour","blanc",0,0));
        plateau.add(new Tour("blanc",new Position(0,0)));
        plateau.add(new Cavalier("blanc",new Position(1,0)));
        plateau.add(new Fou("blanc",new Position(2,0)));
        plateau.add(new Reine("blanc",new Position(3,0)));
        plateau.add(new Roi("blanc",new Position(4,0)));
        plateau.add(new Fou("blanc",new Position(5,0)));
        plateau.add(new Cavalier("blanc",new Position(6,0)));
        plateau.add(new Tour("blanc",new Position(7,0)));
        //plateau.add(new Piece("pion","blanc",0,1));
        plateau.add(new PionBlanc(new Position(0,1)));
        plateau.add(new PionBlanc(new Position(1,1)));
        plateau.add(new PionBlanc(new Position(2,1)));
        plateau.add(new PionBlanc(new Position(3,1)));
        plateau.add(new PionBlanc(new Position(4,1)));
        plateau.add(new PionBlanc(new Position(5,1)));
        plateau.add(new PionBlanc(new Position(6,1)));
        plateau.add(new PionBlanc(new Position(7,1)));

        plateau.add(new Tour("noir",new Position(0,7)));
        plateau.add(new Cavalier("noir",new Position(1,7)));
        plateau.add(new Fou("noir",new Position(2,7)));
        plateau.add(new Reine("noir",new Position(3,7)));
        plateau.add(new Roi("noir",new Position(4,7)));
        plateau.add(new Fou("noir",new Position(5,7)));
        plateau.add(new Cavalier("noir",new Position(6,7)));
        plateau.add(new Tour("noir",new Position(7,7)));
        //plateau.add(new Piece("pion","noir",0,6));
        plateau.add(new PionNoir(new Position(0,6)));
        plateau.add(new PionNoir(new Position(1,6)));
        plateau.add(new PionNoir(new Position(2,6)));
        plateau.add(new PionNoir(new Position(3,6)));
        plateau.add(new PionNoir(new Position(4,6)));
        plateau.add(new PionNoir(new Position(5,6)));
        plateau.add(new PionNoir(new Position(6,6)));
        plateau.add(new PionNoir(new Position(7,6)));

    }


    public Piece getCase(Position obj){
        for(Piece piece:plateau)
        {
            if(piece.getPosition().equals(obj)){
                return piece;
            }
        }
        return null;

    }

    public Piece getCase(int x ,int y){
        return this.getCase(new Position(x,y));
    }

    public Piece getCase(String ch) {
        return this.getCase(new Position(ch));
    }

    public boolean deplacer(Position from, Position to){
        // récupérer la pièce sur la case de départ
        Piece objet = this.getCase(from.getX(),from.getY());
        // Vérifier que la pièce existe
        if(objet != null){
            // Récupérer les déplacements possibles de  cette pièece
            ArrayList<Position> listeDeplacementPossible = objet.getDeplacementPossible(this);
            // Vérifier si l'objet to se trouve dans la variable listeDeplacementPossible
            boolean trouve = false;
            for(int i=0;i<listeDeplacementPossible.size();i++)
                if(listeDeplacementPossible.get(i).equals(to))
                    trouve=true;

            // si le déplacement est valable
            if(trouve == true){
                // On supprime la pièce qui se trouve sur la case d'arrivée (s'il y en a une)
                if(this.getCase(to.getX(),to.getY()) != null){
                    plateau.remove(this.getCase(to.getX(),to.getY()));
                }
                // Modifier la position de la pièce qu'on souhaite bouger.
                objet.setPosition(to);
                return true;
            }
        }
        //On arrive ici si le déplacement n'était pas valide
        return false;
    }

    public Roi getRoi(String couleur){
        return (couleur.equals("Blanc"))? this.roi_blanc : this.roi_noir;
    }

    public boolean estEchec(String couleur){
        if (getRoi("Blanc").getCouleur() == null){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "plateau = {"+ plateau+"}";
    }

    public ArrayList<Piece> getPiecesBlanches(){
        ArrayList<Piece> pb = new ArrayList<Piece>();
        for(int i=0; i<plateau.size();i++){
            if(this.plateau.get(i).getCouleur().startsWith("B")){
                pb.add(plateau.get(i));
            }
        }
        return pb;
    }

    public ArrayList<Piece> getPiecesNoires(){
        ArrayList<Piece> pn = new ArrayList<Piece>();
        for(int i=0; i<plateau.size();i++){
            if(this.plateau.get(i).getCouleur().startsWith("N")){
                pn.add(plateau.get(i));
            }
        }
        return pn;
    }

    //tester
    public static void main(String[] args){
        Plateau p = new Plateau();

        System.out.println(p);

        p.deplacer(new Position(3,3), new Position(4,4));

        System.out.println("DEPLACEMENT");

        System.out.println(p);
    }
}