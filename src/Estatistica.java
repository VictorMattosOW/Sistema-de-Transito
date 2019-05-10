class Estatistica {

	int codigoCidade;
	String nomeCidade;
	int quantidadeAcidentes;
	String veiculo;

	Estatistica() {

		this(0, " ", 0, " ");

	}

	Estatistica(int codCidade, String nomeCidad, int qdtAcidentes, String tipoCarros) {

		codigoCidade = codCidade;
		nomeCidade = nomeCidad;
		quantidadeAcidentes = qdtAcidentes;
		veiculo = tipoCarros;
	}

}