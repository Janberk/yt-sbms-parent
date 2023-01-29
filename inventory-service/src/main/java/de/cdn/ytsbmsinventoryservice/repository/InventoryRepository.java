package de.cdn.ytsbmsinventoryservice.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import de.cdn.ytsbmsinventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
