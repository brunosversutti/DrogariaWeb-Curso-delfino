package br.com.sversutti.drogaria.dao;

import java.math.BigDecimal;
import java.text.ParseException;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.ItemVenda;
import br.com.sversutti.drogaria.domain.Produto;
import br.com.sversutti.drogaria.domain.Venda;

public class ItemVendaDAOTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void salvar() throws ParseException {

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(1L);

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(1L);

		ItemVenda Itemvenda = new ItemVenda();
		Itemvenda.setQuantidade(new Short("3"));
		Itemvenda.setPrecoParcial(new BigDecimal("10.00"));
		Itemvenda.setProduto(produto);
		Itemvenda.setVenda(venda);

		ItemVendaDAO ItemvendaDAO = new ItemVendaDAO();
		ItemvendaDAO.salvar(Itemvenda);

		System.out.println("ItemVenda salvo com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		ItemVendaDAO ItemvendaDAO = new ItemVendaDAO();
		List<ItemVenda> resultado = ItemvendaDAO.listar();

		for (ItemVenda Itemvenda : resultado) {
			System.out.println("Código do ItemVenda: " + Itemvenda.getCodigo());
			System.out.println("Quantidade do item vendido: " + Itemvenda.getQuantidade());
			System.out.println("Valor parcial do item vendido: " + Itemvenda.getPrecoParcial());
			System.out.println("Código do Produto: " + Itemvenda.getProduto().getCodigo());
			System.out.println("Nome do Produto: " + Itemvenda.getProduto().getDescricao());
			System.out.println("Código da Venda: " + Itemvenda.getVenda().getCodigo());
			System.out.println("Valor total da Venda: " + Itemvenda.getVenda().getPrecoTotal());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		ItemVendaDAO ItemvendaDAO = new ItemVendaDAO();
		ItemVenda Itemvenda = ItemvendaDAO.buscar(codigo);

		System.out.println("----------------------------------------");

		System.out.println("Código do ItemVenda: " + Itemvenda.getCodigo());
		System.out.println("Quantidade do item vendido: " + Itemvenda.getQuantidade());
		System.out.println("Valor parcial do item vendido: " + Itemvenda.getPrecoParcial());
		System.out.println("Código do Produto: " + Itemvenda.getProduto().getCodigo());
		System.out.println("Nome do Produto: " + Itemvenda.getProduto().getDescricao());
		System.out.println("Código da Venda: " + Itemvenda.getVenda().getCodigo());
		System.out.println("Valor total da Venda: " + Itemvenda.getVenda().getPrecoTotal());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;

		ItemVendaDAO ItemvendaDAO = new ItemVendaDAO();
		ItemVenda Itemvenda = ItemvendaDAO.buscar(codigo);

		ItemvendaDAO.excluir(Itemvenda);
		System.out.println("----------------------------------------");

		System.out.println("Item removido: ");
		System.out.println("Código do ItemVenda: " + Itemvenda.getCodigo());
		System.out.println("Quantidade do item vendido: " + Itemvenda.getQuantidade());
		System.out.println("Valor parcial do item vendido: " + Itemvenda.getPrecoParcial());
		System.out.println("Código do Produto: " + Itemvenda.getProduto().getCodigo());
		System.out.println("Nome do Produto: " + Itemvenda.getProduto().getDescricao());
		System.out.println("Código da Venda: " + Itemvenda.getVenda().getCodigo());
		System.out.println("Valor total da Venda: " + Itemvenda.getVenda().getPrecoTotal());
	}

	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoItemVenda = 1L;
		Long codigoProduto = 1L;
		Long codigoVenda = 1L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		System.out.println("Código do Produto: " + produto.getCodigo());
		System.out.println("Nome do Produto: " + produto.getDescricao());
		System.out.println("----------------------------------------");

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);

		System.out.println("Código da Venda: " + venda.getCodigo());
		System.out.println("Valor total da Venda: " + venda.getPrecoTotal());
		System.out.println("----------------------------------------");

		ItemVendaDAO ItemvendaDAO = new ItemVendaDAO();
		ItemVenda Itemvenda = ItemvendaDAO.buscar(codigoItemVenda);
		System.out.println("----------------------------------------");

		System.out.println("Item a ser editado: ");
		System.out.println("Código do ItemVenda: " + Itemvenda.getCodigo());
		System.out.println("Quantidade do item vendido: " + Itemvenda.getQuantidade());
		System.out.println("Valor parcial do item vendido: " + Itemvenda.getPrecoParcial());
		System.out.println("Código do Produto: " + Itemvenda.getProduto().getCodigo());
		System.out.println("Nome do Produto: " + Itemvenda.getProduto().getDescricao());
		System.out.println("Código da Venda: " + Itemvenda.getVenda().getCodigo());
		System.out.println("Valor total da Venda: " + Itemvenda.getVenda().getPrecoTotal());

		Itemvenda.setQuantidade(new Short("3"));
		Itemvenda.setPrecoParcial(new BigDecimal("10.00"));
		Itemvenda.setProduto(produto);
		Itemvenda.setVenda(venda);
		System.out.println("----------------------------------------");

		vendaDAO.editar(venda);

		System.out.println("----------------------------------------");

		System.out.println("Item editado: ");
		System.out.println("Código do ItemVenda: " + Itemvenda.getCodigo());
		System.out.println("Quantidade do item vendido: " + Itemvenda.getQuantidade());
		System.out.println("Valor parcial do item vendido: " + Itemvenda.getPrecoParcial());
		System.out.println("Código do Produto: " + Itemvenda.getProduto().getCodigo());
		System.out.println("Nome do Produto: " + Itemvenda.getProduto().getDescricao());
		System.out.println("Código da Venda: " + Itemvenda.getVenda().getCodigo());
		System.out.println("Valor total da Venda: " + Itemvenda.getVenda().getPrecoTotal());

		System.out.println("----------------------------------------");

		System.out.println("Item editado com sucesso!");

	}
}
