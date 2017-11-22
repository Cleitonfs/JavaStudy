
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
		*******		
		*/
		
		Funcionario ze = new Funcionario();
		ze.setNome("Zé");
		ze.setSalario(1000);
		ze.imprimir();
		
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(2000);
		joao.imprimir();
		
		Secretaria maria = new Secretaria();
		maria.setNome("Maria");
		maria.setSalario(1500);
		maria.getCusto();
		maria.imprimir();
		
		Programador roberto = new Programador();
		roberto.setNome("Roberto");
		roberto.setSalario(1000);
		roberto.imprimir();
		
		AnalistaDeSistemas carlos = new AnalistaDeSistemas();
		carlos.setNome("Carlos");
		carlos.setSalario(5000);
		carlos.getCusto();
		carlos.imprimir();
		
		Gerente luiz = new Gerente();
		luiz.setNome("Luiz");
		luiz.setSalario(10000);
		luiz.getCusto();
		luiz.setNumeroDeFuncionariosGerenciados(20);
		luiz.getNumeroDeFuncionariosGerenciados();
		luiz.imprimir();
		
		//TODO Setar e recuperar atributos dos objetos das classes gerente, secretaria, programador e Analista;
		
	}

}
