package unidade4;

public class Funcionario {

	public static void main(String[] args) {
		
		Funcionario objeto;
		// polimorfismo
		objeto = new Diretor();
		
		((Diretor)objeto).Departamento = "RH"; // exemplo de casting
		
		verificarTipoFuncionario(objeto);
		
		// exemplo de casting de tipos primitivos
		char a = 'a'; int b = 'b'; float c =100;
		int d = (int)5.1987; float e = 5.0f;
		int f = (a+5); char g = (char)110.5f;
		
		
		Funcionario jose = new Funcionario();
		Funcionario antonio = new Professor();
		Funcionario andrea = new Administrativo();
		Funcionario pedro = new Diretor();
		//pedro.verificarTipoFuncionario(pedro);
		antonio.verificarTipoFuncionario(antonio);
		
	}
	
	static void verificarTipoFuncionario(Funcionario objeto)
	{
		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		
		else if (objeto instanceof Professor)
			System.out.println("Professor");
		
		else
			System.out.println("Administrativo");
		
	}
}
