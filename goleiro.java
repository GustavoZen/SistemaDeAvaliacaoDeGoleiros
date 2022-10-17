package Package;

import java.util.Random;
public class goleiro {
	public int id;
	public String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenação;
	private int força;
	private int equilíbrio;
	private int AAG;

	public static Random gerador = new Random();
	
	public goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenação, int força, int equilíbrio) {
		this.id=id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenação = coordenação;
		this.força = força;
		this.equilíbrio = equilíbrio;
		calcularAAG();
	}

	private void calcularAAG() {
		this.AAG = (int) ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenação * 2) + força
				+ (equilíbrio * 2)) / 8;
	}


	public static int rand0_8() {
		int rand = gerador.nextInt(9);
		return rand;
	}

	public static int rand0_16() {
		Random gerador = new Random();
		int rand = gerador.nextInt(17);
		return rand;
	}

	public int getAAG() {
		return this.AAG;
	}

	public String quadranteDoChute(String[][]Gol){
		int x = rand0_8();
		int y = rand0_16();
		return Gol[x][y];
	}
}
