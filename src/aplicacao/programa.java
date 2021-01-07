package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.Pe�aXadrez;
import xadrez.XadrezExce��o;
import xadrez.XadrezPosi��o;

public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while(true) {
			try {
				IU.clearScreen();
				IU.printTabuleiro(partidaXadrez.getPe�as());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosi��o origem = IU.lerXadrezPosi��o(sc);
				
				boolean [][] movimentoPossivel = partidaXadrez.movimentoPossivel(origem);
				IU.clearScreen();
				IU.printTabuleiro(partidaXadrez.getPe�as(), movimentoPossivel);
				System.out.println();
				System.out.print("Destino: ");
				XadrezPosi��o destino = IU.lerXadrezPosi��o(sc);
				
				Pe�aXadrez capituraPe�a = partidaXadrez.executarMovXadrez(origem, destino);
			}
			catch(XadrezExce��o e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
				
			}
		}

	}

}
