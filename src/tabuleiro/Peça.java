package tabuleiro;

public class Peça {
	protected Posição posição;
	private Tabuleiro tabuleiro;
	
	public Peça(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posição = null;
	}

	protected Posição getPosição() {
		return posição;
	}
	
	

}
