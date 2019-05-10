import javax.swing.JOptionPane;
import java.io.*;

public class MenuEstatistica {

	public static void main(String[] args) throws IOException {

		MetodosEstatisticas C = new MetodosEstatisticas();
		Estatistica[] estatistica = new Estatistica[3];

		int i, num = 0;

		for (i = 0; i < 3; i++) {
			estatistica[i] = new Estatistica();
		}

		while (num != 9) {

			num = Integer
					.parseInt(JOptionPane.showInputDialog("1- Cadastro Estatisticas \n2- Consulta por tipo de veículo"
							+ " \n3- Consulta por quantidade de acidentes \n4 - Consulta todos as cidades "
							+ "\n5 - Consulta maior menor média de acidentes \n6- gravação dos arquivos gerados \n9- sair"));
			switch (num) {
			case 1:
				estatistica = C.funcaoCadastro(estatistica);
				break;

			case 2:
				C.ProcTipoCarro(estatistica);
				break;

			case 3:
				C.ProcAcidentes(estatistica);
				break;

			case 4:
				C.ProcConsultaAcidentes(estatistica);
				break;

			case 5:
				C.ProcMedia(estatistica);
				break;
				
			case 6:
				C.gravaçãoArquivos(estatistica);
				break;

			case 9:
				System.out.println("vc saiu do sistema");
				break;
			}
		}

	}
}
