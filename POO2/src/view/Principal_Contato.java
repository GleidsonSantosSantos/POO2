package view;

import model.AgendaTelefonica;
import model.Contato;

public class Principal_Contato {

	public static void main(String[] args) {
		AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("Gleidson0", "123456789", "gleidson@example.com");
        agenda.adicionarContato("Maria", "987654321", "maria@example.com");

     
        Contato contato = agenda.buscarContato("João");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }

        
        agenda.removerContato("Maria");

       
        contato = agenda.buscarContato("Maria");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }


	}

