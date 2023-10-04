public class Position {

    private int x;

    private  int y;

    public String l[]= {"A","B","C","D","E","F","G","H"};

    public Position(int x, int y) {
        if( x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            this.x = x;
            this.y = y;
        }
        else{
            System.out.println("Erreur !!");
            System.exit(1);
        }

    }

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }


    public Position(String identificationCase) {
        for (int i=0;i<l.length;i++){
            if(l[i].equals(""+identificationCase.charAt(0))){
                this.x=i;
            }
        }
        this.y=(int)(identificationCase.charAt(1))-49;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    public String toString() {

        return new String(l[x]+(y+1));
    }
}
