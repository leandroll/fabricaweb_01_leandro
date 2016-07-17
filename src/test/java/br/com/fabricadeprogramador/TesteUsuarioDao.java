package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.usuarioDao;

public class TesteUsuarioDao {

	public static void main(String[] args) {
		//testeCadastrar();
		//testeAlterar();
		testeDeletar();

	}

	private static void testeDeletar() {
		Usuario usu = new Usuario();
		
		usuarioDao usuDao = new usuarioDao();
		usu.setId(1);
		usuDao.deletar(usu);
		
		System.out.println("Usuário deletado com sucesso");
		
	}

	private static void testeCadastrar() {
		Usuario usu = new Usuario();
		
		usu.setNome("joazão");
		usu.setLogin("jão");
		usu.setSenha("123");
		
		usuarioDao usuDao = new usuarioDao();
		usuDao.cadastrar(usu);
		
		System.out.println("alterado com sucesso");
	}
	
	private static void testeAlterar() {
		Usuario usu = new Usuario();
		
		usu.setId(1);
		usu.setNome("big joe");
		usu.setLogin("bg");
		usu.setSenha("12356");
		
		usuarioDao usuDao = new usuarioDao();
		usuDao.alterar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}

}
