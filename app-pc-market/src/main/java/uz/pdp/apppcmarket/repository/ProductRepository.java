package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Character;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionProduct;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@RepositoryRestResource(path = "product", excerptProjection = ProjectionProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product p join character ch on ch.product_id = p.id " +
            "join property pr on pr.character_id=ch.id " +
            "where p.price between :minPrice and :maxPrice and pr.id in (:idList)", nativeQuery = true)
    List<Product> findAllByFilter(Double startPrice, Double maxPrice, Collection<Integer> idList);
}
