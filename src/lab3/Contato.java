package lab3;

/**
* Representação a construção do contato. 
* Mostra como o contato é montado. 
*
* @author Kassio Silva - 119210551
*/

public class Contato {

	/**
	* Representação do nome da pessoa a ser cadastrado.
	* 
	*/
	
	private String nome;
	
	/**
	* Representação sobrenome da pessoa a ser cadastrado.
	* 
	*/
	
	private String sobrenome;
	
	/**
	* Representação do telefone da pessoa a ser cadastrado.
	* 
	*/
	
	private String telefone;
	
	/**
	* Constrói o contato usando o nome, sobrenome e o telefone.
	* 
	*
	* @param nome o nome da pessoa para o contato.
 	* @param sobrenome o sobrenome da pessoa para o contato.
	* @param telefone o telefone da pessoa.
	*/
	
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	/**
	* Representação do contato de forma completa como será exibido.
	*
	* @return o texto da criação do contato.
	*/
	
	@Override
	public String toString() {
	return nome + " " + sobrenome + " - " + telefone;
	}
	
	/**
	* Retorna o valor do atributo nome.
	*
	* @return o valor do atributo.
	*/

	public String getNome() {
		return nome;
	}
	
	/**
	* Realiza a alteração do valor do atributo nome.
	*
	* @param nome o nome do contato.
	*/

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	* Retorna o valor do atributo sobrenome.
	*
	* @return o valor do atributo.
	*/
	
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	* Realiza a alteração do valor do atributo sobrenome.
	*
	* @param sobrenome o sobrenome do contato.
	*/
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	* Retorna o valor do atributo telefone.
	*
	* @return o valor do atributo.
	*/

	public String getTelefone() {
		return telefone;
	}
	
	/**
	* Realiza a alteração do valor do atributo nome.
	*
	* @param telefone o telefone do contato.
	*/

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Retorna um número que indica a posição do objeto na memória.
	 * 
	 * @return o número da posição do contato.
	*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	/**
	 * Compara dois objetos retorna se são iguais ou não.
	 * 
	 * @return o valor boleano da comparação.
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
}
	