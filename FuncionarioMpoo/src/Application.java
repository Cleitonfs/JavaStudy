
public class Application {

	public static void main(String[] args) {
		/*
		 //código sem encapsulamento
		Funcionario ze = new Funcionario();
		ze.nome = "Zé";
		ze.salario = 1000;
		ze.custo = 1300;
		System.out.println(ze.nome + " ganha um salário de " + ze.salario + 
				" e tem um custo de " + ze.custo);
		
		Funcionario joao = new Funcionario();
		joao.nome = "João";
		joao.salario = 2000;
		joao.custo = 2600;
		System.out.println(joao.nome + " ganha um salário de " + joao.salario + 
				" e tem um custo de " + joao.custo);
		*		
		*/
		
		Funcionario ze = new Funcionario();
		ze.setNome("Zé");
		ze.setSalario(1000);
		ze.imprimir();
		
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(2000);
		joao.imprimir();
		
		
	}

}
