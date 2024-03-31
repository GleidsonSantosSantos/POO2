package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
	private List<Musica> listaMusicas;
	private String donoDaPlaylist;
	private Random random;

	public Playlist(List<Musica> listaMusicas, String donoDaPlaylist, Random random) {
		this.listaMusicas = listaMusicas;
		this.donoDaPlaylist = donoDaPlaylist;
		this.random = random;
	}

	public Playlist(String donoDaPlaylist) {
		this.listaMusicas = new ArrayList<>();
		this.donoDaPlaylist = donoDaPlaylist;
		this.random = new Random();
	}

	public List<Musica> getListaMusicas() {
		return listaMusicas;
	}

	public void setListaMusicas(List<Musica> listaMusicas) {
		this.listaMusicas = listaMusicas;
	}

	public String getDonoDaPlaylist() {
		return donoDaPlaylist;
	}

	public void setDonoDaPlaylist(String donoDaPlaylist) {
		this.donoDaPlaylist = donoDaPlaylist;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public void adicionarMusica(Musica musica) {
		listaMusicas.add(musica);
	}

	public void tocarMusicaAleatoria() {
		if (listaMusicas.isEmpty()) {
			System.out.println("A playlist está vazia.");
			return;
		}
		int indiceAleatorio = random.nextInt(listaMusicas.size());
		Musica musicaAleatoria = listaMusicas.get(indiceAleatorio);
		musicaAleatoria.tocar();

	}
}
