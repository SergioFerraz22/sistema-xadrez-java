package br.com.sistema.xadrez.aplicacao;

import br.com.sistema.xadrez.modelo.xadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("PARTIDA INICIADA !");
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.imprimeTabuleiro(partidaXadrez.getPecas());
		
	}

}
 