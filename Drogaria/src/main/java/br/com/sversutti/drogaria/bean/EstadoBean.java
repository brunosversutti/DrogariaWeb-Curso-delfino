package br.com.sversutti.drogaria.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.sversutti.drogaria.dao.EstadoDAO;
import br.com.sversutti.drogaria.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped

public class EstadoBean implements Serializable {
	private Estado estado;
	private List<Estado> estados;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	@PostConstruct
	public void listar() {
		try {
			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar os estados");
			erro.printStackTrace();
		}
	}

	public void novo() {
		estado = new Estado();
	}

	public void salvar() {
		try {
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.merge(estado);

			estado = new Estado();
			estados = estadoDAO.listar();

			Messages.addGlobalInfo("Estado salvo com sucesso");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado");
			erro.printStackTrace();
		}
	}

	public void excluir(ActionEvent evento) {
		try {
			estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");

			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.excluir(estado);

			estados = estadoDAO.listar();

			Messages.addGlobalInfo("Estado removido com sucesso");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar remover o estado");
			erro.printStackTrace();
		}
	}

	public void editar(ActionEvent evento) {
		estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");
	}
	public class Soma {

	    double valor1;
	    double valor2;
	    double total;

	    public Soma() {
	        super();
	    }

	    public Soma(double valor1, double valor2, double total) {
	        super();
	        this.valor1 = valor1;
	        this.valor2 = valor2;
	        this.total = total;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public void setTotal(double total) {
	        this.total = total;
	    }

	    public double somar() {        

	        Soma soma = new Soma();
	        soma.setValor1(soma.getValor1());
	        soma.setValor2(soma.getValor2());
	        double total = this.valor1 + this.valor2;

	        return total;


	    }

	    public double getValor1() {
	        return valor1;
	    }

	    public void setValor1(double valor1) {
	        this.valor1 = valor1;
	    }

	    public double getValor2() {
	        return valor2;
	    }

	    public void setValor2(double valor2) {
	        this.valor2 = valor2;
	    }

}
}