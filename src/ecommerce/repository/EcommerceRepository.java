package ecommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {

	// Operações CRUD

	// Criar
	public void adicionarProduto(Ecommerce suplemento);

	// Ler

	public void buscarProdutos();

	// Atualizar
	public void atualizarProduto(Ecommerce suplemento);

	// Deletar
	public void removerProduto(int id);


}
