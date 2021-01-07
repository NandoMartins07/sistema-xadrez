package xadrez.pe�as;

import tabuleiro.Posi��o;
import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.Pe�aXadrez;

public class Torre extends Pe�aXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
	@Override
	public boolean[][] movimentoPossivel() {
		boolean[][] mat = new boolean [getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		
		Posi��o p = new Posi��o(0, 0);
		
		//Pra Cima
		p.setValues(posi��o.getLinha() - 1, posi��o.getColuna());
		while(getTabuleiro().posi��oExistente(p) && !getTabuleiro().pe�aExistente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}
		if (getTabuleiro().posi��oExistente(p) && pe�aOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Pra esquerda
		p.setValues(posi��o.getLinha(), posi��o.getColuna() - 1);
		while(getTabuleiro().posi��oExistente(p) && !getTabuleiro().pe�aExistente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}
		if (getTabuleiro().posi��oExistente(p) && pe�aOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Pra direita
		p.setValues(posi��o.getLinha(), posi��o.getColuna() + 1);
		while(getTabuleiro().posi��oExistente(p) && !getTabuleiro().pe�aExistente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if (getTabuleiro().posi��oExistente(p) && pe�aOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Pra baixo
		p.setValues(posi��o.getLinha() + 1, posi��o.getColuna());
		while(getTabuleiro().posi��oExistente(p) && !getTabuleiro().pe�aExistente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() + 1);
		}
		if (getTabuleiro().posi��oExistente(p) && pe�aOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		
		return mat;
	}

}
