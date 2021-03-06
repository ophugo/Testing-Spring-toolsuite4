package mx.tex.lab;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tex.lab.entity.Dragon;
import mx.tex.lab.repositorio.DragonRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DragonRepositoryTest {
	@Resource
	private DragonRepository dragonRepository;
	
	@Test
	public void givenDragon_whenSave_theRetrieveSame() {
		Dragon dragon = new Dragon(1,"Mexican");
		dragonRepository.save(dragon);
		
		Dragon retrievedDragon = dragonRepository.findById(1L).orElse(null);
		assertEquals("Mexican", retrievedDragon.getName());
	}
	
	public void nameDragon() {
		Dragon retrievedDragon = dragonRepository.findById(1L).orElse(null);
		retrievedDragon.name = "Hugo";
		assertEquals("Hugo", retrievedDragon.getName());
	}
}
