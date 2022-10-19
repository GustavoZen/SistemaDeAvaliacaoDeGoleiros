package Package;

import java.util.ArrayList;

public class listas {
	private ArrayList<goleiro> listagoleiros = new ArrayList<goleiro>();
	private ArrayList<Chute> listaChutes = new ArrayList<Chute>();

	public ArrayList<goleiro> getListagoleiros() {
		return listagoleiros;
	}

	public ArrayList<Chute> getListaChutes() {
		return listaChutes;
	}

	public listas() {
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
		Chute chute1 = new Chute(1, 2, 1, 4, 7);
		listaChutes.add(chute1);
		Chute chute2 = new Chute(2, 6, 1, 3, 6);
		listaChutes.add(chute2);
		Chute chute3 = new Chute(3, 9, 2, 4, 15);
		listaChutes.add(chute3);
		Chute chute4 = new Chute(4, 5, 4, 6, 11);
		listaChutes.add(chute4);
		Chute chute5 = new Chute(5, 3, 4, 8, 13);
		listaChutes.add(chute5);
		Chute chute6 = new Chute(6, 3, 3, 6, 4);
		listaChutes.add(chute6);
		Chute chute7 = new Chute(7, 4, 4, 5, 8);
		listaChutes.add(chute7);
		Chute chute8 = new Chute(8, 7, 4, 7, 14);
		listaChutes.add(chute8);
		Chute chute9 = new Chute(9, 8, 4, 7, 14);
		listaChutes.add(chute9);
		Chute chute10 = new Chute(10, 4, 4, 6, 12);
		listaChutes.add(chute10);
		Chute chute11 = new Chute(11, 2, 4, 5, 15);
		listaChutes.add(chute11);
		Chute chute12 = new Chute(12, 7, 3, 6, 4);
		listaChutes.add(chute12);
		Chute chute13 = new Chute(13, 3, 3, 8, 2);
		listaChutes.add(chute13);
		Chute chute14 = new Chute(14, 9, 4, 7, 10);
		listaChutes.add(chute14);
		Chute chute15 = new Chute(15, 10, 4, 7, 12);
		listaChutes.add(chute15);
		Chute chute16 = new Chute(16, 5, 1, 4, 2);
		listaChutes.add(chute16);
		Chute chute17 = new Chute(17, 3, 4, 5, 13);
		listaChutes.add(chute17);
		Chute chute18 = new Chute(18, 10, 2, 4, 16);
		listaChutes.add(chute18);
		Chute chute19 = new Chute(19, 10, 4, 5, 16);
		listaChutes.add(chute19);
		Chute chute20 = new Chute(20, 10, 2, 3, 14);
		listaChutes.add(chute20);
		Chute chute21 = new Chute(21, 9, 2, 1, 8);
		listaChutes.add(chute21);
		Chute chute22 = new Chute(22, 4, 4, 8, 16);
		listaChutes.add(chute22);
		Chute chute23 = new Chute(23, 8, 4, 6, 14);
		listaChutes.add(chute23);
		Chute chute24 = new Chute(24, 7, 4, 7, 11);
		listaChutes.add(chute24);
		Chute chute25 = new Chute(25, 6, 1, 0, 3);
		listaChutes.add(chute25);
		Chute chute26 = new Chute(26, 5, 3, 6, 7);
		listaChutes.add(chute26);
		Chute chute27 = new Chute(27, 3, 3, 8, 4);
		listaChutes.add(chute27);
		Chute chute28 = new Chute(28, 4, 3, 6, 7);
		listaChutes.add(chute28);
		Chute chute29 = new Chute(29, 10, 2, 2, 13);
		listaChutes.add(chute29);
		Chute chute30 = new Chute(30, 7, 3, 5, 3);
		listaChutes.add(chute30);
	}
}
