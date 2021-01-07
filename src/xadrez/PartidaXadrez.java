package xadrez;

import tabuleiro.Pe�a;
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
	
	public boolean[][] movimentoPossivel(XadrezPosi��o origemPosi��o){
		Posi��o posi��o = origemPosi��o.toPosi��o();
		validarOrigemPosi��o(posi��o);
		return tabuleiro.pe�a(posi��o).movimentoPossivel();
	}
	
	public Pe�aXadrez executarMovXadrez(XadrezPosi��o origemPosi��o, XadrezPosi��o destinoPosi��o) {
		Posi��o origem = origemPosi��o.toPosi��o();
		Posi��o destino = destinoPosi��o.toPosi��o();
		validarOrigemPosi��o(origem);
		validarDestinoPosi��o(origem, destino);
		Pe�a capituraPe�a = fazerMover(origem, destino);
		return (Pe�aXadrez)capituraPe�a;
	}
	
	private Pe�a fazerMover(Posi��o origem, Posi��o destino) {
		Pe�a p = tabuleiro.removerPe�a(origem);
		Pe�a capituraPe�a = tabuleiro.removerPe�a(destino);
		tabuleiro.colocarPe�a(p, destino);
		return capituraPe�a;
	}
	
	private void validarOrigemPosi��o(Posi��o posi��o) {
		if (!tabuleiro.pe�aExistente(posi��o)) {
			throw new XadrezExce��o("N�o existe pe�a na posi��o de origem");
		}
		if (!tabuleiro.pe�a(posi��o).movimentoPossivel2()){
			throw new XadrezExce��o("N�o existe movimento possivel para a pe�a escolhida");
		}
	}
	
	private void validarDestinoPosi��o(Posi��o origem, Posi��o destino) {
		if (!tabuleiro.pe�a(origem).movimentoPossivel(destino)) {
			throw new XadrezExce��o("A pe�a escolhida n�o pode se mover para a posi��o de destino");
		}
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
