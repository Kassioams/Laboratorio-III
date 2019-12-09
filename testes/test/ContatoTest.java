package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Contato;

public class ContatoTest {

    private Contato contatos;
    
    private Contato contatos2;
    
    @BeforeEach 
    public void criaContato() {
           this.contatos = new Contato("Renildo","Dantas", "230136589");
           this.contatos2 = new Contato("Flavio", "Miguel", "974141364");
    }
    
    @Test 
    void testaNomeDosContatos() {
    	assertEquals("Renildo Dantas - 230136589", contatos.toString());
    }
    
    @Test
    void testaNomeCriarContatos() {
    	assertEquals("Flavio Miguel - 974141364", contatos2.toString());
    	
    }
    
    
    @Test
    void testaComparaContatos() {    
    	Contato testeContatoPrimario = new Contato("Wesley", "Santos", "21 55367-9665");
    	Contato testeContatoSubstituto = new Contato("Wesley", "Santos", "21 44589-9665");
    	assertTrue(testeContatoPrimario.equals(testeContatoSubstituto));
    }
    
    @Test
    void testaSubstituição() {
    	Contato testeContatoOriginal = new Contato("João", "Lucas", "21 74509-8761");
    	Contato testeContatoModificado = new Contato("João", "Lucas", "21 74509-5547");
    	assertTrue(testeContatoOriginal.equals(testeContatoModificado));
    }
    
    @Test  
    void testaEqualsMudanca() {
        Contato testeContatoInicial = new Contato("Jose", "Agostinho", "17 94002-8922");
        Contato testeContatoTrocar = new Contato("Jose", "Agostinho", "17 87465-8922");
    	assertTrue(testeContatoInicial.equals(testeContatoTrocar));
    }
}