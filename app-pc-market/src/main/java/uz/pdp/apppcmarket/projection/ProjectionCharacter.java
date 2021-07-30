package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Character;
import uz.pdp.apppcmarket.entity.Product;

@Projection(types = Character.class)
public interface ProjectionCharacter {
    Integer getId();

    String getBrandName();

    Product getProduct();

}
