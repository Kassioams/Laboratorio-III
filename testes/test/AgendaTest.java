package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Agenda;

public class AgendaTest {

    private Agenda numeros;
    
    @BeforeEach
    	public void cadastrarContato() {
            this.numeros = new Agenda();
    }
    
	@Test
	void testaCadastroContatoPosicaoInicial() {
		assertEquals("CADASTRO REALIZADO!", numeros.cadastrarContato("Matheus", "Gaudencio","99999-0000", 1));
	}
	
	@Test
	void testaCadastroContatoPosicaoFinal() {
		assertEquals("CADASTRO REALIZADO!", numeros.cadastrarContato("Maria", "Flor", "+1 (595) 5555-1234", 100));
	}
	
	@Test
    void testaCadastroContatoPosicaoInvalida0() {
        assertEquals("OPÇÃO INVÁLIDA!", numeros.cadastrarContato("Kassio","Augusto","65447-2125", 0));
	}
	
	@Test
    void testaCadastroContatoPosicaoInvalida101() {
        assertEquals("OPÇÃO INVÁLIDA!", numeros.cadastrarContato("Kassio","Augusto","32411-0325", 101));
	}
	
	@Test
    void testaCadastroContatoNaPosicao7() {
        assertEquals("CADASTRO REALIZADO!", numeros.cadastrarContato("Kassio","Augusto","74748-1253", 7));
	}
	
	@Test
	void testaCadastroContatoNaPosicao1Preenchida() {
		numeros.cadastrarContato("Jessica", "Gabriele","(81) 57436-9851", 1);
		assertEquals("CADASTRO REALIZADO!", numeros.cadastrarContato("Pedro", "Silva", "98888-11111", 1));
	}
	
	@Test
	void testaCadastroContatoPosicao1000() {
		assertEquals("OPÇÃO INVÁLIDA!", numeros.cadastrarContato("Andre", "Caio", "97488-131791", 1000));
	}
	@Test
	void testaCadastroContatoNaPosicaoNegativa(){
		assertEquals("OPÇÃO INVÁLIDA!", numeros.cadastrarContato("Carlos", "Lopes", "78488-101331", -147536));

	}
	
	@Test
	void exibirContatoNaPosicaoInicial() {
		assertEquals("POSIÇÃO INVÁLIDA!", numeros.exibirContato(0));
	}
	
	@Test
	void exibirContatoNaPosicaoFinal() {
        numeros.cadastrarContato("Vitoria","Sabrina","44527-3281", 100);
		assertEquals("Vitoria Sabrina - 44527-3281", numeros.exibirContato(100));
	}
	
	@Test
	void exibirContatoNaPosicaoNegativo() {
		assertEquals("POSIÇÃO INVÁLIDA!", numeros.exibirContato(-1));
	}
	
	@Test
	void exibirContatoNaPosicao7() {
        numeros.cadastrarContato("Jacy","Evelyn","90748-1253", 7);
		assertEquals("Jacy Evelyn - 90748-1253", numeros.exibirContato(7));
	}
	
	@Test
	void exibirContatoNaPosicao3() {
		assertEquals("POSIÇÃO INVÁLIDA!", numeros.exibirContato(3));
	}
		
	@Test
	void listarTodosOsContatoDaAgenda() {
		numeros.cadastrarContato("Kassio", "Augusto","74185296", 5);
		numeros.cadastrarContato("Rejane", "Rodrigues","8565412", 100);
		numeros.cadastrarContato("Antonio", "Lopes","0152654", 1);
		numeros.cadastrarContato("Karla", "Jarlita","56842665", 70);
		String texto = "1 - Antonio Lopes" + System.lineSeparator() +
				"5 - Kassio Augusto" + System.lineSeparator() + "70 - Karla Jarlita" + System.lineSeparator() +
				"100 - Rejane Rodrigues" + System.lineSeparator();
		
		assertEquals(texto, numeros.listarContatos());
	}
	
	@Test
	void listarTodosOsContatoDaAgenda2() {
		numeros.cadastrarContato("Matheus", "Andrade","1235108724", 15);
		numeros.cadastrarContato("Vinicius", "Albuquerque","305028479", 98);
		numeros.cadastrarContato("Elias", "Silva","321988774", 1);
		numeros.cadastrarContato("Arimateia", "Lopes","56842665", 67);
		String texto = "1 - Elias Silva" + System.lineSeparator() +
				"15 - Matheus Andrade" + System.lineSeparator() + "67 - Arimateia Lopes" + System.lineSeparator() +
				"98 - Vinicius Albuquerque" + System.lineSeparator();
		
		assertEquals(texto, numeros.listarContatos());
	}
}