package sistema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		boolean executar = true;
		
		while (executar == true) {
			
			System.out.println(" \n\n"
			        + "            --- Sistema --- \n\n\n"
			        + "1 --- Cadastrar cliente no sistema\n\n"
			        + "2 --- Validar CPF de um cliente\n\n"
			        + "3 --- Cadastrar um restaurante\n\n"
			        + "4 --- Fazer pedido\n\n"
			        + "5 --- Ver o cardapio\n\n"
			        + "6 --- Pedir o preço de um pedido\n\n"
			        + "7 --- Adicionar mais um item no pedido\n\n"
			        + "8 --- Remover um item do pedido\n\n"
			        + "9 --- Ver a lista de pedidos feitos\n\n"
			        + "10 --- Atualizar o preço de um item no cardapio\n\n"
			        + "11 --- Adicionar mais um item ao cardápio\n\n"
			        + "12 --- Remover um item do cardapio\n\n\n\n"
			        + "Escolha um número para executar uma ação ou digite 666 para encerrar o sistema: \n");
			
			int acao = scanner.nextInt();
			
			if (acao != 666) {
				
				if (acao == 0) {
					
				}
				
				
				
			}else {
				System.out.println("\nEncerrando sistema...");
				executar = false;
			}
			
		}
				
	}

}
