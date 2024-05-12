package Excecoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Digite seu nome: ");;
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome:  ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura: ");
            Double altura = scanner.nextDouble();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " +  sobreNome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é: " + altura + "cm");
            scanner.close();
        }catch(InputMismatchException e){
            System.out.println("Os campos idade e alturas precisam ser numéricos.");
        }

    }
}

