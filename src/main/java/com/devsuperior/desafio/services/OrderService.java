package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    ShippingService shippingService;

    public double total(Order order){
        return order.getBasic() - order.getDiscount() + shippingService.shipment(order);
    }

}
