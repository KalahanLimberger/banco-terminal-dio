import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Criando uma conta...");
        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();

        System.out.println("Insira o numero da agência:");
        String ag = sc.nextLine();

        System.out.println("Insira o número da conta:");
        int num = sc.nextInt();

        System.out.println("Insira o valor do seu primeiro depósito:");
        float saldo = sc.nextFloat();
        
        ContaTerminal c1 = new ContaTerminal(num, ag, nome, saldo);
        
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ ag +", conta "+ num +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}
