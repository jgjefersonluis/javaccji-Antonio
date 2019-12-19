package unidade4.sisalucar;

public class Carro extends Veiculo{
	
	private long idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	
	
	
	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria) {
		super(); // chama o construtor da super classe
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	
	public Carro() {
		
	}
	
	
	public int getPessageiro() // exemplo de anula��o
	{
		return 4;
	}
	
	public void acelera(int limiteVelocidade)// exemplo de sobrecarga
	{
		System.out.println("Obede�a o limite de velocidade que �: " + limiteVelocidade);
	}
	
	public void abastecer(int quantidadeLitros)
	{
		System.out.println("Para abastecer o carro � necessario." + quantidadeLitros);
		
	}
	
	public void fechaPorta()
	{
		
	}
	
	public void abrePorta()
	{
		
	}
	
	public static void main (String[] args) {
		Carro carro1 = new Carro(1, "ABC-2100", "Volks", "Gol", 2013, "Azul", 99.90f);
		Carro carro2 = new Carro();
		
		carro1.acelera();
		carro1.freia();
		carro1.getPassageiros();
		carro1.getVelocidade();
		carro1.autonomia = 40;
	}
	
	
	

}
