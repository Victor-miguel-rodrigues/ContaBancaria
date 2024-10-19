import br.com.ContaBancaria.conta.contaPoupança.ContaPoupanca;
// import br.com.ContaBancaria.conta.gerenciadoDeConta.Conta;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca();

        cp.setUsuario("rico");
        cp.setSaldoDaConta(100);

        int escolha;
        String tela =  """
                    1 - Depositar
                    2 - Sacar
                    3 - Ver Saldo
                    4 - Sair
                    """;

        do{
            System.out.println("Digite sua escolha");
            System.out.println(tela);
            escolha = scan.nextInt();


            switch (escolha){
                // depositaar
                case 1:
                    System.out.print("Digite valor de Deposito :");
                    double deposits = scan.nextDouble();
                    if(deposits < 1){
                        System.out.println("Deposito invalido");
                    }else{
                        cp.setDeposito(deposits);
                    }
                    break;
                //Sacar
                case  2:
                    System.out.print("Digite Valor Para Sacar :");
                    double sacar = scan.nextDouble();
                    if(sacar > cp.getSaldoDaConta()){
                        System.out.println("Saque Não pode Ser maior que Saldo");
                    }else if(sacar < 1){
                        System.out.println("Saque Não pode Ser Negativo");
                    }else{
                        cp.setTransferencia(sacar);
                    }
                    break;
                // mostra Saldo
                case 3:
                    System.out.printf("Saldo R$%f \n",cp.getSaldoDaConta());
                    break;
                //Encerrar Programa
                case 4:
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Digite um valor valido");
            }

        }while(escolha != 4);

    }
}
