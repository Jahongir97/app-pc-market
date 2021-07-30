package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Basket;
import uz.pdp.apppcmarket.entity.Order;
import uz.pdp.apppcmarket.entity.User;

import java.sql.Timestamp;

@Projection(types = Order.class)
public interface ProjectionOrder {

    Integer getId();

    User getUser();

    Basket getBasket();

    Timestamp getDate();

    boolean getActive();

}
