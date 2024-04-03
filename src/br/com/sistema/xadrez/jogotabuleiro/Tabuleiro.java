package br.com.sistema.xadrez.jogotabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcessaoTabuleiro("Erro criando tabuleiro: é necessario que tenha pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas] [colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca (int linha, int coluna) {
		if(!posicaoExiste(linha,coluna)) {
			throw new ExcessaoTabuleiro("Posicao não existe no tabuleiro !");
		}
		return pecas [linha][coluna];
	}
	
	public Peca peca (Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcessaoTabuleiro("Posição não está no tabuleiro");
		}
		return pecas [posicao.getLinha()][posicao.getColuna()];
	}
	
	public void posicaoPeca(Peca peca, Posicao posicao) {
		if(existeUmaPeca(posicao)) {
			throw new ExcessaoTabuleiro("A peça já está em posição " + posicao);
		}
		pecas[posicao.getLinha()] [posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean existeUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcessaoTabuleiro("Posição não está no tabuleiro");
		}
		return peca(posicao) != null;
	}
	
}
