package tw.lab.h1.tutor;

import java.util.List;

import tw.lab.h1.entity.Order;
import tw.lab.h1.entity.OrderItem;
import tw.lab.h1.service.OrderService;
import tw.lab.h1.service.OrderServiceImp;

public class Lab13 {

	public static void main(String[] args) {
		OrderService service = new OrderServiceImp();
		
//		service.addItem(1L, "IPHONE", 1, 34000);
//		service.addItem(1L, "SAMSON", 1, 28000);
//		service.addItem(1L, "HTC", 1, 18000);
		
//		service.changeCustomerName(1L, "LabNew");
		
//		service.deleteOrder(5L);
		
//		service.removeItem(1L, 11L);
		Order order = service.getOrderWithItems(1L);
		order.getCustomer();
	
	}

}
