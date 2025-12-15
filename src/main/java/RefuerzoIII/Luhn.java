    package RefuerzoIII;

    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class Luhn {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el numero: ");
            String numero = sc.nextLine();
            int[] numeros = new int[numero.length()];
            for (int i = 0; i < numero.length(); i++) {
                numeros[i] = Integer.parseInt(numero.charAt(i) + "");
            }
            int [] UsarEnMetodo= cambiados(numeros);

            if(Luhn(UsarEnMetodo)==true){
                System.out.println("Si cumple con el metodo de Luhn");
            } else {
                System.out.println("No cumple con el metodo de Luhn");
            }

        }

        public static int[] cambiados(int[] numeros){
            int[] resultado=new int[numeros.length];
            boolean x2=false;
            for(int i=numeros.length-1;i>=0;i--){
                if(x2==true){
                    int num=numeros[i]*2;
                    int sumatorio=0;
                    if(num>=10) {
                        String num1 = String.valueOf(num);
                        for (int j = 0; j < num1.length(); j++) {
                            sumatorio += Integer.parseInt(String.valueOf(num1.charAt(j)));
                        }
                        resultado[i] = sumatorio;
                    } else{
                        resultado[i] = num;
                    }

                } else resultado[i]=numeros[i];

                x2=!x2;
            }
            return resultado;

        }
        public static boolean Luhn(int[] UsarEnMetodo){
            int total=0;
            for(int i=0;i<UsarEnMetodo.length;i++){
                total+=UsarEnMetodo[i];
            }
            if(total%10!=0){
                return false;
            }

            return true;
        }

    }
