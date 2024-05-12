import java.util.concurrent.ThreadLocalRandom;

public class LacoWhile {
    public static void main(String[] args) {
    double mesada = 50.0;
    
    while (mesada > 0){
        Double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
                System.out.println("Valor do Doce: R$ " + valorDoce + " adicionado ao Carrinho.");
            }
        }
        System.out.println("Mesada: R$ " + mesada);
        System.out.println("Joãozinho gastou toda a mesada em doces!!!");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2 , 8);
    }
}