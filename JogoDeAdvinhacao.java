import java.util.Scanner;
import java.util.Random;
public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        var NumeroAleatorio = rand.nextInt(1 , 101);
        var MaxTentaivas = 10;
        int tentativas = 0;
        while (true) {
            System.out.println("digite um número Inteiro aleatório de 1 a 100: ");
            var Palpite = scanner.nextInt();
            tentativas++;
           
            if (Palpite > NumeroAleatorio) {
                System.out.println("O número é menor");
            }
            else if (Palpite < NumeroAleatorio) {
                System.out.println("O número é maior");
                
            }
            else if (Palpite == NumeroAleatorio) {
                System.out.println("parabéns você acertou o Número! <3");
                break;
            }
            // Preciso verificar se o jogador atingiu o limite de tentaiva
            if (tentativas >= MaxTentaivas) {
                System.out.println("Você atingiu o limite máximo de tentativas. O número era: " + NumeroAleatorio);
                System.out.println("Quer jogar novamente? (S/N)");
                scanner.nextLine();
                String JogarNovamente = scanner.nextLine();
                // reiniciar o joguinho
                if (JogarNovamente.equalsIgnoreCase("S")) {
                    NumeroAleatorio = rand.nextInt(100) + 1;
                    tentativas = 0; 
                    continue; 
                } else {
                    break;
                }
            }
        }
         scanner.close();
    }
}
