package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		Carro carro1 = new Carro(); // 1º objeto carro
		carro1.setIdCarro(1);
		carro1.setModelo("Gol");
		carro1.setPlaca("JDK-7001");
		carro1.setCor("Azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(90.90f);
		carro1.setFabricante("Volkswagem");	
		
		totalCarros = totalCarros + 1;
		
		// Carro carro2 = new Carro(); // 2º objeto carro
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("123456788-90");
		cliente1.setNome("Joao Pedro");
		cliente1.setCnh("XYZ7005");
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		
		gerarRelatorioLocacao(carro1, LocalDate.now(),LocalDate.now().plusDays(5));
		
	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);
		
	}

	//public static void gerarRelatorioLocacao(LocalDate ...datas) { // exemplo de varargs
	
	private static void gerarRelatorioLocacao(Carro carro1, LocalDate now, LocalDate plusDays) {
		float totalFaturado = 2 * 99.90f;
		
	}
}
