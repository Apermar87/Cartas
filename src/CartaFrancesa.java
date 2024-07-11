import java.util.Random;

public class CartaFrancesa extends CartaGenerica {

    public CartaFrancesa() {
        super();
    }

    public CartaFrancesa(String palo, int numero) {
        super(palo, numero);

        Random r = new Random();
        int carta = 0;

        if (numero < 1 || numero > 13) {
            carta = r.nextInt(13) + 1;
            super.setNumero(carta);
        }

        if (!palo.equals("Corazones") && (!palo.equals("Picas")) && (!palo.equals("Rombos"))
                && (palo.equals("Tréboles"))) {
            carta = r.nextInt(4);

            switch (carta) {
                case 0:
                    super.setPalo("Corazones");
                    break;
                case 1:
                    super.setPalo("Picas");
                    break;
                case 2:
                    super.setPalo("Rombos");
                    break;
                case 3:
                    super.setPalo("Tréboles");
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void mostrarCarta() {
        String figura;

        switch (super.getNumero()) {
            case 11:
                figura = "Jota";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            case 12:
                figura = "Reina";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            case 13:
                figura = "Rey";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            default:
                super.mostrarCarta();
        }
    }

}
