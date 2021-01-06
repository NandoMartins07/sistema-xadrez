package aplicacao;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.Pe�aXadrez;
import xadrez.XadrezPosi��o;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while(true) {
			IU.printTabuleiro(partidaXadrez.getPe�as());
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosi��o origem = IU.lerXadrezPosi��o(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosi��o destino = IU.lerXadrezPosi��o(sc);
			
			Pe�aXadrez capituraPe�a = partidaXadrez.executarMovXadrez(origem, destino);
		}

	}

}
