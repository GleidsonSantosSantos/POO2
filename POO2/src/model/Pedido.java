package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	    private int numeroNota;
	    private List<ItemPedido> itensPedidos;

	    public Pedido() {
	        this.itensPedidos = new ArrayList<>();
	    }

	    public int getNumeroNota() {
	        return numeroNota;
	    }

	    public void setNumeroNota(int numeroNota) {
	        this.numeroNota = numeroNota;
	    }

	    public void adicionarItem(ItemPedido item) {
	        itensPedidos.add(item);
	    }

	    public double calcularValorTotal() {
	        double total = 0;
	        for (ItemPedido item : itensPedidos) {
	            total += item.getProduto().getValor() * item.getQuantidade();
	        }
	        return total;
	    }
	}

