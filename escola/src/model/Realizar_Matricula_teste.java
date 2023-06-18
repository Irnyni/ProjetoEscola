package model;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Realizar_Matricula_teste {

    @Test
    void testListarTurmas() {
        // Teste para listar as turmas disponíveis
        Turma t = new Turma();
        List<String> options = t.listarTurmas();
        Assert.assertFalse(options.isEmpty()); // Verifica se a lista de turmas não está vazia
        System.out.println("Opções de turmas: " + options);
        
    }

    @Test
    void testEscolherTurmas() {
        // Teste para escolher as turmas
        Turma t = new Turma();
        List<String> options = t.listarTurmas();
        ArrayList<List> materiasEscolhidas = new ArrayList<List>();
        materiasEscolhidas.add(Arrays.asList(options.get(0), options.get(3))); // Adiciona turmas escolhidas à lista
        System.out.println("Matérias escolhidas: " + materiasEscolhidas);
        Assert.assertFalse(materiasEscolhidas.isEmpty()); // Verifica se a lista de turmas escolhidas não está vazia
    }

    @Test
    void testQuantidadeAtributosTurma() {
        // Teste para verificar a quantidade de atributos da classe Turma
        Turma T1 = new Turma("Juliano", 2, 2022, 25, "SALA 5", "DIURNO");
        Field[] campos = T1.getClass().getDeclaredFields();
        int quantidadeAtributos = campos.length;
        Assert.assertEquals(6, quantidadeAtributos); // Verifica se a quantidade de atributos é igual a 6
    }
    
    
    @Test
    void testQuantidadeTurmasEscolhidasB() {
        // Teste para verificar a quantidade de turmas escolhidas
    	 Turma t = new Turma();
         List<String> options = t.listarTurmas();
         ArrayList<List> materiasEscolhidas = new ArrayList<List>();
         materiasEscolhidas.add(Arrays.asList(options.get(0), options.get(3))); // Adiciona turmas escolhidas à lista
         // Verifica se a quantidade de disciplinas é a permitida
         Assert.assertTrue(materiasEscolhidas.get(0).size() <= 4);
    }
    
    @Test
    void testQuantidadeTurmasEscolhidasR() {
        // Teste para verificar a quantidade de turmas escolhidas
    	 Turma t = new Turma();
         List<String> options = t.listarTurmas();
         ArrayList<List> materiasEscolhidas = new ArrayList<List>();
         materiasEscolhidas.add(Arrays.asList(options.get(0),options.get(1),options.get(2),options.get(3), options.get(4))); // Adiciona turmas escolhidas à lista
        // Verifica se a quantidade de disciplinas é a permitida
         Assert.assertTrue(materiasEscolhidas.get(0).size() < 4);
    }
    
    
    @Test
    void testListarDisciplinas() {
        // Teste para listar as disciplinas disponíveis
        Disciplina d1 = new Disciplina("Matemática", "MT", "Matemática básica", true);
        Disciplina d2 = new Disciplina("Portugues", "pt", "Portugues básico", true);
        Disciplina d3 = new Disciplina("Biologia", "BIO", "Biologia médio", true);
        Disciplina d4 = new Disciplina("Filosofia", "FIL", "Filosofia Médio", true);
        ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
        lista.addAll(Arrays.asList(d1, d2, d3, d4));
        Assert.assertEquals(4, lista.size()); // Verifica se a lista de disciplinas tem tamanho igual a 4
    }

    @Test
    void testQuantidadeAtributosDisciplina() {
        // Teste para verificar a quantidade de atributos da classe Disciplina
        Disciplina d1 = new Disciplina("Matemática", "MT", "Matemática básica", true);
        Field[] campos = d1.getClass().getDeclaredFields();
        int quantidadeAtributos = campos.length;
        Assert.assertEquals(4, quantidadeAtributos); // Verifica se a quantidade de atributos é igual a 4
    }

    @Test
    void testOrdemDisciplinas() {
        // Teste para verificar a ordem das disciplinas na lista
        Disciplina d1 = new Disciplina("Matemática", "MT", "Matemática básica", true);
        Disciplina d2 = new Disciplina("Portugues", "pt", "Portugues básico", true);
        Disciplina d3 = new Disciplina("Biologia", "BIO", "Biologia médio", true);
        Disciplina d4 = new Disciplina("Filosofia", "FIL", "Filosofia Médio", true);
        ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
        lista.addAll(Arrays.asList(d1, d2, d3, d4));
        Assert.assertEquals(d1, lista.get(0)); // Verifica se a primeira disciplina na lista é d1
        Assert.assertEquals(d2, lista.get(1)); // Verifica se a segunda disciplina na lista é d2
        Assert.assertEquals(d3, lista.get(2)); // Verifica se a terceira disciplina na lista é d3
        Assert.assertEquals(d4, lista.get(3)); // Verifica se a quarta disciplina na lista é d4
        Assert.assertTrue(lista.contains(d1)); // Verifica se a lista contém a disciplina d1
        System.out.println(lista);
    }
    

    
    @Test
    void testCasoTurmaCheiarB() {
        // TESTE PARA VERIFICAR FLAG DE TURMA LOTADA E CHAMADA LISTA DE ESPERA
        // APRESENTAÇÃO DETALHADA DA TURMA, ACESSANDO O METODO DA CLASSE TURMA

        Turma T1 = new Turma("Juliano", 2, 2022, 24, "SALA 5", "DIURNO");
        Turma T2 = new Turma("Maria", 1, 2022, 23, "SALA 7", "NOTURNO");
        Turma T3 = new Turma("João", 1, 2022, 22, "SALA 3", "DIURNO");
        Turma T4 = new Turma("Ana", 1, 2022, 22, "SALA 2", "NOTURNO");
        ArrayList<Turma> listaTurmas = new ArrayList<Turma>();
        listaTurmas.addAll(Arrays.asList(T1, T2, T3, T4));
        System.out.println(listaTurmas);
        for (Turma turma : listaTurmas) {
            int quantidadeAlunos = turma.getQtdeAlunos();
            // Verifica se a quantidade de alunos é igual a 25
            Assert.assertTrue(quantidadeAlunos <= 25);

            if (quantidadeAlunos > 25) {

                System.out.println("LISTA DE ESPERA");

            }
        }
    }

    @Test
    void testCasoTurmaCheiarR() {
        // TESTE PARA VERIFICAR FLAG DE TURMA LOTADA E CHAMADA LISTA DE ESPERA
        // APRESENTAÇÃO DETALHADA DA TURMA, ACESSANDO O METODO DA CLASSE TURMA

        Turma T1 = new Turma("Juliano", 2, 2022, 25, "SALA 5", "DIURNO");
        Turma T2 = new Turma("Maria", 1, 2022, 25, "SALA 7", "NOTURNO");
        Turma T3 = new Turma("João", 1, 2022, 22, "SALA 3", "DIURNO");
        Turma T4 = new Turma("Ana", 1, 2022, 22, "SALA 2", "NOTURNO");
        ArrayList<Turma> listaTurmas = new ArrayList<Turma>();
        listaTurmas.addAll(Arrays.asList(T1, T2, T3, T4));
        System.out.println(listaTurmas);
        for (Turma turma : listaTurmas) {
            int quantidadeAlunos = turma.getQtdeAlunos();
            // Verifica se a quantidade de alunos é igual a 25
            Assert.assertTrue(quantidadeAlunos >= 25);

            if (quantidadeAlunos < 25) {

                System.out.println("LISTA DE ESPERA");

            }
        }
    }

    
    
}