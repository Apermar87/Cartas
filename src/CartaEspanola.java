import java.util.Random;

public class CartaEspanola extends CartaGenerica {

    public CartaEspanola() {
        super();
    }

    public CartaEspanola(String palo, int numero) {
        super(palo, numero);

        Random r = new Random();
        int carta = 0;

        if (numero < 1 || numero > 10) {
            carta = r.nextInt(10) + 1;
            super.setNumero(carta);
        }

        if (!palo.equals("Espadas") && !palo.equals("Copas") && !palo.equals("Oros") && !palo.equals("Bastos")) {
            carta = r.nextInt(4);
            switch (carta) {
                case 0:
                    super.setPalo("Espadas");
                    break;
                case 1:
                    super.setPalo("Copas");
                    break;
                case 2:
                    super.setPalo("Oros");
                    break;
                case 3:
                    super.setPalo("Bastos");
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
            case 8:
                figura = "Sota";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            case 9:
                figura = "Caballo";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            case 10:
                figura = "Rey";
                System.out.println("La carta es: " + figura + " de " + super.getPalo());
                break;
            default:
                super.mostrarCarta();
        }
    }
}
