package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
class BeerDtoTest extends BeerDtoTestHelper {
	
	@Autowired
	ObjectMapper objectMapper;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSerializeDto() throws JsonProcessingException {
		BeerDto beerDto = getBeerDto();
		
		String beerDtoString = objectMapper.writeValueAsString(beerDto);
		
		System.out.println("JSON BEER_DTO STRING : " + beerDtoString);
	}
	
	@Test
	void testDeSerializeDto() throws JsonParseException, JsonMappingException, IOException {
		String beerString = " {\"id\":\"e79c2e0a-8d4e-4a8a-86ed-79855f1741da\",\"beerName\":\"Beer Name\",\"beerStyle\":\"Ale\",\"upc\":354332534,\"price\":12.99,\"createdDate\":\"2021-09-05T17:54:12.6110913-07:00\",\"lastUpdatedDate\":\"2021-09-05T17:54:12.6130932-07:00\"}";
		
		BeerDto beerDto = objectMapper.readValue(beerString, BeerDto.class);
		
		System.out.println("JSON BEER_DTO OBJECT : " + beerDto);
	}

	
}
