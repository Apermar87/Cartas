public class CartaGenerica {
    private String palo;
    private int numero;

    public CartaGenerica(){
        palo = "";
        numero = 0;
    }

    public CartaGenerica(String palo, int numero){
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostrarCarta(){
        System.out.println("La carta es el " + numero + " de " + palo);
    }
    
}
