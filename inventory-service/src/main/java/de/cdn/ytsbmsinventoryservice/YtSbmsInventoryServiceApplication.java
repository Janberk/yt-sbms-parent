package de.cdn.ytsbmsinventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import de.cdn.ytsbmsinventoryservice.model.Inventory;
import de.cdn.ytsbmsinventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class YtSbmsInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YtSbmsInventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventoryA = new Inventory();
			inventoryA.setSkuCode("123456789");
			inventoryA.setQuantity(100);

			Inventory inventoryB = new Inventory();
			inventoryB.setSkuCode("987654321");
			inventoryB.setQuantity(0);

			inventoryRepository.save(inventoryA);
			inventoryRepository.save(inventoryB);
		};
	}

}
