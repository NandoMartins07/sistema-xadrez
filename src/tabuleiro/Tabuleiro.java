package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Pe�a[][] pe�as;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroExce��o("Erro criando tabuleiro: � necess�rio que haja pelo menos 1 linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�a[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Pe�a pe�a(int linha, int coluna) {
		if (!posi��oExistente(linha, coluna)) {
			throw new TabuleiroExce��o("Posi��o n�o existente");
		}
		return pe�as[linha][coluna];
	}
	
	public Pe�a pe�a(Posi��o posi��o) {
		if (!posi��oExistente(posi��o)) {
			throw new TabuleiroExce��o("Posi��o n�o existente");
		}
		return pe�as[posi��o.getLinha()][posi��o.getColuna()];
	}
	
	public void colocarPe�a(Pe�a pe�a, Posi��o posi��o) {
		if (pe�aExistente(posi��o)) {
			throw new TabuleiroExce��o("J� existe uma pe�a na posi��o" + posi��o);
		}
		pe�as[posi��o.getLinha()][posi��o.getColuna()] = pe�a;
		pe�a.posi��o = posi��o;
	}
	
	private boolean posi��oExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas; 
	}
	
	public boolean posi��oExistente(Posi��o posi��o) {
		return posi��oExistente(posi��o.getLinha(), posi��o.getColuna());
		
	}
	
	public boolean pe�aExistente(Posi��o posi��o) {
		if (!posi��oExistente(posi��o)) {
			throw new TabuleiroExce��o("Posi��o n�o existente");
		}
		return pe�a(posi��o) != null;
	}
	

}
