package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void separarQuestão() {
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
	}

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		/* Iniciando Array de Objetos */
		CelulaGol[][] Gol = new CelulaGol[9][17];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				Gol[i][j] = new CelulaGol(0, 0, 0, false, false);
			}
		}
		/* Listas */
		listas l = new listas();
		ArrayList<goleiro> listagoleiros = l.getListagoleiros();
		ArrayList<Chute> listaChutes = l.getListaChutes();
		ArrayList<goleiro> Selecao = new ArrayList<goleiro>();

		/* Seleções */
		for (int cont = 0; cont < 5;) {
			System.out.println("\nInforme o ID do " + (cont + 1) + "º goleiro de sua seleção: ");
			int a = entrada.nextInt();
			int aux = cont;
			for (goleiro g : listagoleiros) {
				if (g.getId() == a) {
					Selecao.add(g);
					cont++;
				}
			}
			if (aux == cont) {
				System.out.println("Não há goleiro cadastrado com esse Id.");
			} else
				System.out.println("Goleiro cadastrado para sua seleção com sucesso!");
		}
		System.out.println("A sua seleção é composta por: ");
		for (goleiro g : Selecao) {
			System.out.println("Nome: " + g.getNome());
			System.out.println("\tVelocidade: " + g.getVelocidade());
			System.out.println("\tFlexibilidade: " + g.getFlexibilidade());
			System.out.println("\tAgilidade: " + g.getAgilidade());
			System.out.println("\tCoordenação: " + g.getCoordenação());
			System.out.println("\tForça: " + g.getForça());
			System.out.println("\tEquilíbrio" + g.getEquilíbrio());
			System.out.println("\tÁrea de atuação: " + g.getAAG());
			System.out.println();
		}
		for (goleiro g : Selecao) {
			for (Chute c : listaChutes) {
				System.out
						.println("\nResultado do chute número " + c.getId() + " para o goleiro " + g.getNome() + ": ");
				g.chuteAoGol(Gol, c);
			}
		}

		separarQuestão();

		/* Questão 1, 2 e 3- Média da Seleção e de cada goleiro */
		float media = 0;
		goleiro selecionado = Selecao.get(0);
		for (goleiro go : Selecao) {
			if (go.getGolsDefendidos() > selecionado.getGolsDefendidos())
				selecionado = go;
			System.out.println("\n" + go.getNome() + " defendeu " + go.getGolsDefendidos() + " Gols,");
			System.out.println("e perdeu " + (go.getGolsPerdidos()));
			media += go.getGolsDefendidos();
		}
		media = media / 5;
		System.out.println("A média de gols defendidos de sua seleção foi: " + media);
		System.out.println("O goleiro mais indicado para ser titular é o : " + selecionado.getNome() + "\n");

		separarQuestão();
		/* Questão 4 */
		int fora = 0, dentro = 0, traveEsquerda = 0, traveDireita = 0, naGaveta = 0;
		for (Chute ch : listaChutes) {
			if (ch.getLocaldoChute() == "FORA") {
				fora++;
			} else if (ch.getLocaldoChute() == "DENTRO") {
				dentro++;
			} else if (ch.getLocaldoChute() == "TRAVE ESQUERDA") {
				traveEsquerda++;
			} else if (ch.getLocaldoChute() == "TRAVE DIREITA") {
				traveDireita++;
			} else {
				naGaveta++;
			}
		}
		System.out.println("Chutes fora: " + fora);
		System.out.println("Chutes dentro: " + dentro);
		System.out.println("Chutes na trave esquerda: " + traveEsquerda);
		System.out.println("Chutes na trave direita: " + traveDireita);
		System.out.println("Chutes na gaveta : " + naGaveta);
	}

}
