package modelo;

import java.util.List;

public enum Tipo {
	REMERA(Categoria.SUPERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER)),
	CAMISA(Categoria.SUPERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER)),
	MUSCULOSA(Categoria.SUPERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER)),
	CAMPERA(Categoria.SUPERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER).add(Material.CUERO)),
	BUZO(Categoria.SUPERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER).add(Material.LANA)),
	
	PANTALON(Categoria.INFERIOR, new ListaMateriales().add(Material.ALGODON)),
	BERMUDA(Categoria.INFERIOR, new ListaMateriales().add(Material.ALGODON)),
	POLLERA(Categoria.INFERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER)),
	CALZA(Categoria.INFERIOR, new ListaMateriales().add(Material.ALGODON).add(Material.POLIESTER)),
	
	ZAPATOS(Categoria.CALZADO, new ListaMateriales().add(Material.CUERO)),
	ZAPATILLAS(Categoria.CALZADO, new ListaMateriales().add(Material.CUERO)),
	BOTAS(Categoria.CALZADO, new ListaMateriales().add(Material.CUERO)),
	OJOTAS(Categoria.CALZADO, new ListaMateriales().add(Material.GOMA).add(Material.POLIESTER)),
	
	GORRA(Categoria.ACCESORIO, new ListaMateriales().add(Material.POLIESTER)),
	BUFANDA(Categoria.ACCESORIO, new ListaMateriales().add(Material.LANA)),
	ANTEOJOS(Categoria.ACCESORIO, new ListaMateriales().add(Material.PLASTICO)),
	RELOJ(Categoria.ACCESORIO, new ListaMateriales().add(Material.PLATA).add(Material.ORO)),
	COLGANTE(Categoria.ACCESORIO, new ListaMateriales().add(Material.PLATA).add(Material.ORO));
	
	private final Categoria categoria;
	private final ListaMateriales materialesPosibles;
	
	private Tipo(Categoria cat, ListaMateriales materiales) {
		this.categoria = cat;
		this.materialesPosibles = materiales;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
	
	public List<Material> getMaterialesPosibles() { //Devuelvo la List porque es más fácil trabajar con ella
		return this.materialesPosibles.getMateriales();
	}
	
	public boolean puedeSerDe(Material mat) {
		return this.getMaterialesPosibles().stream().anyMatch(m -> m == mat);
	}
}
