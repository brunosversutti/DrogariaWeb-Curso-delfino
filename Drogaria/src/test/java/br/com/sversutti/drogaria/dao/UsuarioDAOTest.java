package br.com.sversutti.drogaria.dao;

import java.text.ParseException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Pessoa;
import br.com.sversutti.drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);

		Usuario usuario = new Usuario();
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('A');
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);

		System.out.println("Usuário salvo com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();

		for (Usuario usuario : resultado) {
			System.out.println("Código do Usuário: " + usuario.getCodigo());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Tipo: " + usuario.getTipo());
			System.out.println("Ativo: " + usuario.getAtivo());
			System.out.println("Código da Pessoa: " + usuario.getPessoa().getCodigo());
			System.out.println("Nome da Pessoa: " + usuario.getPessoa().getNome());
			System.out.println("----------------------------------------");

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);

		System.out.println("----------------------------------------");

		System.out.println("Código do Usuário: " + usuario.getCodigo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Código da Pessoa: " + usuario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + usuario.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);

		usuarioDAO.excluir(usuario);
		System.out.println("----------------------------------------");

		System.out.println("Cliente removido: ");
		System.out.println("Código do Usuário: " + usuario.getCodigo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Código da Pessoa: " + usuario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + usuario.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoUsuario = 1L;
		Long codigoPessoa = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		System.out.println("Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da Pessoa: " + pessoa.getNome());
		System.out.println("----------------------------------------");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigoUsuario);
		System.out.println("----------------------------------------");

		System.out.println("Cliente a ser editado: ");
		System.out.println("Código do Usuário: " + usuario.getCodigo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Código da Pessoa: " + usuario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + usuario.getPessoa().getNome());

		usuario.setSenha("t5y6u7i8");
		usuario.setTipo('B');
		usuario.setAtivo(false);
		usuario.setPessoa(pessoa);
		System.out.println("----------------------------------------");

		usuarioDAO.editar(usuario);

		System.out.println("----------------------------------------");

		System.out.println("Cliente editado: ");
		System.out.println("Código do Usuário: " + usuario.getCodigo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Ativo: " + usuario.getAtivo());
		System.out.println("Código da Pessoa: " + usuario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + usuario.getPessoa().getNome());

		System.out.println("----------------------------------------");

		System.out.println("Usuário editado com sucesso!");

	}
}
