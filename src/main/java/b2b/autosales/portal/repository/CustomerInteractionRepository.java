package b2b.autosales.portal.repository;

import b2b.autosales.portal.models.CustomerInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerInteractionRepository extends JpaRepository<CustomerInteraction, UUID> {
}
