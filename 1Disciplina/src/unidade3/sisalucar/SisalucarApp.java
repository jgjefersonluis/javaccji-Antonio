package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		Carro carro1 = new Carro(); // 1� objeto carro
		carro1.idCarro = 1;
		carro1.modelo = "Gol";
		carro1.placa = "JDK-7001";
		carro1.cor = "Azul";
		carro1.ano = 2013;
		carro1.valorDiaria = 90.90f;
		carro1.fabricante = "Volkswagem";	
		
		totalCarros = totalCarros + 1;
		
		// Carro carro2 = new Carro(); // 2� objeto carro
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "123456788-90";
		cliente1.nome = "Joao Pedro";
		cliente1.cnh = "XYZ7005";
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.idCarro, cliente1.idCliente, carro1.valorDiaria);
		
		gerarRelatorioLocacao(carro1, LocalDate.now(),LocalDate.now().plusDays(5));
		
	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocacao = 1;
		locacao.datainicial = LocalDate.now();
		locacao.datafinal = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;
		
	}

	//public static void gerarRelatorioLocacao(LocalDate ...datas) { // exemplo de varargs
	
	private static void gerarRelatorioLocacao(Carro carro1, LocalDate now, LocalDate plusDays) {
		float totalFaturado = 2 * 99.90f;
		
	}
}
