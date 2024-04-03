package br.com.sistema.xadrez.modelo.xadrez.pecas;

import br.com.sistema.xadrez.jogotabuleiro.Tabuleiro;
import br.com.sistema.xadrez.modelo.xadrez.Cor;
import br.com.sistema.xadrez.modelo.xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString () {
		return "T";
	}
	
}
