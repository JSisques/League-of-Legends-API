package data;

public class Campeon {
	
	private String nombre;
	private String nivel;
	private String puntos;
	private String cofre;
	private String ultimaVezJugado;
	public Campeon(String nombre, String nivel, String puntos, String cofre, String ultimaVezJugado) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntos = puntos;
		this.cofre = cofre;
		this.ultimaVezJugado = ultimaVezJugado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getPuntos() {
		return puntos;
	}
	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}
	public String getCofre() {
		return cofre;
	}
	public void setCofre(String cofre) {
		this.cofre = cofre;
	}
	public String getUltimaVezJugado() {
		return ultimaVezJugado;
	}
	public void setUltimaVezJugado(String ultimaVezJugado) {
		this.ultimaVezJugado = ultimaVezJugado;
	}
	@Override
	public String toString() {
		return nombre + ": nivel, " + nivel + ", puntos, " + puntos + ", cofre, " + cofre
				+ ", jugado por ultima vez, " + ultimaVezJugado;
	}
	
	
	
		

}
