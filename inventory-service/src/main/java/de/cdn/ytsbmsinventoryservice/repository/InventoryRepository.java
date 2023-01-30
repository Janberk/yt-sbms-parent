package de.cdn.ytsbmsinventoryservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import de.cdn.ytsbmsinventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
