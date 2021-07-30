package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Basket;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionBasket;

@RepositoryRestResource(path = "basket", excerptProjection = ProjectionBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
