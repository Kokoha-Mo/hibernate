package tw.lab.h1.tutor;

import tw.lab.h1.service.OrderService;
import tw.lab.h1.service.OrderServiceImp;

public class Lab12 {

	public static void main(String[] args) {
		OrderService service = new OrderServiceImp();
		
		Long id = service.createOrder("Eric");
		System.out.println(id);
		service.addItem(id, "pineApple", 5, 1000);
		service.addItem(id, "strawberry", 100, 800);
	}

}
