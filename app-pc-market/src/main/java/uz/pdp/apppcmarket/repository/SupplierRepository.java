package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Supplier;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = ProjectionSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
