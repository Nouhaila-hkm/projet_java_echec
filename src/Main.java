
public class Main {



    public static void main(String[] args) {

        Plateau plateau = new Plateau();
        System.out.print("    A     B     C     D     E     F     G     H   \n");
        for (int i=0;i<8;i++) {
            System.out.print("  |-----|-----|-----|-----|-----|-----|-----|-----|\n"+i);
            for (int j = 0; j < 8; j++) {

                if (plateau.getCase(j,i) != null) {
                    System.out.print(" | "+plateau.getCase(j, i).getNomCourt(plateau.getCase(j,i)));
                }else
                    System.out.print(" |    ");
            }
            System.out.print(" | "+i+"\n");
        }
        System.out.print("  |-----|-----|-----|-----|-----|-----|-----|-----|\n");
    }

}
