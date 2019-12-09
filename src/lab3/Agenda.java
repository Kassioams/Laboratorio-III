package lab3;

import java.util.Arrays;

/**
* Representação da criação da agenda dos contatos. 
* Será o local onde os contatos criados pelo usuário ficará.
*
* @author Kassio Silva - 119210551
*/

public class Agenda {
	
	/**
	* Representação dos contatos da agenda.
	* Os contatos ficarão em um array para posteriormente serem utilizados.
	* 
	*/


	private Contato[] contatos;
	
	/**
	* Constrói o array de contatos para a agenda.
	* Como definido, o array (agenda) terá no máximo 100 contatos.
	* 
	*/

	public Agenda() {
		this.contatos = new Contato[100];
	}
	
	/**
	* Constrói os contatos do usuário a serem cadastrados na agenda.
	* Os contatos serão criados com o nome, o sobrenome, o telefone e a posição onde deseja ser guardado.
	* Antes do cadastro verifica-se a posição observando se é válida ou não.
	* Se caso a posição não for válida o programa mostrará ao usuário que a posição é inválida.
	* Só após verficar se a posição a ser guardada é valida será feito o cadastro.
	*
	* @param nome o nome da pessoa a ser cadastrada.
	* @param sobrenome o sobrenome da pessoa a ser cadastrada.
	* @param telefone o número telefonico dessa pessoa.
	* @param posicao o número onde se guardar o contato na agenda.
	* @return o texto do resultado do cadastramento.
	*/
	
	public String cadastrarContato(String nome, String sobrenome,String telefone, int posicao) {
		if (posicao <= 0 || posicao > 100) {
			return "OPÇÃO INVÁLIDA!";
		} 
		else {
		Contato contato = new Contato(nome, sobrenome, telefone);
		this.contatos[posicao -1] = contato;
		return "CADASTRO REALIZADO!";
		}
	}
	
	/**
	* Representação da exibição de um contato da agenda.
	* O usuário irá pedir para exibir o contato em uma certa posição.
	* Antes de exibir verficará se há algum contato naquela posição ou não.
	* Se não existir mostrará que a posição é inválida.
	* Após verificar que é uma posição válida se mostrará o contato.
	* 
	* @param posicao um número indicando qual contato deseja exibir.
	* @return o texto da exibição do contato.
	*/
	
	public String exibirContato(int posicao) {
		if (posicao <= 0 || posicao > 100 || contatos[posicao-1] == null){
			return "POSIÇÃO INVÁLIDA!";
		}
		else {
		String retorno = "";
		retorno = contatos[posicao -1].toString();
		return retorno;
		}
	}
	
	/**
	* Representação da exibição de todos os contatos.
	* Selecionado a opção se mostrará todos os contatos cadastrados na agenda.
	* 
	* @return a exbição dos contatos da agenda.
	*/
	
	public String listarContatos() {
		String exibir = "";
		for (int i = 0; i < contatos.length; i ++) {
			if (contatos[i] != null) {
				exibir += i+1 + " - "  + contatos[i].getNome() + " " + contatos[i].getSobrenome() + System.lineSeparator();
			}
		}
		return exibir;
	}
	
	/**
	* Retorna um número que indica a posição na memória do objeto contatos.
	* 
	* @return a posicao do objeto.
	*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contatos);
		return result;
	}
	
	/**
	* Compara os dois objetos retorna se são iguais ou não.
	* 
	* @return o valor boleano do objeto.
	*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
	if (!Arrays.equals(contatos, other.contatos))
		return false;
	return true;
	}
}

