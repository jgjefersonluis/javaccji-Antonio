package unidade4;

import unidade3.sisalucar.Cliente;

public class Conta {
	
	
	//atributos
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente[];
	
	
	public void atualiza(double taxa)
	{
		this.saldo = this.saldo + this.saldo*taxa;
	}
	
	
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


	//metodos
	public boolean saca(double valor) {
		return false;
	}
	
	public void deposita(double valor) {
		
	}
	
	public void transfere(Conta destino, double valor) {
		
	}
	
	public static void main (String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = new Cliente[5]; //1 até 5
		
	}
	
}
 