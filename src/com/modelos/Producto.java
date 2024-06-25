package com.modelos;

public class Producto {

	private int id;
	private String descripcion;
	private String precio;

	public Producto(int id, String descripcion, String precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

}
