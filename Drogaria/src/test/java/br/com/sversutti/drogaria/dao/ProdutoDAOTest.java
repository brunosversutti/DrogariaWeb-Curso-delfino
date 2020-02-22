package br.com.sversutti.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Fabricante;
import br.com.sversutti.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void salvar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));

		Produto produto = new Produto();
		produto.setDescricao("Nimesulida 100mg");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("30.00"));
		produto.setQuantidade(new Short("25"));

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);

		System.out.println("Produto salvo com sucesso!");
	}

	@Test
	@Ignore
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		for (Produto produto : resultado) {
			System.out.println("*Código do Produto: " + produto.getCodigo());
			System.out.println("*Descrição do Produto: " + produto.getDescricao());
			System.out.println("*Quantidade do Produto: " + produto.getQuantidade());
			System.out.println("*Preço do Produto: " + produto.getPreco());
			System.out.println("*Código do Fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("*Descrição do Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println("----------------------------------------");

		}

	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 2L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		System.out.println("*Código do Produto: " + produto.getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getDescricao());
		System.out.println("*Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("*Preço do Produto: " + produto.getPreco());
		System.out.println("*Código do Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getFabricante().getDescricao());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		produtoDAO.excluir(produto);

		System.out.println("Produto removido: ");
		System.out.println("*Código do Produto: " + produto.getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getDescricao());
		System.out.println("*Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("*Preço do Produto: " + produto.getPreco());
		System.out.println("*Código do Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getFabricante().getDescricao());

	}

	@Test
	@Ignore
	@SuppressWarnings("deprecation")
	public void editar() {
		Long codigoProduto = 1L;
		Long codigoFabricante = 1L;

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

		System.out.println("*Código do Fabricante: " + fabricante.getCodigo());
		System.out.println("*Descrição do Produto: " + fabricante.getDescricao());
		System.out.println("-------------------------------------");

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		System.out.println("-------------------------------------");

		System.out.println("Produto a ser editado: ");
		System.out.println("*Código do Produto: " + produto.getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getDescricao());
		System.out.println("*Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("*Preço do Produto: " + produto.getPreco());
		System.out.println("*Código do Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getFabricante().getDescricao());

		produto.setDescricao("Ibuprofeno 50mg 10 comprimidos");
		produto.setPreco(new BigDecimal("30.00"));
		produto.setQuantidade(new Short("25"));
		produto.setFabricante(fabricante);

		System.out.println("-------------------------------------");

		produtoDAO.editar(produto);

		System.out.println("-------------------------------------");

		System.out.println("Produto editado: ");
		System.out.println("*Código do Produto: " + produto.getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getDescricao());
		System.out.println("*Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("*Preço do Produto: " + produto.getPreco());
		System.out.println("*Código do Fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("*Descrição do Produto: " + produto.getFabricante().getDescricao());

	}

}