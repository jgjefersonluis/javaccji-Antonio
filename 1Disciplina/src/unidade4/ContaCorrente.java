package unidade4;

public class ContaCorrente extends Conta {

	public void atualiza(double taxa)
	{
		super.saldo = super.saldo + super.saldo*taxa*2;
	}
	
}
