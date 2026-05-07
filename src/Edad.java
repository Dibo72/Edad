import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad:");
        int edad = sc.nextInt();
        if (edad <= 18) {
            System.out.println("Es menor de edad");
        }else if (edad >= 65) {
            System.out.println("Es jubilado");
        }else{
            System.out.println("Es mayor de edad");
        }
    }
}