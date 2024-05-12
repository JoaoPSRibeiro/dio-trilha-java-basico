public class ResultadoEscolar3 {
    public static void main(String[] args) {
        int nota = 3;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        // resultado vai receber a comparação se nota for >= 7 -> resultado = aprovado, senão -> resultado = reprovado
        System.out.println(resultado);
    }
}
