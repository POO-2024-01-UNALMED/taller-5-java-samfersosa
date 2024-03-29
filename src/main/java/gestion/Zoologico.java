package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas= new ArrayList<Zona>();
	
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
		nuevaZona.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (Zona zona : zonas) {
			cantidadTotalAnimales += zona.cantidadAnimales();
		}
		return cantidadTotalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public ArrayList <Zona> getZona () {
		return this.zonas;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}