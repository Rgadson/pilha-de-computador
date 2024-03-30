package controle;

import modelo.Peca;

public class MontadorDePC {

	private int tamanho = 6;
	private Peca[] computador;
	private int ponteiro;

	public MontadorDePC() {
		this.computador = new Peca[tamanho];
	}

	public void movimentarPilha() {
		for (int i = 0; i < ponteiro; i++) {
			if (ponteiro - i < computador.length) {
				computador[ponteiro - i] = computador[ponteiro - i - 1];
			}
		}
		computador[0] = null;
	}

	public void empilharPecas(Peca peca) {
		System.out.println("EMPILHANDO AS PEÇAS: " + peca.getNome());

		movimentarPilha();

		computador[0] = peca;
		ponteiro++;

		printComputador();
	}

	public void printComputador() {
		String retorno = "";
		for (int i = 0; i < computador.length; i++) {
			retorno += String.format("\t \t [%s] -> %s", i, computador[i] != null ? computador[i].getNome() : "");
		}
		System.out.println(retorno);
	}

	public void movimentarPilhaDois() {
		for (int i = 0; i < ponteiro; i++) {
			if (i + 1 < computador.length) {
				computador[i] = computador[i + 1];
			}
		}
		computador[ponteiro - 1] = null;
	}

	public void desempilhar(Peca peca) {
		System.out.println("DESEMPILHANDO AS PEÇAS: " + peca.getNome());

		movimentarPilhaDois();

		ponteiro--;

		printComputador();
	}

}
