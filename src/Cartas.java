import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        int numero;
        String palo;

        CartaEspanola cartaEspañola;
        CartaFrancesa cartaFrancesa;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un palo de carta española: ");
        palo = scanner.nextLine();

        System.out.println("Dame un numero de carta española: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        cartaEspañola = new CartaEspanola(palo, numero);

        System.out.println("Dame un palo de carta francesa: ");
        palo = scanner.nextLine();

        System.out.println("Dame un numero de carta francesa: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        cartaFrancesa = new CartaFrancesa(palo, numero);

        cartaEspañola.mostrarCarta();
        cartaFrancesa.mostrarCarta();

    }
}
