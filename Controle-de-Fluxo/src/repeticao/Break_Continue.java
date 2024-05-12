public class Break_Continue {
    public static void main(String[] args) {
         // Break interrompe todo o Laço
         // Continue, pula o ponto onde a interação atende à condicional

         for(int num = 1; num <= 5; num ++){
             if(num == 3){
                 break;
                 // o break não chega ao número 3, por que ele verifica se a consição é atendida ante de executar, sen do assim, a condição de parada é 3 e ele pára no 2.
             }
             System.out.println(num);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int num = 1; num <= 5; num ++){
            if(num == 3){
                continue;
                // O continue faz a execução e quando chega no valor da condional, 3 neste caso, ele pula este valor.
            }
        System.out.println(num);
    }
}
}
