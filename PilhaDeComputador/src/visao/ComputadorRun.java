package visao;

import javax.swing.JOptionPane;

import controle.MontadorDePC;
import modelo.Peca;

public class ComputadorRun {

	public static void main(String[] args) {

		MontadorDePC montadora = new MontadorDePC();

		String pecaUm = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca primeiraPeca = new Peca(0, pecaUm);

		String pecaDois = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca segundaPeca = new Peca(1, pecaDois);

		String pecaTres = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca terceiraPeca = new Peca(2, pecaTres);

		String pecaQuatro = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca quartaPeca = new Peca(3, pecaQuatro);

		String pecaCinco = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca quintaPeca = new Peca(4, pecaCinco);

		String pecaSeis = JOptionPane.showInputDialog("Informe o nome da peça que irá montar: ");
		Peca sextaPeca = new Peca(5, pecaSeis);

		System.out.println("-COMEÇANDO A EMPILHAR-");

		montadora.empilharPecas(sextaPeca);
		montadora.empilharPecas(quintaPeca);
		montadora.empilharPecas(quartaPeca);
		montadora.empilharPecas(terceiraPeca);
		montadora.empilharPecas(segundaPeca);
		montadora.empilharPecas(primeiraPeca);

		System.out.println();

		System.out.println("IMPRESSÃO DA PILHA COMPLETA: ");

		montadora.printComputador();

		System.out.println("\n-COMEÇANDO O DESEMPILHAMENTO-");

		montadora.desempilhar(primeiraPeca);
		montadora.desempilhar(segundaPeca);
		montadora.desempilhar(terceiraPeca);
		montadora.desempilhar(quartaPeca);
		montadora.desempilhar(quintaPeca);
		montadora.desempilhar(sextaPeca);

		System.out.println("IMPRESSÃO DO DESEMPILHAMENTO");

		montadora.printComputador();

	}
}
