package br.com.sversutti.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Cidade;
import br.com.sversutti.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void salvar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(new Long("1"));

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Bruno Sversutti Teles");
		pessoa.setCpf("46070952812");
		pessoa.setRg("571618297");
		pessoa.setRua("Euclides da Cunha");
		pessoa.setNumero(new Short("450"));
		pessoa.setBairro("Centro");
		pessoa.setCep("16210000");
		pessoa.setComplemento("Casa");
		pessoa.setTelefone("1836591149");
		pessoa.setCelular("18997349881");
		pessoa.setEmail("sversuttibruno@gmail.com");
		pessoa.setCidade(cidade);

		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);

		System.out.println("Pessoa salva com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();

		for (Pessoa pessoa : resultado) {
			System.out.println("*Código da Pessoa: " + pessoa.getCodigo());
			System.out.println("*Nome: " + pessoa.getNome());
			System.out.println("*CPF: " + pessoa.getCpf());
			System.out.println("*RG: " + pessoa.getRg());
			System.out.println("*Rua: " + pessoa.getRua());
			System.out.println("*Número: " + pessoa.getNumero());
			System.out.println("*Bairro: " + pessoa.getBairro());
			System.out.println("*Cep: " + pessoa.getCep());
			System.out.println("*Complemento: " + pessoa.getComplemento());
			System.out.println("*Telefone: " + pessoa.getTelefone());
			System.out.println("*Celular: " + pessoa.getCelular());
			System.out.println("*Email: " + pessoa.getEmail());
			System.out.println("*Código da Cidade: " + pessoa.getCidade().getCodigo());
			System.out.println("*Nome da Cidade: " + pessoa.getCidade().getNome());
			System.out.println("*Código do Estado: " + pessoa.getCidade().getEstado().getCodigo());
			System.out.println("*Nome do Estado: " + pessoa.getCidade().getEstado().getNome());
			System.out.println("*Sigla do Estado: " + pessoa.getCidade().getEstado().getSigla());
			System.out.println("-------------------------------------------------------------");

		}

	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		System.out.println("*Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("*Nome: " + pessoa.getNome());
		System.out.println("*CPF: " + pessoa.getCpf());
		System.out.println("*RG: " + pessoa.getRg());
		System.out.println("*Rua: " + pessoa.getRua());
		System.out.println("*Número: " + pessoa.getNumero());
		System.out.println("*Bairro: " + pessoa.getBairro());
		System.out.println("*Cep: " + pessoa.getCep());
		System.out.println("*Complemento: " + pessoa.getComplemento());
		System.out.println("*Telefone: " + pessoa.getTelefone());
		System.out.println("*Celular: " + pessoa.getCelular());
		System.out.println("*Email: " + pessoa.getEmail());
		System.out.println("*Código da Cidade: " + pessoa.getCidade().getCodigo());
		System.out.println("*Nome da Cidade: " + pessoa.getCidade().getNome());
		System.out.println("*Código do Estado: " + pessoa.getCidade().getEstado().getCodigo());
		System.out.println("*Nome do Estado: " + pessoa.getCidade().getEstado().getNome());
		System.out.println("*Sigla do Estado: " + pessoa.getCidade().getEstado().getSigla());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		pessoaDAO.excluir(pessoa);

		System.out.println("Pessoa removida: ");
		System.out.println("--------------------------------------------");
		System.out.println("*Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("*Nome: " + pessoa.getNome());
		System.out.println("*CPF: " + pessoa.getCpf());
		System.out.println("*RG: " + pessoa.getRg());
		System.out.println("*Rua: " + pessoa.getRua());
		System.out.println("*Número: " + pessoa.getNumero());
		System.out.println("*Bairro: " + pessoa.getBairro());
		System.out.println("*Cep: " + pessoa.getCep());
		System.out.println("*Complemento: " + pessoa.getComplemento());
		System.out.println("*Telefone: " + pessoa.getTelefone());
		System.out.println("*Celular: " + pessoa.getCelular());
		System.out.println("*Email: " + pessoa.getEmail());
		System.out.println("*Código da Cidade: " + pessoa.getCidade().getCodigo());
		System.out.println("*Nome da Cidade: " + pessoa.getCidade().getNome());
		System.out.println("*Código do Estado: " + pessoa.getCidade().getEstado().getCodigo());
		System.out.println("*Nome do Estado: " + pessoa.getCidade().getEstado().getNome());
		System.out.println("*Sigla do Estado: " + pessoa.getCidade().getEstado().getSigla());
	}

	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void editar() {
		Long codigoPessoa = 1L;
		Long codigoCidade = 1L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);

		System.out.println("*Código da Cidade: " + cidade.getCodigo());
		System.out.println("*Nome da Cidade: " + cidade.getNome());
		System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		System.out.println("-------------------------------------------");
		System.out.println("Pessoa a ser editada");
		System.out.println("-------------------------------------------");

		System.out.println("*Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("*Nome: " + pessoa.getNome());
		System.out.println("*CPF: " + pessoa.getCpf());
		System.out.println("*RG: " + pessoa.getRg());
		System.out.println("*Rua: " + pessoa.getRua());
		System.out.println("*Número: " + pessoa.getNumero());
		System.out.println("*Bairro: " + pessoa.getBairro());
		System.out.println("*Cep: " + pessoa.getCep());
		System.out.println("*Complemento: " + pessoa.getComplemento());
		System.out.println("*Telefone: " + pessoa.getTelefone());
		System.out.println("*Celular: " + pessoa.getCelular());
		System.out.println("*Email: " + pessoa.getEmail());
		System.out.println("*Código da Cidade: " + pessoa.getCidade().getCodigo());
		System.out.println("*Nome da Cidade: " + pessoa.getCidade().getNome());
		System.out.println("*Código do Estado: " + pessoa.getCidade().getEstado().getCodigo());
		System.out.println("*Nome do Estado: " + pessoa.getCidade().getEstado().getNome());
		System.out.println("*Sigla do Estado: " + pessoa.getCidade().getEstado().getSigla());

		pessoa.setNome("Raissa Cenerino Faria");
		pessoa.setCpf("45010325878");
		pessoa.setRg("459852147");
		pessoa.setRua("Ginez Belmont");
		pessoa.setNumero(new Short("15"));
		pessoa.setBairro("Centro");
		pessoa.setCep("16220000");
		pessoa.setComplemento("Casa");
		pessoa.setTelefone("1836584515");
		pessoa.setCelular("18997101098");
		pessoa.setEmail("raissacenerino@hotmail.com");
		pessoa.setCidade(cidade);

		System.out.println("-------------------------------------------");
		pessoaDAO.editar(pessoa);
		System.out.println("-------------------------------------------");

		System.out.println("Pessoa editada");
		System.out.println("-------------------------------------------");

		System.out.println("*Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("*Nome: " + pessoa.getNome());
		System.out.println("*CPF: " + pessoa.getCpf());
		System.out.println("*RG: " + pessoa.getRg());
		System.out.println("*Rua: " + pessoa.getRua());
		System.out.println("*Número: " + pessoa.getNumero());
		System.out.println("*Bairro: " + pessoa.getBairro());
		System.out.println("*Cep: " + pessoa.getCep());
		System.out.println("*Complemento: " + pessoa.getComplemento());
		System.out.println("*Telefone: " + pessoa.getTelefone());
		System.out.println("*Celular: " + pessoa.getCelular());
		System.out.println("*Email: " + pessoa.getEmail());
		System.out.println("*Código da Cidade: " + pessoa.getCidade().getCodigo());
		System.out.println("*Nome da Cidade: " + pessoa.getCidade().getNome());
		System.out.println("*Código do Estado: " + pessoa.getCidade().getEstado().getCodigo());
		System.out.println("*Nome do Estado: " + pessoa.getCidade().getEstado().getNome());
		System.out.println("*Sigla do Estado: " + pessoa.getCidade().getEstado().getSigla());

		System.out.println("");
		System.out.println("Pessoa editada com sucesso!!!");

	}
}
