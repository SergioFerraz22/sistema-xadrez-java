package br.com.sistema.xadrez.aplicacao;

import java.util.Scanner;

import br.com.sistema.xadrez.modelo.xadrez.PartidaXadrez;
import br.com.sistema.xadrez.modelo.xadrez.PecaXadrez;
import br.com.sistema.xadrez.modelo.xadrez.PosicaoXadrez;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("PARTIDA INICIADA !");
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			UI.imprimeTabuleiro(partidaXadrez.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			PosicaoXadrez origem = UI.lendoPosicaoPeca(sc);

			System.out.println();
			System.out.print("Destino: ");
			PosicaoXadrez destino = UI.lendoPosicaoPeca(sc);

			PecaXadrez pecaCapturada = partidaXadrez.moverPecaDeXadrez(origem, destino);

		}

	}

}
