package Package;

import java.util.Random;
import java.util.ArrayList;

public class principal {
	public static void printGol(CelulaGol[][] Gol) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if(Gol[i][j].situacao)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println();
		}
	}

	public static void definirGol(CelulaGol[][] Gol) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (i == 0 || j == 0 || j == 16)
					Gol[i][j].setSituacao(false);
				else if ((i == 1 && j <= 8) || (j == 1 && i >= 0))
					Gol[i][j].setSituacao(false);
				else if ((i == 1 && j > 8) || (j == 15 && i >= 1))
					Gol[i][j].setSituacao(false);
				else 
					Gol[i][j].setSituacao(true);
				if (i <= 4 && j <= 7)
					Gol[i][j].setQuadrante(1);
				else if (i <= 4)
					Gol[i][j].setQuadrante(2);
				else if (j <= 7)
					Gol[i][j].setQuadrante(3);
				else
					Gol[i][j].setQuadrante(4);
			}
		}
	}

	public static int rand0_8() {
		Random gerador = new Random();
		int rand = gerador.nextInt(9);
		return rand;
	}

	public static int rand0_16() {
		Random gerador = new Random();
		int rand = gerador.nextInt(17);
		return rand;
	}
	
	public static void main(String[] args) {
		CelulaGol[][] Gol = new CelulaGol[9][17];
		definirGol(Gol);
		printGol(Gol);
		ArrayList<goleiro> listagoleiros = new ArrayList<goleiro>();
		goleiro g1 = new goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6);
		listagoleiros.add(g1);
		goleiro g2 = new goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10);
		listagoleiros.add(g2);
		goleiro g3 = new goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7);
		listagoleiros.add(g3);
		goleiro g4 = new goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6);
		listagoleiros.add(g4);
		goleiro g5 = new goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10);
		listagoleiros.add(g5);
		goleiro g6 = new goleiro(6, "Tristan Kams", 9, 7, 10, 7, 7, 6);
		listagoleiros.add(g6);
		goleiro g7 = new goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8);
		listagoleiros.add(g7);
		goleiro g8 = new goleiro(8, "Derwin Devers", 10, 7, 9, 5, 9, 5);
		listagoleiros.add(g8);
		goleiro g9 = new goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6);
		listagoleiros.add(g9);
		goleiro g10 = new goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5);
		listagoleiros.add(g10);
		goleiro g11 = new goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8);
		listagoleiros.add(g11);
		goleiro g12 = new goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6);
		listagoleiros.add(g12);
		goleiro g13 = new goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9);
		listagoleiros.add(g13);
		goleiro g14 = new goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7);
		listagoleiros.add(g14);
		goleiro g15 = new goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6);
		listagoleiros.add(g15);
		goleiro g16 = new goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5);
		listagoleiros.add(g16);
		goleiro g17 = new goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10);
		listagoleiros.add(g17);
		goleiro g18 = new goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7);
		listagoleiros.add(g18);
		goleiro g19 = new goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9);
		listagoleiros.add(g19);
		goleiro g20 = new goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10);
		listagoleiros.add(g20);
		goleiro g21 = new goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7);
		listagoleiros.add(g21);
		goleiro g22 = new goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9);
		listagoleiros.add(g22);
		goleiro g23 = new goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5);
		listagoleiros.add(g23);
		goleiro g24 = new goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9);
		listagoleiros.add(g24);
		goleiro g25 = new goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5);
		listagoleiros.add(g25);
		goleiro g26 = new goleiro(26, "Clement Fleisher", 10, 9, 10, 5, 7, 8);
		listagoleiros.add(g26);
	}
}
