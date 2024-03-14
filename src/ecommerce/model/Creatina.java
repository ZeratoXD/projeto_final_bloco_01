package ecommerce.model;

public class Creatina extends Ecommerce {

	private String pretreino;

	public Creatina(int id, String produto, String nome, float preco, String pretreino) {
		super(id, produto, nome, preco);
		this.pretreino = pretreino;
	}

	@Override

	public void visualizar() {
		super.visualizar();
		System.out.println("Ideal para antes do treino !");
	}

	public String getPretreino() {

		return pretreino;

	}

	public void setPretreino(String pretreino) {
		this.pretreino = pretreino;

	}
}
