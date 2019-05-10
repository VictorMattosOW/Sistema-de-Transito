import javax.swing.JOptionPane;
import java.io.*;

public class MetodosEstatisticas {

	public Estatistica[] funcaoCadastro(Estatistica[] vetor) {
		int i;
		for (i = 0; i < 3; i++) {
			vetor[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da cidade :"));
			vetor[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade :");
			vetor[i].quantidadeAcidentes = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes :"));
			vetor[i].veiculo = JOptionPane.showInputDialog("Digite o tipo de veiculo :");
		}
		return vetor;
	}

	public void ProcTipoCarro(Estatistica[] vetor) {
		int i;
		System.out.println("tipos de veiculos que ocasionam acidentes :");
		for (i = 0; i < 3; i++) {
		System.out.println(vetor[i].veiculo + " ");

		}
	}

	public void ProcAcidentes(Estatistica[] vetor) {
		int i;

		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes < 100) {
				System.out.println("quantidade de acidentes na cidade abaixo de 100");

				System.out.println(vetor[i].quantidadeAcidentes + " ");

			} else if (vetor[i].quantidadeAcidentes > 100 && vetor[i].quantidadeAcidentes < 500) {
				System.out.println("quantidade de acidentes abaixo de 500");

				System.out.println(vetor[i].quantidadeAcidentes + " ");

			}
		}

	}

	public void ProcConsultaAcidentes(Estatistica[] vetor) {
		int i;
		for (i = 0; i < 3; i++) {
			System.out.println("o codigo da cidade � " + vetor[i].codigoCidade);
			System.out.println("o nome da cidade : " + vetor[i].nomeCidade);
			System.out.println("e o numero de acidentes s�o : " + vetor[i].quantidadeAcidentes);
			System.out.println(" ");
		}
	}

	public void ProcMedia(Estatistica[] vetor) {
		int i, soma = 0, cont = 0, maior = 0, menor = 0;
		double media = 0;
		for (i = 0; i < 3; i++) {
			soma += vetor[i].quantidadeAcidentes;
			cont++;

			if (i == 0) {
				maior = vetor[i].quantidadeAcidentes;
				menor = vetor[i].quantidadeAcidentes;
			}
			if (vetor[i].quantidadeAcidentes >= maior) {
				maior = vetor[i].quantidadeAcidentes;
			} else if (vetor[i].quantidadeAcidentes <= menor) {
				menor = vetor[i].quantidadeAcidentes;
			}
		}
		System.out.println("o menor numero de acidentes � :" + menor);
		System.out.println("o maior numero de acidentes � :" + maior);
		// ------------------------------------------------------------
		media = soma / cont;
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes > media) {
				System.out.println("as cidades com acidentes acima da media s�o : " + vetor[i].nomeCidade);
			}
		}
	}

	public Estatistica [] grava��oArquivos(Estatistica[] vetor) throws IOException {

		int i;

		String fileName = "D:\\Download\\Tipos de carro.txt";
		BufferedWriter grava��o = new BufferedWriter(new FileWriter(fileName));

		grava��o.write("tipos de veiculos que ocasionam acidentes :");
		grava��o.newLine();

		for (i = 0; i < 3; i++) {
			grava��o.write(vetor[i].veiculo);
			grava��o.newLine();
		}

		grava��o.write("\n");
		grava��o.newLine();
		
//------------------------------------------------------------------------------------------
		
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes < 100) {
				grava��o.write("quantidade de acidentes na cidade abaixo de 100 : " + "\n");
				grava��o.newLine();
				grava��o.write(Integer.toString(vetor[i].quantidadeAcidentes));
				grava��o.newLine();

			} else if (vetor[i].quantidadeAcidentes > 100 && vetor[i].quantidadeAcidentes < 500) {
				grava��o.write("quantidade de acidentes abaixo de 500 : " + "\n");
				grava��o.newLine();
				grava��o.write(Integer.toString(vetor[i].quantidadeAcidentes));

			}
		}

		grava��o.write("\n");
		grava��o.newLine();

//-------------------------------------------------------------------------------------
		
		for (i = 0; i < 3; i++) {
			grava��o.write("o codigo da cidade � " + vetor[i].codigoCidade);
			grava��o.newLine();
			grava��o.write("o nome da cidade : " + vetor[i].nomeCidade);
			grava��o.newLine();
			grava��o.write("e o numero de acidentes s�o : " + vetor[i].quantidadeAcidentes);
			grava��o.newLine();
			grava��o.write(" ");
			grava��o.newLine();
		}

		grava��o.write("\n");
		grava��o.newLine();
		
//-----------------------------------------------------------------------------------
		
		int soma = 0, cont = 0, maior = 0, menor = 0;
		double media = 0;
		for (i = 0; i < 3; i++) {
			soma += vetor[i].quantidadeAcidentes;
			cont++;

			if (i == 0) {
				maior = vetor[i].quantidadeAcidentes;
				menor = vetor[i].quantidadeAcidentes;
			}
			if (vetor[i].quantidadeAcidentes >= maior) {
				maior = vetor[i].quantidadeAcidentes;
			} else if (vetor[i].quantidadeAcidentes <= menor) {
				menor = vetor[i].quantidadeAcidentes;
			}
		}
		grava��o.write("o menor numero de acidentes � :" + menor);
		grava��o.newLine();
		grava��o.write("o maior numero de acidentes � :" + maior);
		grava��o.newLine();
		// ------------------------------------------------------------
		media = soma / cont;
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes > media) {
				grava��o.write("as cidades com acidentes acima da media s�o : " + vetor[i].nomeCidade);
				grava��o.newLine();
			}
		}
		grava��o.close();
		return vetor;
	}
	
	
}