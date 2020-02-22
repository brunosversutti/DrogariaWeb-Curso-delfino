package br.com.sversutti.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sversutti.drogaria.domain.Cidade;
import br.com.sversutti.drogaria.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(1L);

		if (estado == null) {

			System.out.println("Estado não encontrado.");
		}

		else {

			System.out.println("Cidade salvar com sucesso!");

			Cidade cidade = new Cidade();
			cidade.setNome("Gabriel Monteiro");
			cidade.setEstado(estado);

			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.salvar(cidade);
		}

	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("*Código da Cidade: " + cidade.getCodigo());
			System.out.println("*Nome da Cidade: " + cidade.getNome());
			System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println("-------------------------------------");

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		System.out.println("*Código da Cidade: " + cidade.getCodigo());
		System.out.println("*Nome da Cidade: " + cidade.getNome());
		System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 3L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		cidadeDAO.excluir(cidade);

		System.out.println("Cidade removida:");
		System.out.println("*Código da Cidade: " + cidade.getCodigo());
		System.out.println("*Nome da Cidade: " + cidade.getNome());
		System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());
	}

	@Test
	@Ignore
	public void editar() {

		Long codigoCidade = 5L;
		Long codigoEstado = 4L;

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);

		System.out.println("*Código do Estado: " + estado.getCodigo());
		System.out.println("*Sigla do Estado: " + estado.getSigla());
		System.out.println("*Nome do Estado: " + estado.getNome());
		System.out.println("-------------------------------------");

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);

		System.out.println("-------------------------------------");

		System.out.println("Cidade a ser editada:");
		System.out.println("*Código da Cidade: " + cidade.getCodigo());
		System.out.println("*Nome da Cidade: " + cidade.getNome());
		System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());

		cidade.setNome("Belo Horizonte");
		cidade.setEstado(estado);

		System.out.println("-------------------------------------");

		cidadeDAO.editar(cidade);

		System.out.println("-------------------------------------");

		System.out.println("Cidade editada:");
		System.out.println("*Código da Cidade: " + cidade.getCodigo());
		System.out.println("*Nome da Cidade: " + cidade.getNome());
		System.out.println("*Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("*Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("*Nome do Estado: " + cidade.getEstado().getNome());
	}

}