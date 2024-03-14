package ecommercer.controller;

import java.util.ArrayList;


import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaSuplementos = new ArrayList<Ecommerce>();
	
	int id;


	@Override
	public void removerProduto(int id) {
		var suplemento = buscarNaCollection(id);
		if(suplemento != null) {
			if (listaSuplementos.remove(suplemento)) System.out.println("O suplemento numero:" + id + "foi excluído com sucesso");
		} else
			System.out.println("O suplemento numero:" + id + "não foi encontrado");
		
	
	}
	
	
	@Override
	public void adicionarProduto(Ecommerce suplemento) {
		listaSuplementos.add(suplemento);
		System.out.println("\nO Cadastro do produto: " + suplemento.getId() + "foi criado com sucesso!");		
	}
	@Override
	public void buscarProdutos() {
		var suplemento = buscarNaCollection(id = 1);

		if (suplemento != null)
			suplemento.visualizar();
		else
			System.out.println("O suplemento de ID: " + id + " não foi encontarda !");
		
	}
	@Override
	public void atualizarProduto(Ecommerce suplemento) {
		var buscaConta = buscarNaCollection(suplemento.getId());

		if (buscaConta != null) {
			listaSuplementos.set(listaSuplementos.indexOf(buscaConta), suplemento);
			System.out.println("\nO suplemento de Id: " + suplemento.getId() + " foi atualizada com sucesso ! ");
		} else
			System.out.println(" O suplemento de Id: " + suplemento.getId() + " não foi encontrada");

		
	}
	
	public Ecommerce buscarNaCollection(int id) {
		for (var suplemento : listaSuplementos) {
			if (suplemento.getId() == id)return suplemento;  
		}
		return null ;
	}
	
	public int gerarId() {
		return ++id;
	}


	@Override
	public void cadastrar(Ecommerce suplemento) {
		listaSuplementos.add(suplemento);
		System.out.println("\nO Produto de ID: " + suplemento.getId() + "foi criada com sucesso!");
		
	}

	
}
	
