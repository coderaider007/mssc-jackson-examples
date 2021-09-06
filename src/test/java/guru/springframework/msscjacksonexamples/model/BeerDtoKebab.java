package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebab extends BeerDtoTestHelper {
	
	@Autowired
	ObjectMapper objectMapper;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() throws JsonProcessingException {
		BeerDto beerDto = getBeerDto();
		
		String beerDtoString = this.objectMapper.writeValueAsString(beerDto);
		
		System.out.println("BEER DTO (KEBAB CASE) : " + beerDtoString);
	}

}
