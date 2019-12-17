package unidade4;

public class Conta {
	
	//atributos
	private int numero;
	private double saldo;
	private double limite;
	private String nome;
	
	//metodos
	public boolean saca(double valor) {
		if (valor <= saldo)
		{
			saldo = saldo - valor;
		return true;
		}
		else
			return false; // não conseguiu realizar o saque
	}
	
	public void deposita(double valor) {
		saldo = saldo + valor;
		
	}
	
	public void transfere(Conta destino, double valor) {
		if(valor <= saldo)
		{
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
		}
		else
			System.out.println("Não foi possivel fazer a transferencia");
		
		
	}
	
	// getters e setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main (String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.transfere(conta2, 50.00);
	}

}
