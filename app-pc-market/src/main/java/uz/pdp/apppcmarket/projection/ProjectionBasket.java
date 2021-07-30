package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Basket;
import uz.pdp.apppcmarket.entity.User;

@Projection(types = Basket.class)
public interface ProjectionBasket {
    Integer getId();

    User getUser();
}
