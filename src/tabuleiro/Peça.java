package tabuleiro;

public abstract class Pe�a {
	
	protected Posi��o posi��o;
	private Tabuleiro tabuleiro;
	
	public Pe�a(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posi��o = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public abstract boolean[][] movimentoPossivel();
	
	public boolean movimentoPossivel(Posi��o posi��o) {
		return movimentoPossivel()[posi��o.getLinha()][posi��o.getColuna()];
	}
	
	//indica se existe algum movimento possivel, se a pe�a n�o estar travada
	public boolean movimentoPossivel2() {
		boolean [][] mat = movimentoPossivel();
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	

}
