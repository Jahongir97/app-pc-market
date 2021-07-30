package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Feedback;
import uz.pdp.apppcmarket.projection.ProjectionAddress;
import uz.pdp.apppcmarket.projection.ProjectionFeedback;

@RepositoryRestResource(path = "feedback", excerptProjection = ProjectionFeedback.class)
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
