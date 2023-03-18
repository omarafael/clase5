package compras;


	
	import java.time.LocalDateTime;

	public class carrito {

		private producto prod1;
		private producto prod2;
		private producto prod3;
		private LocalDateTime fechacompra;

		
		public carrito(producto prod1, producto prod2, producto prod3, LocalDateTime fechacompra) {
			this.prod1 = prod1;
			this.prod2 = prod2;
			this.prod3 = prod3;
			this.fechacompra = fechacompra;
		}


		public producto getProd1() {
			return prod1;
		}


		public void setProd1(producto prod1) {
			this.prod1 = prod1;
		}


		public producto getProd2() {
			return prod2;
		}


		public void setProd2(producto prod2) {
			this.prod2 = prod2;
		}


		public producto getProd3() {
			return prod3;
		}


		public void setProd3(producto prod3) {
			this.prod3 = prod3;
		}


		public LocalDateTime getFechacompra() {
			return fechacompra;
		}


		public void setFechacompra(LocalDateTime fechacompra) {
			this.fechacompra = fechacompra;
		}
		
		public float costofinal() {
			return this.prod1.costofinal()+ this.prod2.costofinal()+ this.prod3.costofinal();
		}
}
