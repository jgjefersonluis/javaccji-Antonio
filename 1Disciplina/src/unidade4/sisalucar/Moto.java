package unidade4.sisalucar;

public class Moto extends Veiculo {
	
	public int getPessageiro() // exemplo de anula��o
	{
		return 1;
	}
	
	public void acelera(int limiteVelocidade)// exemplo de sobrecarga
	{
		System.out.println("Obede�a o limite de velocidade que �: " + limiteVelocidade);
	}
	

}
