public class ejercicioentornos {


    public static void main(String[] args) {
        int a= 1;
        int b= 12;



        int valor;

        if(a > b){
            valor = a-b;
        } else {
            valor = b-a;
        }

        switch (valor) {
            case 1:
                System.out.println("El valor es 1");
                break;
            case 2:
                System.out.println("El valor es 2");
                break;
            case 3:
                System.out.println("El valor es 3");
                break;
            default:
                System.out.println("El valor es otro");
                break;
        }

        int suma = a+b;
        if(suma > 10){
            System.out.println(suma);
        }
    }
}
