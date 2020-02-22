package br.com.sversutti.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Cliente;
import br.com.sversutti.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("20/01/2020"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

		System.out.println("Cliente salvo com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();

		for (Cliente cliente : resultado) {
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
			System.out.println("Liberado: " + cliente.getLiberado());
			System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
			System.out.println("Nome da Pessoa: " + cliente.getPessoa().getNome());
			System.out.println("----------------------------------------");

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		System.out.println("----------------------------------------");

		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + cliente.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		clienteDAO.excluir(cliente);
		System.out.println("----------------------------------------");

		System.out.println("Cliente removido: ");
		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + cliente.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoCliente = 1L;
		Long codigoPessoa = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		System.out.println("Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da Pessoa: " + pessoa.getNome());
		System.out.println("----------------------------------------");

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		System.out.println("----------------------------------------");

		System.out.println("Cliente a ser editado: ");
		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + cliente.getPessoa().getNome());

		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("10/01/2020"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);
		System.out.println("----------------------------------------");

		clienteDAO.editar(cliente);

		System.out.println("----------------------------------------");

		System.out.println("Cliente editado: ");
		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome da Pessoa: " + cliente.getPessoa().getNome());

		System.out.println("----------------------------------------");

		System.out.println("Cliente editado com sucesso!");

	}
}
