package br.com.converstore;

import java.math.BigDecimal;

import br.com.converstore.db.dao.ProdutosDao;
import br.com.converstore.db.entity.Produtos;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produtos produto = new Produtos();
		produto.setDsproduto("Teste");
		produto.setAltura(new BigDecimal(10));
		produto.setLargura(new BigDecimal(10));
		ProdutosDao dao = new ProdutosDao();
		dao.salvar(produto);
System.out.println("teste");
	}

}
