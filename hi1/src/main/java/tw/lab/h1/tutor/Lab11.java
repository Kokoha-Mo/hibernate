package tw.lab.h1.tutor;

import java.util.ArrayList;
import java.util.List;

import tw.lab.h1.entity.Order;
import tw.lab.h1.entity.OrderItem;
import tw.lab.h1.service.OrderService;
import tw.lab.h1.service.OrderServiceImp;

public class Lab11 {

	public static void main(String[] args) {
		OrderService service = new OrderServiceImp();
		
//		Long id = service.createOrder("Tony");
//		System.out.println(id);
		
		List<OrderItem> items = List.of(new OrderItem("apples",2,40),
				new OrderItem("bananas",10,100),
				new OrderItem("cakes",1,200),
				new OrderItem("drinks",20,500));
		Long id = service.createOrderWithItems("Tom", items);
		System.out.println(id);
	}

}
