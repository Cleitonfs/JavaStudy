
public class Application {

	public static void main(String[] args) {
		/*
		 //c�digo sem encapsulamento
		Funcionario ze = new Funcionario();
		ze.nome = "Z�";
		ze.salario = 1000;
		ze.custo = 1300;
		System.out.println(ze.nome + " ganha um sal�rio de " + ze.salario + 
				" e tem um custo de " + ze.custo);
		
		Funcionario joao = new Funcionario();
		joao.nome = "Jo�o";
		joao.salario = 2000;
		joao.custo = 2600;
		System.out.println(joao.nome + " ganha um sal�rio de " + joao.salario + 
				" e tem um custo de " + joao.custo);
		*		
		*/
		
		Funcionario ze = new Funcionario();
		ze.setNome("Z�");
		ze.setSalario(1000);
		ze.imprimir();
		
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(2000);
		joao.imprimir();
		
		
	}

}
