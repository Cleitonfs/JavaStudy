
public class Funcionario {
	
	private final double PERCENTUAL_CUSTO = 1.8; 
	private String nome;
	private double salario;
	private double custo;
	
	
	public void imprimir() {
		System.out.println(this.getNome() + " tem um salario de " + this.getSalario() + 
				" e representa um custo de " + this.getCusto() );
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		this.custo = salario * PERCENTUAL_CUSTO;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getCusto() {
		return this.custo;
	}
}
