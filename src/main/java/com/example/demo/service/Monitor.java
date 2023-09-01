package com.example.demo.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Monitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double tamano;
	private String marca;
	private String color;
	private int numSerie;
	private String modelo;
	private double precio;
	
	public Monitor() {
		super();
	}

	public Monitor(int id, double tamano, String marca, String color, int numSerie, String modelo, double precio) {
		super();
		this.id = id;
		this.tamano = tamano;
		this.marca = marca;
		this.color = color;
		this.numSerie = numSerie;
		this.modelo = modelo;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamaño) {
		this.tamano = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
}
