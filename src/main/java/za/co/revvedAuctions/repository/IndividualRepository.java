package za.co.revvedAuctions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.revvedAuctions.domain.Individual;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, String> {
}
