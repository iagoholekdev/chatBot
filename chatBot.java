import java.util.Scanner;
public class chatBot {

    static String retornaDesenho(){
        return "/***\n" +
                " *     █    ██  ███▄    █  ██▓ ▄▄▄▄    ▒█████  ▄▄▄█████▓\n" +
                " *     ██  ▓██▒ ██ ▀█   █ ▓██▒▓█████▄ ▒██▒  ██▒▓  ██▒ ▓▒\n" +
                " *    ▓██  ▒██░▓██  ▀█ ██▒▒██▒▒██▒ ▄██▒██░  ██▒▒ ▓██░ ▒░\n" +
                " *    ▓▓█  ░██░▓██▒  ▐▌██▒░██░▒██░█▀  ▒██   ██░░ ▓██▓ ░ \n" +
                " *    ▒▒█████▓ ▒██░   ▓██░░██░░▓█  ▀█▓░ ████▓▒░  ▒██▒ ░ \n" +
                " *    ░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒ ░▓  ░▒▓███▀▒░ ▒░▒░▒░   ▒ ░░   \n" +
                " *    ░░▒░ ░ ░ ░ ░░   ░ ▒░ ▒ ░▒░▒   ░   ░ ▒ ▒░     ░    \n" +
                " *     ░░░ ░ ░    ░   ░ ░  ▒ ░ ░    ░ ░ ░ ░ ▒    ░      \n" +
                " *       ░              ░  ░   ░          ░ ░           \n" +
                " *                                  ░                   \n" +
                " */\n" +
                "\n";
    }
    static double DiminuirSaldo(double saldo, double valor){
        return (saldo - valor);
    }
    static boolean ValidateSaldo(double SaldoDigitado) {
        final int zero = 0;
        return (SaldoDigitado > zero);
    }

    static boolean validateNome(String nome) {
        return nome.equals("");
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println(chatBot.retornaDesenho());
        System.out.println("Bem vindo ao UniBot");
        System.out.println("---------------------");
        System.out.print("Por favor digite o seu nome completo: ");
        String nome = myScanner.next();
        if (chatBot.validateNome(nome)) {
            while (nome.isEmpty()){
                String nomeNovo = myScanner.next();
                nome = nomeNovo;
                System.out.println("Por favor digite o seu nome completo");
            }
        }
        System.out.print("Por favor digite o seu endereço: ");
        String endereco = myScanner.next();
        System.out.print("Número: ");
        int numero = myScanner.nextInt();
        System.out.print("Bairro: ");
        String bairro = myScanner.next();
        System.out.print("Quanto de saldo você tem? ");
        double saldo = myScanner.nextDouble();

        if (chatBot.ValidateSaldo(saldo)) {
            double saldoNovo = 0;
            while (saldo < 0) {
                System.out.println("Seu saldo não pode ser menor que zero! Digite novameente!");
                saldoNovo = myScanner.nextDouble();
                saldo = saldoNovo;
            }

        }

        boolean continuar = true;

        while (continuar) {
            System.out.print("Qual ação você deseja realizar ?" +
                    "1 - Consultar Saldo (Imprimir saldo atual)"  +
                    "2 - Fazer retirada (Retirar saldo da conta)" +
                    "3 - Realizar depósito (Depositar dinheiro)" +
                    "4 - Extrato (Imprimir a quantidade de operações/Depósito ou Retirada)" +
                    "5 - Consultar Endereço (Imprimir endereço) " +
                    "6 - Alterar endereço (Alterar endereço atual)" +
                    "9 - Sair");

            int opcao = myScanner.nextInt();




        }


    }
}
