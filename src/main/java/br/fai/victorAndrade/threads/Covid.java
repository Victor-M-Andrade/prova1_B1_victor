package br.fai.victorAndrade.threads;

import java.util.ArrayList;
import java.util.List;

public class Covid implements Runnable {

	public Covid(int gotasMaximas, String nomeFormula, int qtdSegundos) {
		this.gotasMaximas = gotasMaximas;
		this.nomeFormula = nomeFormula;
		this.qtdSegundos = qtdSegundos;
	}
	
	private int gotasMaximas;
	private String nomeFormula;
	private int qtdSegundos;

	List<Integer> listaDeGotasDaFormula = new ArrayList<Integer>();

	@Override
	public void run() {

		if(this.nomeFormula == "Formula_01") {
			iniciarFormula1();
		}
		
		if(this.nomeFormula == "Formula_02") {
			iniciarFormula2();
		}

	}

	private void iniciarFormula1() {

		listaDeGotasDaFormula.clear();

		System.out.println(nomeFormula + ": Iniciei o proesso ");

		int qtdGotas = 0;
		while (qtdGotas < this.gotasMaximas) {

			System.out.println("Gota " + (qtdGotas + 1) + " de 2 foi adicionada na F1");

			try {
				Thread.sleep(qtdSegundos);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			qtdGotas += 1;
			listaDeGotasDaFormula.add(qtdGotas);

		}

		System.out.println("Fim de adição de gotas");

		for (int i = 0; i < listaDeGotasDaFormula.size(); i++) {

			System.out.println("Gota " + (i + 1) + " foi testada e aprovada na F1");
		}

		System.out.println(nomeFormula + ": Processo finalizado");

	}
	
	

	private void iniciarFormula2() {

		listaDeGotasDaFormula.clear();

		System.out.println(nomeFormula + ": Iniciei o proesso");

		int qtdGotas = 0;
		while (qtdGotas < this.gotasMaximas) {

			System.out.println("Gota " + (qtdGotas + 1) + " de 3 foi adicionada na F2");

			try {
				Thread.sleep(qtdSegundos);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			qtdGotas += 1;
			listaDeGotasDaFormula.add(qtdGotas);

		}

		System.out.println("Fim de adição de gotas");

		for (int i = 0; i < listaDeGotasDaFormula.size(); i++) {

			System.out.println("Gota " + (i + 1) + " foi testada e aprovada na F2");
		}

		System.out.println(nomeFormula + ": Processo finalizado");

	}

}
