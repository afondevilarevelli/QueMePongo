package modelo;

public enum Tipo {
	REMERA(Categoria.SUPERIOR),
	CAMISA(Categoria.SUPERIOR),
	MUSCULOSA(Categoria.SUPERIOR),
	CAMPERA(Categoria.SUPERIOR),
	BUZO(Categoria.SUPERIOR),
	
	PANTALON(Categoria.INFERIOR),
	BERMUDA(Categoria.INFERIOR),
	POLLERA(Categoria.INFERIOR),
	CALZA(Categoria.INFERIOR),
	
	ZAPATOS(Categoria.CALZADO),
	ZAPATILLAS(Categoria.CALZADO),
	BOTAS(Categoria.CALZADO),
	OJOTAS(Categoria.CALZADO),
	
	GORRA(Categoria.ACCESORIO),
	BUFANDA(Categoria.ACCESORIO),
	ANTEOJOS(Categoria.ACCESORIO),
	RELOJ(Categoria.ACCESORIO),
	COLGANTE(Categoria.ACCESORIO);
	
	private final Categoria categoria;
	
	private Tipo(Categoria cat) {
		this.categoria = cat;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
}
