package compras;

public class producto {
	   private String nombre;
	   private String codigo;
	   private float precio;
	    
	   public producto(String nombre, String codigo, float precio) {
		   this.nombre=nombre;
		   this.codigo=codigo;
		   this.precio=precio;
	   }
	   
	   public String getNombre() {
		   return this.nombre;
	   }
	   public void setNombre(String nuevonombre) {
		   this.nombre=nuevonombre;
	   }

	   public float getPrecio() {
		   return this.precio;
	   }

	   public void setPrecio(float precio) {
		   this.precio = precio;
	   }

	   public String getCodigo() {
		  return this.codigo;
	   }

	   public void setCodigo(String codigo) {
		  this.codigo = codigo;
	   }
	   
	   public float costofinal() {
		   return this.precio;
	   }
	}

