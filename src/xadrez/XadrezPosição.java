package xadrez;

import tabuleiro.Posi��o;

public class XadrezPosi��o {
	
	private char coluna;
	private int linha;
	public XadrezPosi��o(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8 ){
			throw new XadrezExce��o("Erro instanciando posi��o. Valores v�lidos de a1 at� h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	public char getColuna() {
		return coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	
	protected Posi��o toPosi��o() {
		return new Posi��o(8 - linha, coluna - 'a');
	}
	
	protected static XadrezPosi��o fromPosi��o(Posi��o posi��o) {
		return new XadrezPosi��o((char)('a' - posi��o.getColuna()), 8 - posi��o.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	 
	

}
