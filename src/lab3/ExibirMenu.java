package lab3;

import java.util.Scanner;

/**
* Representação da exibição do menu da agenda. 
* Todas as operações serão realizadas por esse menu.
*
* @author Kassio Silva - 119210551
*/

public class ExibirMenu {
	
	/**
	* Representação dos textos a serem exibidos pelo menu ao usuário . 
	* 
	* @return o texto da exibição do menu.
	*/
	
	private static String exibir() {
		String textos = "(C)adastrar contato" + System.lineSeparator() + "(L)istar Contatos" +
				System.lineSeparator() + "(E)xibir Contato" + System.lineSeparator() +
				"(S)air" + System.lineSeparator() + "Opção> ";
		return textos;
	}
	
	/**
	* Representação das opções que o usuário tem a escolher para montar sua agenda. 
	* Cada opção está interligada as outras classes que executarão o que lhe for exigido.
	* O usuário terá opções de criar, listar e exibir contatos na agenda, além de sair da própria.
	*
	*/

	
	public static void main (String[] args) {
		System.out.println(exibir());
		Scanner sc = new Scanner(System.in);
		String opcao = sc.nextLine().toUpperCase();
		Agenda agenda = new Agenda();
		do {
			switch (opcao) {
			case "C":
				System.out.print("Posição: ");
				int posicao = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Sobrenome: ");
				String sobrenome = sc.nextLine();
				
				System.out.println("Telefone: ");
				String telefone = sc.nextLine();
				
				String msg = agenda.cadastrarContato(nome, sobrenome, telefone, posicao);
				System.out.println(msg);
				break;
			case "L":
				System.out.println(agenda.listarContatos());
				break;
			case "E":
				System.out.println("Posição: ");
				posicao = sc.nextInt();
				sc.nextLine();
				System.out.println(agenda.exibirContato(posicao));
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			System.out.println(exibir());
			opcao = sc.nextLine().toUpperCase();
		} while (!"S".equals(opcao));
	}
}