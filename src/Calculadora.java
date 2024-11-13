import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // llamar la función scanner
        Scanner scan = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido a la calculadora en Java");

        while (!salir) {
            System.out.println("\nElige una operación:");
            System.out.println("1. Sumar");;
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            System.out.println("Ingresa una opción");
            int opcion = scan.nextInt();

            if (opcion == 0){
                salir = true;
                System.out.println("Gracias por ingresar a la calculadora");
                break;
            }

            System.out.println("Ingresa el primer número:");
            int num1 = scan.nextInt();

            System.out.println("Ingresa el segundo número:");
            int num2 = scan.nextInt();

            double resultado = 0;


            // utilizamos el metodo swictch para la función de la calculadora
            switch (opcion){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0){
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                }else {
                        System.out.println("Error: no se puede dividir entre cero.🙄");
                    }
                    break;
                default:
                    System.out.println("opción no válida. Intentalo de nuevo.");
            }
        }
        scan.close();
    }
}
