package ecommerce.model;

public class Creatina extends Ecommerce {

	private String treino;

	public Creatina(int id, String produto, String nome, float preco, String treino) {
		super(id, produto, nome, preco);
		this.treino = treino;
	}

	@Override

	public void visualizar() {
		super.visualizar();
		System.out.println("Ideal para antes do treino !");
	}

	public String gettreino() {

		return treino;

	}

	public void setPretreino(String treino) {
		this.treino = treino;

	}
}
