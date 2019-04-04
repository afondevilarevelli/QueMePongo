package modelo;

import java.util.Objects;

public class Prenda {
	Material material;
	Color colorPrincipal;
	Color colorSecundario;
	Tipo tipo;
	
	public Prenda(Tipo tipo, Material material, Color colorPrincipal, Color colorSecundario) {
		this.material = Objects.requireNonNull(material,"Material no puede ser nulo");
		this.colorPrincipal = Objects.requireNonNull(colorPrincipal,"Color principal no puede ser nulo");
		this.tipo = Objects.requireNonNull(tipo,"Tipo no puede ser nulo");
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

	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	public Tipo getTipo() {
		return tipo;
	}
	
	public Categoria categoria() {
		return this.tipo.getCategoria();
	}
}
