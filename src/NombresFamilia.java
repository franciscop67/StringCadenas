import javax.naming.spi.StateFactory;
import java.util.Scanner;

public class NombresFamilia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre");
        String nombreO1 = scanner.nextLine();
        String nombreM1= nombreO1.toUpperCase().charAt(1) + "." + nombreO1.substring(nombreO1.length()-2);

        System.out.println("Ingresa el segundo nombre");
        String nombreO2 = scanner.nextLine();
        String nombreM2= nombreO2.toUpperCase().charAt(1) + "." + nombreO2.substring(nombreO2.length()-2);

        System.out.println("Ingresa el tercer nombre");
        String nombreO3 = scanner.nextLine();
        String nombreM3= nombreO3.toUpperCase().charAt(1) + "." + nombreO3.substring(nombreO3.length()-2);

        String combinacion =  nombreM1 + "_" + nombreM2 + "_" + nombreM3;
        System.out.println(combinacion);
    }
}
