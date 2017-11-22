import java.util.ArrayList;
import java.util.Collection;

public class Gerente extends Funcionario {
	
	private Collection<String> formacao = new ArrayList<>();
	private Integer numeroDeFuncionariosGerenciados;
	
	public Integer getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	public void setNumeroDeFuncionariosGerenciados(Integer numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	public Collection<String> getFormacao() {
		return formacao;
	}
	public void setFormacao(Collection<String> formacao) {
		this.formacao = formacao;
	}
	
	

}
