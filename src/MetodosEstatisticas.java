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
			System.out.println("o codigo da cidade é " + vetor[i].codigoCidade);
			System.out.println("o nome da cidade : " + vetor[i].nomeCidade);
			System.out.println("e o numero de acidentes são : " + vetor[i].quantidadeAcidentes);
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
		System.out.println("o menor numero de acidentes é :" + menor);
		System.out.println("o maior numero de acidentes é :" + maior);
		// ------------------------------------------------------------
		media = soma / cont;
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes > media) {
				System.out.println("as cidades com acidentes acima da media são : " + vetor[i].nomeCidade);
			}
		}
	}

	public Estatistica [] gravaçãoArquivos(Estatistica[] vetor) throws IOException {

		int i;

		String fileName = "D:\\Download\\Tipos de carro.txt";
		BufferedWriter gravação = new BufferedWriter(new FileWriter(fileName));

		gravação.write("tipos de veiculos que ocasionam acidentes :");
		gravação.newLine();

		for (i = 0; i < 3; i++) {
			gravação.write(vetor[i].veiculo);
			gravação.newLine();
		}

		gravação.write("\n");
		gravação.newLine();
		
//------------------------------------------------------------------------------------------
		
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes < 100) {
				gravação.write("quantidade de acidentes na cidade abaixo de 100 : " + "\n");
				gravação.newLine();
				gravação.write(Integer.toString(vetor[i].quantidadeAcidentes));
				gravação.newLine();

			} else if (vetor[i].quantidadeAcidentes > 100 && vetor[i].quantidadeAcidentes < 500) {
				gravação.write("quantidade de acidentes abaixo de 500 : " + "\n");
				gravação.newLine();
				gravação.write(Integer.toString(vetor[i].quantidadeAcidentes));

			}
		}

		gravação.write("\n");
		gravação.newLine();

//-------------------------------------------------------------------------------------
		
		for (i = 0; i < 3; i++) {
			gravação.write("o codigo da cidade é " + vetor[i].codigoCidade);
			gravação.newLine();
			gravação.write("o nome da cidade : " + vetor[i].nomeCidade);
			gravação.newLine();
			gravação.write("e o numero de acidentes são : " + vetor[i].quantidadeAcidentes);
			gravação.newLine();
			gravação.write(" ");
			gravação.newLine();
		}

		gravação.write("\n");
		gravação.newLine();
		
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
		gravação.write("o menor numero de acidentes é :" + menor);
		gravação.newLine();
		gravação.write("o maior numero de acidentes é :" + maior);
		gravação.newLine();
		// ------------------------------------------------------------
		media = soma / cont;
		for (i = 0; i < 3; i++) {
			if (vetor[i].quantidadeAcidentes > media) {
				gravação.write("as cidades com acidentes acima da media são : " + vetor[i].nomeCidade);
				gravação.newLine();
			}
		}
		gravação.close();
		return vetor;
	}
	
	
}