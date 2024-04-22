package br.com.sistema.xadrez.modelo.xadrez;

import br.com.sistema.xadrez.jogotabuleiro.Peca;
import br.com.sistema.xadrez.jogotabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	
}
