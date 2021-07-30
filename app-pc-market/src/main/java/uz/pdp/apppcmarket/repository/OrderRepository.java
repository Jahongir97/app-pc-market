package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Order;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionOrder;

@RepositoryRestResource(path = "order", excerptProjection = ProjectionOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
