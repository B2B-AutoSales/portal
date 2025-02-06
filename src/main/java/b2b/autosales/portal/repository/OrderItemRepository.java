package b2b.autosales.portal.repository;

import b2b.autosales.portal.models.Customer;
import b2b.autosales.portal.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
}
