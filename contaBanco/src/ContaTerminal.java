import java.util.Scanner;  
import java.util.Locale;

public class ContaTerminal {
 
    public static void main(String[] args) throws Exception {
    //TODO: conhecer importar a classe Scanner


     //Exibir as mensagens para o nosso usuário

     //Obter pelo scanner os valores digitados no terminal

     //Exibir a mensagem conta criada 

     /*Numero da conta(No exemplo dado fiquei em duvida então assimilei 
     como esse o numero da conta, já que a agência que seria como Int)
     */
     
        try (//criando Scanner
    Scanner novoScanner = new Scanner(System.in).useLocale(Locale.US)) {

        System.out.println("Agora, digite o seu Primeiro Nome");
          String nomeCliente = novoScanner.next();

          System.out.println("Por favor, digite o numero da sua Agência " );
          int agencia = novoScanner.nextInt(); 
        
          System.out.println("Agora, digite o numero da sua Conta");
          String numero = novoScanner.next();

          System.out.println("Agora, digite o seu Saldo");
          Double Saldo = novoScanner.nextDouble();

   

        //Resolução para o cliente

          System.out.println("Olá" + " "  + nomeCliente + " " + "obrigado por criar uma conta em nosso banco a sua agência é" + " "
          + agencia + " "+ ", conta" + " " + numero + " " + "e seu saldo de " + " " +
          + Saldo + "R$" + " " + "já está disponível para saque");
    }
        
 }
}
