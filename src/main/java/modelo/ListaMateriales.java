package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaMateriales {
	private List<Material> materiales = new ArrayList<Material>();
		
	public ListaMateriales add(Material material) {
		this.materiales.add(material);
		return this;
	}
	
	public ListaMateriales remove(Material material) {
		this.materiales.remove(material);
		return this;
	}
	
	public List<Material> getMateriales() {
		return this.materiales;
	}
	
}
