package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Realizar_Matricula_teste {

	@Test
	void test() {

		Aluno a2 = new Aluno();
        a2.setIdade(2);
		
		assertEquals(2, a2.getIdade());
	
	}

}
