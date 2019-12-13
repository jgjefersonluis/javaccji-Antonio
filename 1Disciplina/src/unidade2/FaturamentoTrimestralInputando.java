package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestralInputando {

	public static void main(String[] args) {
		
		double vendas_janeiro;
		double vendas_fevereiro;
		double vendas_marco;
		
		vendas_janeiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de janeiro: "));
		vendas_fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de fevereiro: "));
		vendas_marco = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de marco: "));
				
		double faturamento_trimestral = vendas_janeiro + vendas_fevereiro + vendas_marco;
		
		JOptionPane.showMessageDialog(null, "Resultado do Faturamento Trimestral R$: " + faturamento_trimestral);
		
	}

}
