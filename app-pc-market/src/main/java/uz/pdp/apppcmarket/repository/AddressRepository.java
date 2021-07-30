package uz.pdp.apppcmarket.repository;

import org.hibernate.criterion.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.projection.ProjectionAddress;

@RepositoryRestResource(path = "address", excerptProjection = ProjectionAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
