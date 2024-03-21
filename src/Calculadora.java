import java.util.Scanner;

public class Calculadora {
    private static boolean mantenerEnSistema = true;
    public static float sumar(float num1, float num2){
        return num1+num2;
    }
    public static float restar(float num1, float num2){
        return num1-num2;
    }
    public static float multiplicar(float num1, float num2){
        return num1*num2;
    }
    public static float dividir(float num1, float num2){
        return num1/num2;
    }
    public static void menu(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al menú de la calculadora\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nIngrese el tipo de operación: ");
            int tipoOperacion = sc.nextInt();
            switch (tipoOperacion){
                case 1:
                    Scanner scanSuma1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer dato para la operación: ");
                    float sum1 = scanSuma1.nextFloat();
                    Scanner scanSuma2 = new Scanner(System.in);
                    System.out.println("Ingrese el segundo dato para la operación: ");
                    float sum2 = scanSuma2.nextFloat();
                    System.out.println("La suma de los dos dígitos es: "+sumar(sum1, sum2));
                    break;
                case 2:
                    Scanner scanResta1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer dato para la operación: ");
                    float res1 = scanResta1.nextFloat();
                    Scanner scanResta2 = new Scanner(System.in);
                    System.out.println("Ingrese el segundo dato para la operación: ");
                    float res2 = scanResta2.nextFloat();
                    System.out.println("La resta de los dos dígitos es: "+restar(res1, res2));
                    break;
                case 3:
                    Scanner scanMultiplicacion1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer dato para la operación: ");
                    float mult1 = scanMultiplicacion1.nextFloat();
                    Scanner scanMultiplicacion2 = new Scanner(System.in);
                    System.out.println("Ingrese el segundo dato para la operación: ");
                    float mult2 = scanMultiplicacion2.nextFloat();
                    System.out.println("La multiplicación de los dos dígitos es: "+multiplicar(mult1, mult2));
                    break;
                case 4:
                    Scanner scanDivision1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer dato para la operación: ");
                    float div1 = scanDivision1.nextFloat();
                    Scanner scanDivision2 = new Scanner(System.in);
                    System.out.println("Ingrese el segundo dato para la operación: ");
                    float div2 = scanDivision2.nextFloat();
                    System.out.println("La multiplicación de los dos dígitos es: "+dividir(div1, div2));
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    mantenerEnSistema = false;
                    break;
            }
        } while(mantenerEnSistema);
    }
    
    public static void main(String[] args) {
        menu();
    }

}
