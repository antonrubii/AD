import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
System.out.println ("Introduzca un fichero de texto ");
        String RutaOriginal = scanner.nextLine();
 Scanner scanner2 = new Scanner (System.in);
        System.out.println("Tipos de orden disponibles:");
        System.out.println("asc_cs    - A-Z (distingue mayúsculas)");
        System.out.println("asc_ncs   - A-Z (no distingue mayúsculas)");
        System.out.println("desc_cs   - Z-A (distingue mayúsculas)");
        System.out.println("desc_ncs  - Z-A (no distingue mayúsculas)");
        System.out.println ("Introduzca la manera en la que quiere que se ordene : ");
       String tipoOrdenacion = scanner.nextLine().toLowerCase();

       List<String>lineas ;
    try{
       lineas = Files.readAllLines(Paths.get(RutaOriginal));
    }catch(Exception e){
    System.out.println("Error al leer el fichero :" + e.getMessage());
    scanner.close();
    return;
}
        Comparator<String> comparator;
        switch (tipoOrdenacion) {
            case "asc_cs":
                comparator = Comparator.naturalOrder(); // orden ascendente case-sensitive
                break;
            case "asc_ncs":
                comparator = String.CASE_INSENSITIVE_ORDER;
                break;
            case "desc_cs":
                comparator= Comparator.reverseOrder();
                break;
            case "desc_ncs":
                comparator = String.CASE_INSENSITIVE_ORDER.reversed();
                break;
            default:
                System.out.println("Tipo de orden no válido. Use uno de: asc_cs, asc_ncs, desc_cs, desc_ncs");
                scanner.close();
                return;

        }
        lineas.sort(comparator);
        }
        //ex4

    }