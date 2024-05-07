

import java.util.Random;
import java.util.Scanner;

public class PedraPapelOuTesoura {
	
    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        
        //esse true faz com que seja criado um looping 
        while (true) {
            // Exibição do menu
            System.out.println("O que você quer jogar?");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("0 - Sair");

            // Leitura da escolha do usuário
            int escolhaUsuario = entrada.nextInt();

            //escolha de sair do jogo 
            if (escolhaUsuario == 0) {
                System.out.println("Até logo!");
                break;
            }
            
            //criando a condição que caso o usuario jogue um numero menor que um ou maior que 3 de a opção invalida 
            if (escolhaUsuario < 1 || escolhaUsuario > 3) {
                System.out.println("Escolha inválida. Por favor, escolha entre 1, 2, 3 ou 0 para sair.");
                continue;
            }

            // Tradução da escolha do usuário para texto para ficar melhor e mais prático 
            //array para armazenar as opções
            //Como os índices em Java começam em 0, 
            //precisamos subtrair 1 do número escolhido pelo usuário para obter o índice correto no array opcoes
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            String escolhaUsuarioStr = opcoes[escolhaUsuario - 1];

            // Geração da escolha aleatória da máquina
            int escolhaMaquina = random.nextInt(3) + 1;
            String escolhaMaquinaStr = opcoes[escolhaMaquina - 1];

            // Exibição das escolhas
            System.out.println("Você escolheu: " + escolhaUsuarioStr);
            System.out.println("A máquina escolheu: " + escolhaMaquinaStr);

            // Determinação do vencedor
            if (escolhaUsuario == escolhaMaquina) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 1 && escolhaMaquina == 3) ||
                       (escolhaUsuario == 2 && escolhaMaquina == 1) ||
                       (escolhaUsuario == 3 && escolhaMaquina == 2)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("A máquina venceu!");
            }
        }
        entrada.close();
    }
}

