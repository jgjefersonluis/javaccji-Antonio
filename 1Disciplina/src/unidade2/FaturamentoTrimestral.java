package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {

	public static void main(String[] args) {
		
		int vendas_janeiro = 15_000;
		int vendas_fevereiro = 23_000;
		int vendas_marco = 17_000;
		
		int faturamento_trimestral = vendas_janeiro+vendas_fevereiro+vendas_marco;
		
		JOptionPane.showMessageDialog(null, "Resultado do faturamento Trimestral R$: " + faturamento_trimestral);
		

	}

}
