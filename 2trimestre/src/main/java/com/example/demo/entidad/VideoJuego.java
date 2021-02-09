package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class VideoJuego {
@Id
@GeneratedValue
private int id;
@Column(unique=true)
private String nombre;
private String compania;
private double puntuacion;
@Override
public String toString() {
	return "VideoJuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", puntuacion=" + puntuacion
			+ "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCompania() {
	return compania;
}
public void setCompania(String compania) {
	this.compania = compania;
}
public double getPuntuacion() {
	return puntuacion;
}
public void setPuntuacion(double puntuacion) {
	this.puntuacion = puntuacion;
}

}
