import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em fahrenheit: ");
        double fahrenheit = input.nextDouble();
        final double ajuste = 32;
        double celsius = (fahrenheit - ajuste) * 5 / 9;

        System.out
                .println("A temperatura " + fahrenheit + " convertida para Celcius é equivalente a " + celsius + "ºC");

    }
}
