package ACEPTAELRETO;

public class casascolgadas { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba(int numCasos) {
        String casa = in.next();
                    if(casa.toLowerCase().equals("colgadas")){
                        System.out.println("Bien");
                    } else if(casa.toLowerCase().equals("colgantes")){
                        System.out.println("Mal");
                    }


    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba(numCasos);
    }
}
