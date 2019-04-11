package modelo;

import java.util.Objects;

public class Prenda {
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	Tipo tipo;
	
	public Prenda(Tipo tipo, Material material, Color colorPrincipal, Color colorSecundario) {
		this.tipo = Objects.requireNonNull(tipo,"Tipo no puede ser nulo");
		this.material = Objects.requireNonNull(material,"Material no puede ser nulo");
		if(!tipo.puedeSerDe(material)) 
			throw new RuntimeException("Una prenda de tipo " + tipo + " no puede ser de material " + material);
		this.colorPrincipal = Objects.requireNonNull(colorPrincipal,"Color principal no puede ser nulo");
		if(colorSecundario!= null && colorPrincipal.esIgualA(colorSecundario))
			throw new RuntimeException("Color primario no puede ser igual al color secundario");
		this.colorSecundario = colorSecundario;
	}

	public Material getMaterial() {
		return material;
	}

	public Color getColorPrincipal() {
		return colorPrincipal;
	}

	public Color getColorSecundario() {
		return colorSecundario;
	}

	public Tipo getTipo() {
		return tipo;
	}
	
	public Categoria categoria() {
		return this.tipo.getCategoria();
	}
}
