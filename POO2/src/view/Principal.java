package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
	
		        Produto produto1 = new Produto();
		        produto1.setCodigo(1);
		        produto1.setDescricao("Produto 1");
		        produto1.setValor(10.0);

		        Produto produto2 = new Produto();
		        produto2.setCodigo(2);
		        produto2.setDescricao("Produto 2");
		        produto2.setValor(20.0);

		        ItemPedido item1 = new ItemPedido();
		        item1.setProduto(produto1);
		        item1.setQuantidade(2);

		        ItemPedido item2 = new ItemPedido();
		        item2.setProduto(produto2);
		        item2.setQuantidade(1);

		        Pedido pedido = new Pedido();
		        pedido.setNumeroNota(123);
		        pedido.adicionarItem(item1);
		        pedido.adicionarItem(item2);

		        System.out.println("Valor total do: " + pedido.calcularValorTotal());
		    }
		

	}


