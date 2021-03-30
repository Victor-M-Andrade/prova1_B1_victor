package br.fai.victorAndrade.prova;

import br.fai.victorAndrade.threads.Covid;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		Covid formula_01 = new Covid(2, "Formula_01", 2);
		Covid formula_02 = new Covid(3, "Formula_02", 3);
		
		Thread threadFormula_01 = new Thread(formula_01);
		Thread threadFormula_02 = new Thread(formula_02);
		
		threadFormula_01.start();
		threadFormula_02.start();
		
		
		
	}

}
