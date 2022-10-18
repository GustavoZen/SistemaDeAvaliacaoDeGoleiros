package Package;

public class CelulaGol {
	public int quadrante = 0;
	public int x = 0;
	public int y = 0;
	public boolean situacao;
	
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
	public CelulaGol(int a,int b, int c, boolean d) {
		this.quadrante = a;
		this.x=b;
		this.y = c;
		this.situacao = d;
	}
}

