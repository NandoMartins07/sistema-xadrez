package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public PeçaXadrez[][] getPeças(){
		PeçaXadrez[][] mat = new PeçaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PeçaXadrez)tabuleiro.peça(i, j);
			}
		}
		return mat;
	}
	
	private void colocarNovaPeça(char coluna, int linha, PeçaXadrez peça) {
		tabuleiro.colocarPeça(peça, new XadrezPosição(coluna, linha).toPosição());
	}
	
	private void iniciarPartida() {
		
		colocarNovaPeça('c', 1, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPeça('c', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPeça('d', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPeça('e', 2, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPeça('e', 1, new Torre(tabuleiro, Cor.Branca));
		colocarNovaPeça('d', 1, new Rei(tabuleiro, Cor.Branca));

		colocarNovaPeça('c', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPeça('c', 8, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPeça('d', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPeça('e', 7, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPeça('e', 8, new Torre(tabuleiro, Cor.Preta));
		colocarNovaPeça('d', 8, new Rei(tabuleiro, Cor.Preta));
	}

}
