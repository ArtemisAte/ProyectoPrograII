package Modelo;

import java.util.ArrayList;

import Entidad.ataque_hechizo_tiro;
import poo.epn.com.proyecto.miniprg.Juego;
import poo.epn.com.proyecto.miniprg.KeyHandler;

public class Heroe extends Personaje implements Ataque {
	private int fuerzaExtra;
	private String type;
	private ArrayList<Enemigo> listEnemigo;
	private ArrayList<Arma> lisArmas;

	/**
	 * 
	 */
	public Heroe() {
		super();
		this.fuerzaExtra = 0;
	}

	/**
	 * 
	 * @param fuerzaExtra
	 * @param nombre
	 * @param nivel
	 * @param vida
	 * @param historia
	 * @param score
	 */
	public Heroe(int fuerzaExtra, String nombre, int nivel, int vida, String historia, int score, String type,
			ArrayList<Arma> lisArmas) {
		super(nombre, nivel, vida, historia, score);
		this.fuerzaExtra = fuerzaExtra;
		this.type = type;
		this.lisArmas = new ArrayList<Arma>();
	}

	public ArrayList<Arma> getLisArmas() {
		return lisArmas;
	}

	public void setLisArmas(ArrayList<Arma> lisArmas) {
		this.lisArmas = lisArmas;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFuerzaExtra() {
		return fuerzaExtra;
	}

	public void setFuerzaExtra(int fuerzaExtra) {
		this.fuerzaExtra = fuerzaExtra;
	}

	/**
	 * 
	 * @param enemy
	 */
	public void agregarEnemigo(Enemigo enemy) {
		this.listEnemigo.add(enemy);
	}

	/**
	 * 
	 * @param enemy
	 */
	public void golgeFuerte(Enemigo enemy) {
		enemy.recibirAtaque(fuerzaExtra);
	}

	@Override
	public void usarHabilidad(Enemigo enemy) {
		for (Enemigo e : listEnemigo) {
			if (e.equals(enemy)) {
				golgeFuerte(e);
			}
		}
	}

	@Override
	public void vida(int dano) {

	}

	@Override
	public void nivel() {

	}

}
