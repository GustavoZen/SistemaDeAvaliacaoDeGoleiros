package Package;

public class Chute {
	private int id;
	private int forca;
	private int quadrante;
	private int posicaox;
	private int posicaoy;
	private String LocaldoChute;

	public int getId() {
		return id;
	}

	public int getForca() {
		return forca;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public Chute(int a, int b, int c, int d, int e) {
		id = a;
		forca = b;
		quadrante = c;
		posicaox = e;
		posicaoy = d;
		teste();
	}

	public int getQuadrante() {
		return quadrante;
	}

	public String getLocaldoChute() {
		return LocaldoChute;
	}

	public void setLocaldoChute(String localdoChute) {
		this.LocaldoChute = localdoChute;
	}

	public void teste() {
		if (this.getPosicaox() == 0 || this.getPosicaoy() == 0 || this.getPosicaoy() == 16) {
			this.setLocaldoChute("FORA");
		} else if ((this.getPosicaox() == 1 && this.getPosicaoy() <= 8)
				|| (this.getPosicaoy() == 1 && this.getPosicaox() >= 0)) {
			this.setLocaldoChute("TRAVE ESQUERDA");
		} else if ((this.getPosicaox() == 1 && this.getPosicaoy() > 8)
				|| (this.getPosicaoy() == 15 && this.getPosicaox() >= 1)) {
			this.setLocaldoChute("TRAVE DIREITA");
		} else if ((this.getPosicaox() == 2 && this.getPosicaoy() == 2)
				|| (this.getPosicaox() == 2 && this.getPosicaoy() == 14)) {
			this.setLocaldoChute("NA GAVETA");
		} else {
			this.setLocaldoChute("DENTRO");
		}
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
}
