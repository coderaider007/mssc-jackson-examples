package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * 
 * @author yvesc
 *
 */
public class BeerDtoTestHelper {

	BeerDto getBeerDto() {
		return BeerDto.builder()
				.beerName("Beer Name")
				.beerStyle("Ale")
				.id(UUID.randomUUID())
				.createdDate(OffsetDateTime.now())
				.lastUpdatedDate(OffsetDateTime.now())
				.price(new BigDecimal("12.99"))
				.upc(354332534L)
				.build();
	}
}
