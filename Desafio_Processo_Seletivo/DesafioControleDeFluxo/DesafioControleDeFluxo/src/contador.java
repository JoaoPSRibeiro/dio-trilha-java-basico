
import java.util.Scanner;

public class contador {
public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo valor: ");
    int parametroDois = terminal.nextInt();

    try{
        contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException e){
        System.out.println("O Segundo parametro deve ser MAIOR que o primeiro.");
    }
// }
}
static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    if(parametroUm < parametroDois){
        int contagem = parametroDois - parametroUm;
            for(int valor = 0; valor != contagem; valor++){
                System.out.println("Imprimindo o nº " + (valor +1));
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}