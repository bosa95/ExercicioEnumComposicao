package entities;

public class OrderItem {

	private Integer quantity;

	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double subTotal() {
		return quantity * product.getPrice();
	}

	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, subtotal: $%.2f", product.getName(), product.getPrice(),
				this.quantity, subTotal());
	}

}
