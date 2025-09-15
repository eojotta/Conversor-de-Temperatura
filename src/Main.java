import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5 ) + 32;
        double kelvin = celcius + 273.15;

        System.out.println(celcius + "°C equivalem a : ");
        System.out.println(fahrenheit + "°F (Fahrenheit) ");
        System.out.println(kelvin + "K (kelvin)");

scanner.close();

    }
}