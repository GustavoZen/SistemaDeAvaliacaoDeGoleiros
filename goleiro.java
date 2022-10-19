package Package;

import java.util.Random;

public class goleiro {
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenação;
	private int força;
	private int equilíbrio;
	private int AAG;
	private int golsDefendidos = 0;
	private int golsPerdidos = 0;

	public goleiro() {

	}

	public static Random gerador = new Random();

	public goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenação, int força,
			int equilíbrio) {
		this.id = id;
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

	public int getAAG() {
		return this.AAG;
	}

	public void criarAreaDeDefesa(CelulaGol[][] Gol, Chute chute) {
		int quadrado = 0;
		int xg, yg;
		for (;; quadrado++) {
			if (quadrado * quadrado > AAG) {
				quadrado--;
				break;
			}
		}
		System.out.println("O local do chute foi: " + chute.getPosicaoy() + "," + chute.getPosicaox()
				+ "\nO quadrante do chute foi: " + chute.getQuadrante());
		if (chute.getQuadrante() == 1) {
			xg = (int) (Math.random() * 3) + 2;
			yg = (int) (Math.random() * 6) + 2;
		} else if (chute.getQuadrante() == 2) {
			xg = (int) (Math.random() * 3) + 2;
			yg = (int) (Math.random() * 7) + 8;
		} else if (chute.getQuadrante() == 3) {
			xg = (int) (Math.random() * 4) + 5;
			yg = (int) (Math.random() * 6) + 2;
		} else {
			xg = (int) (Math.random() * 3) + 5;
			yg = (int) (Math.random() * 6) + 8;
		}
		System.out.println(
				"O local inicial de defesa foi: " + xg + "," + yg + "\nNo quadrante: " + Gol[xg][yg].getQuadrante());
		for (int i = quadrado - 1; i >= 0; i--) {
			for (int j = 0; j < quadrado; j++) {
				if (xg - i >= 0 && yg + i < 17)
					Gol[xg - i][yg + j].setDefesa();
			}
		}
		for (int i = 0; i < this.AAG - (quadrado * quadrado); i++) {
			if (xg - i >= 0 && yg + quadrado < 17)
				Gol[xg - i][yg + quadrado].setDefesa();
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getFlexibilidade() {
		return flexibilidade;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public int getCoordenação() {
		return coordenação;
	}

	public int getForça() {
		return força;
	}

	public int getEquilíbrio() {
		return equilíbrio;
	}

	public String getNome() {
		return nome;
	}

	public void validarGol(CelulaGol[][] Gol, Chute chute) {
		if (Gol[chute.getPosicaoy()][chute.getPosicaox()].getSituacao()) {
			if (Gol[chute.getPosicaoy()][chute.getPosicaox()].getDefesa()) {
				System.out.println("O goleiro " + nome + " pegou a bola\n");
				golsDefendidos = getGolsDefendidos() + 1;
			} else {
				System.out.println("O goleiro " + nome + " não pegou a bola\n");
				golsPerdidos++;
			}
		} else {
			System.out.println("A bola foi chutada para fora");
		}
	}

	public void chuteAoGol(CelulaGol[][] a, Chute c) {
		resetGol(a);
		criarAreaDeDefesa(a, c);
		validarGol(a, c);
	}

	public void resetGol(CelulaGol[][] Gol) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				Gol[i][j].setX(i);
				Gol[i][j].setY(j);
				if (i == 0 || j == 0 || j == 16) {
					Gol[i][j].setSituacao(false);
				} else if ((i == 1 && j <= 8) || (j == 1 && i >= 0)) {
					Gol[i][j].setSituacao(false);
				} else if ((i == 1 && j > 8) || (j == 15 && i >= 1)) {
					Gol[i][j].setSituacao(false);
				} else {
					Gol[i][j].setSituacao(true);
				}
				if (i <= 4 && j <= 7)
					Gol[i][j].setQuadrante(1);
				else if (i <= 4)
					Gol[i][j].setQuadrante(2);
				else if (j <= 7)
					Gol[i][j].setQuadrante(3);
				else
					Gol[i][j].setQuadrante(4);
				Gol[i][j].setDefesa(0);
			}
		}
	}

	public void printAreaDefendida(CelulaGol[][] Gol) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (Gol[i][j].getDefesa())
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println();
		}
	}

	public int getId() {
		return id;
	}

	public int getGolsDefendidos() {
		return golsDefendidos;
	}

	public int getGolsPerdidos() {
		return golsPerdidos;
	}
}
