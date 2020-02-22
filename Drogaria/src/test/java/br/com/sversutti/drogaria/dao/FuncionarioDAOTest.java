package br.com.sversutti.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Funcionario;
import br.com.sversutti.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {

	@Test
	@Ignore
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Funcionario funcionario = new Funcionario();
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
		funcionario.setCarteiraTrabalho("CLT");
		funcionario.setPessoa(pessoa);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);

		System.out.println("Funcionário salvo com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();

		for (Funcionario funcionario : resultado) {
			System.out.println("Código do Funcionário: " + funcionario.getCodigo());
			System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
			System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
			System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
			System.out.println("Nome da Pessoa: " + funcionario.getPessoa().getNome());
			System.out.println("----------------------------------------");

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		System.out.println("----------------------------------------");

		System.out.println("Código do Funcionário: " + funcionario.getCodigo());
		System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
		System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + funcionario.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		funcionarioDAO.excluir(funcionario);
		System.out.println("----------------------------------------");

		System.out.println("Cliente removido: ");
		System.out.println("Código do Funcionário: " + funcionario.getCodigo());
		System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
		System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + funcionario.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoFuncionario = 1L;
		Long codigoPessoa = 2L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		System.out.println("Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da Pessoa: " + pessoa.getNome());
		System.out.println("----------------------------------------");

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		System.out.println("----------------------------------------");

		System.out.println("Funcionário a ser editado: ");
		System.out.println("Código do Funcionário: " + funcionario.getCodigo());
		System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
		System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + funcionario.getPessoa().getNome());

		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("05/12/2019"));
		funcionario.setCarteiraTrabalho("Emprego");
		funcionario.setPessoa(pessoa);
		System.out.println("----------------------------------------");

		funcionarioDAO.editar(funcionario);

		System.out.println("----------------------------------------");

		System.out.println("Funcionário editado: ");
		System.out.println("Código do Funcionário: " + funcionario.getCodigo());
		System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
		System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + funcionario.getPessoa().getNome());

		System.out.println("----------------------------------------");

		System.out.println("Cliente editado com sucesso!");

	}
}
