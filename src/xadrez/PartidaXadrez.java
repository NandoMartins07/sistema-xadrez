package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pe�as.Rei;
import xadrez.pe�as.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public Pe�aXadrez[][] getPe�as(){
		Pe�aXadrez[][] mat = new Pe�aXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (Pe�aXadrez)tabuleiro.pe�a(i, j);
			}
		}
		return mat;
	}
	
	private void colocarNovaPe�a(char coluna, int linha, Pe�aXadrez pe�a) {
		tabuleiro.colocarPe�a(pe�a, new XadrezPosi��o(coluna, linha).toPosi��o());
	}
	
	private void iniciarPartida() {
		
		colocarNovaPe�a('c', 1, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPe�a('c', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPe�a('d', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPe�a('e', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPe�a('e', 1, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPe�a('d', 1, new Rei(tabuleiro, Cor.Branca));

		colocarNovaPe�a('c', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPe�a('c', 8, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPe�a('d', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPe�a('e', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPe�a('e', 8, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPe�a('d', 8, new Rei(tabuleiro, Cor.Preta));
	}

}
