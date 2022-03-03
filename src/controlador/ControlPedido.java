package controlador;

import java.lang.reflect.Array;

public class ControlPedido {

	Array pedido;
	Array ordenTienda;
	Array producto;
	Array tienda;
	
	public double calcularTotalPedido() {
		return 0;
	}
	
	public void ordenarPedido() {
		
	}
	
	public void registrarPedido() {
		
	}
	
	public void generarPedido() {
		
	}
	
	public ControlPedido( Array pedido, Array ordenTienda, Array producto, Array Tienda ) {
		this.pedido= pedido;
		this.ordenTienda= ordenTienda;
		this.producto=producto;
		this.tienda=tienda;
	}
	
	public Array getPedido() {
		return pedido;
	}
	public void setPedido(Array pedido) {
		this.pedido = pedido;
	}
	public Array getOrdenTienda() {
		return ordenTienda;
	}
	public void setOrdenTienda(Array ordenTienda) {
		this.ordenTienda = ordenTienda;
	}
	public Array getProducto() {
		return producto;
	}
	public void setProducto(Array producto) {
		this.producto = producto;
	}
	public Array getTienda() {
		return tienda;
	}
	public void setTienda(Array tienda) {
		this.tienda = tienda;
	}
	
	
	
}
