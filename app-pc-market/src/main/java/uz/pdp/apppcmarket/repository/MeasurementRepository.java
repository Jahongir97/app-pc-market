package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Measurement;
import uz.pdp.apppcmarket.projection.ProjectionMeasurement;

@RepositoryRestResource(path = "measurement", excerptProjection = ProjectionMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
