public class Calculo {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 8;
        int nota4 = 3;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        boolean isAprovado = media >= 7;
        System.out.println("Aprovado: " + isAprovado);
    }
}
