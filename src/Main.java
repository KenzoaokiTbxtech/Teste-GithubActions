public class Main {

    public static void main(String[] args) {
        int totalRepeticoes = 10;

        exibirMensagemInicial();
        repetirHelloWorld(totalRepeticoes);
        exibirMensagemFinal(totalRepeticoes);
    }

    public static void exibirMensagemInicial() {
        System.out.println("Iniciando o programa...");
    }

   
    public static void repetirHelloWorld(int total) {
        for (int i = 0; i < total; i++) {
            System.out.println("Hello world - repetição " + (i + 1));

            if (i == total - 1) {
                System.out.println("Última repetição executada!");
            }
        }
    }


    public static void exibirMensagemFinal(int total) {
        System.out.println("Programa finalizado com sucesso!");
        System.out.println("Total de repetições: " + total);
    }
}
