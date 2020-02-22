package br.com.sversutti.drogaria.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Cliente;
import br.com.sversutti.drogaria.domain.Funcionario;
import br.com.sversutti.drogaria.domain.Venda;

public class VendaDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(1L);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(1L);

		Venda venda = new Venda();
		venda.setHorario(new SimpleDateFormat("HH:mm:ss").parse("10:30:05"));
		venda.setPrecoTotal(new BigDecimal("50.25"));
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);

		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.salvar(venda);

		System.out.println("Venda salva com sucesso!");

	}

	@Test
	@Ignore
	public void listar() {
		VendaDAO vendaDAO = new VendaDAO();
		List<Venda> resultado = vendaDAO.listar();

		for (Venda venda : resultado) {
			System.out.println("Código da Venda: " + venda.getCodigo());
			System.out.println("Horário: " + venda.getHorario());
			System.out.println("Valor Total: " + venda.getPrecoTotal());
			System.out.println("Código do Cliente: " + venda.getCliente().getCodigo());
			System.out.println("Nome do Cliente: " + venda.getCliente().getPessoa().getNome());
			System.out.println("Código do Funcionário: " + venda.getFuncionario().getCodigo());
			System.out.println("Nome do Funcionário: " + venda.getFuncionario().getPessoa().getNome());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);

		System.out.println("----------------------------------------");

		System.out.println("Código da Venda: " + venda.getCodigo());
		System.out.println("Horário: " + venda.getHorario());
		System.out.println("Valor Total: " + venda.getPrecoTotal());
		System.out.println("Código do Cliente: " + venda.getCliente().getCodigo());
		System.out.println("Nome do Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Código do Funcionário: " + venda.getFuncionario().getCodigo());
		System.out.println("Nome do Funcionário: " + venda.getFuncionario().getPessoa().getNome());

	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);


		vendaDAO.excluir(venda);
		System.out.println("----------------------------------------");

		System.out.println("Venda removida: ");
		System.out.println("Código da Venda: " + venda.getCodigo());
		System.out.println("Horário: " + venda.getHorario());
		System.out.println("Valor Total: " + venda.getPrecoTotal());
		System.out.println("Código do Cliente: " + venda.getCliente().getCodigo());
		System.out.println("Nome do Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Código do Funcionário: " + venda.getFuncionario().getCodigo());
		System.out.println("Nome do Funcionário: " + venda.getFuncionario().getPessoa().getNome());
	}

	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoVenda= 1L;
		Long codigoFuncionario = 1L;
		Long codigoCliente = 1L;


		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		System.out.println("Código do Funcionário: " + funcionario.getCodigo());
		System.out.println("Nome do Funcionário: " + funcionario.getPessoa().getNome());
		System.out.println("----------------------------------------");
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);


		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
		System.out.println("----------------------------------------");

		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);
		System.out.println("----------------------------------------");

		System.out.println("Venda a ser editado: ");
		System.out.println("Código da Venda: " + venda.getCodigo());
		System.out.println("Horário: " + venda.getHorario());
		System.out.println("Valor Total: " + venda.getPrecoTotal());
		System.out.println("Código do Cliente: " + venda.getCliente().getCodigo());
		System.out.println("Nome do Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Código do Funcionário: " + venda.getFuncionario().getCodigo());
		System.out.println("Nome do Funcionário: " + venda.getFuncionario().getPessoa().getNome());

		venda.setHorario(new SimpleDateFormat("HH:mm:ss").parse("11:40:10"));
		venda.setPrecoTotal(new BigDecimal("30.25"));
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		System.out.println("----------------------------------------");

		vendaDAO.editar(venda);

		System.out.println("----------------------------------------");

		System.out.println("Venda editado: ");
		System.out.println("Código da Venda: " + venda.getCodigo());
		System.out.println("Horário: " + venda.getHorario());
		System.out.println("Valor Total: " + venda.getPrecoTotal());
		System.out.println("Código do Cliente: " + venda.getCliente().getCodigo());
		System.out.println("Nome do Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Código do Funcionário: " + venda.getFuncionario().getCodigo());
		System.out.println("Nome do Funcionário: " + venda.getFuncionario().getPessoa().getNome());

		System.out.println("----------------------------------------");

		System.out.println("Venda editada com sucesso!");

	}
}
