package xadrez;

import tabuleiro.Posi��o;
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
	
	private void iniciarPartida() {
		tabuleiro.colocarPe�a(new Torre(tabuleiro, Cor.Branca), new Posi��o(2, 1));
		tabuleiro.colocarPe�a(new Rei(tabuleiro, Cor.Preta), new Posi��o(0, 4));
	}

}
