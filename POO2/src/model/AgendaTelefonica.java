package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {
	private List<Contato> contato;

	public AgendaTelefonica() {
		contato = new ArrayList<>();
	}

	public void adicionarContato(String nome, String telefone, String email) {
		Contato novoContato = new Contato(nome, telefone, email);
		contato.add(novoContato);
	}

	public void removerContato(String nome) {
		Iterator<Contato> iterator = contato.iterator();
		while (iterator.hasNext()) {
			Contato contato = iterator.next();
			if (contato.getNome().equals(nome)) {
				iterator.remove();
				System.out.println("Contato removido: " + contato);
			}
		}

	}

	public Contato buscarContato(String nome) {
		for (Contato contato : contato) {
			if (contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "AgendaTelefonica [contato=" + contato + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
