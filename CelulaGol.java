package Package;

public class CelulaGol {
	public int quadrante = 0;
	public int x = 0;
	public int y = 0;
	public boolean situacao;
	public boolean defendido;
	public boolean agarrarBolaComForca;
	public int resultado = 0;

	public int getResultado() {
		return resultado;
	}

	public void setResultado() {
		resultado = getResultado() + 1;
	}

	public void setX(int a) {
		this.x = a;
	}

	public void setY(int b) {
		this.y = b;
	}

	public void setSituacao(boolean a) {
		this.situacao = a;
	}

	public void setQuadrante(int a) {
		this.quadrante = a;
	}

	public CelulaGol(int a, int b, int c, boolean d, boolean e,int f) {
		this.quadrante = a;
		this.x = b;
		this.y = c;
		this.situacao = d;
		this.defendido = e;
		this.resultado = f;
	}

	public int getQuadrante() {
		return this.quadrante;
	}

	public void setDefesa() {
		this.defendido = true;
	}

	public void setDefesa(int a) {
		this.defendido = false;
	}

	public boolean getSituacao() {
		return this.situacao;
	}

	public boolean getDefesa() {
		return this.defendido;
	}

	public void setAgarrarBolaComForça() {
		this.agarrarBolaComForca = true;
	}

	public boolean getAgarrarBolaComForca() {
		return this.agarrarBolaComForca;
	}
}
