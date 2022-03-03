package panaderia;

public class Pedido {
	private String codigo;
	private String fecha;
	private Vendedor vendedor;
	
	public Pedido(String codigo, String fecha, Vendedor vendedor) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.vendedor = vendedor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
