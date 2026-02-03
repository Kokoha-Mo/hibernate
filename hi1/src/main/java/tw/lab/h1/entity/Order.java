package tw.lab.h1.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "odate",nullable = false)
	private LocalDateTime odate = LocalDateTime.now();
	
	@Column(name = "customer",nullable = false,length = 100)
	private String customer;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getOdate() {
		return odate;
	}
	public void setOdate(LocalDateTime odate) {
		this.odate = odate;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	//---------------------------------------
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<OrderItem> items = new ArrayList<>();


	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public void addItem(OrderItem item) {
		items.add(item);
		item.setOrder(this);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
		item.setOrder(null);
	}

	
	
}
