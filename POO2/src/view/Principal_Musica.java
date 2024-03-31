package view;

import model.Musica;
import model.Playlist;

public class Principal_Musica {

	public static void main(String[] args) {
		
		Musica musica1 = new Musica("É o Amor", "Zezé de Carmargo", "MVC");
        Musica musica2 = new Musica("Sozinho", "Djavan", "MTV");
        Musica musica3 = new Musica("1% ", "Wesley Safadao", "Disney");
        
        Playlist minhaPlaylist = new Playlist("Eu mesmo");
        minhaPlaylist.adicionarMusica(musica1);
        minhaPlaylist.adicionarMusica(musica2);
        minhaPlaylist.adicionarMusica(musica3);
        minhaPlaylist.tocarMusicaAleatoria();
        
        
        

	}

}
