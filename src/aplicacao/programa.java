package aplicacao;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PeçaXadrez;
import xadrez.XadrezPosição;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while(true) {
			IU.printTabuleiro(partidaXadrez.getPeças());
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosição origem = IU.lerXadrezPosição(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosição destino = IU.lerXadrezPosição(sc);
			
			PeçaXadrez capituraPeça = partidaXadrez.executarMovXadrez(origem, destino);
		}

	}

}
