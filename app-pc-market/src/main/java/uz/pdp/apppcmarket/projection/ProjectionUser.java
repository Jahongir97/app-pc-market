package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.User;

@Projection(types = User.class)
public interface ProjectionUser {
    Integer getId();

    String getName();

    Address getAddress();

    String getPhoneNumber();

    String getEmail();
}
