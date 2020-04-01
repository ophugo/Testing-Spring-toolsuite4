package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tec.lab.entity.Dragon;
import mx.tec.lab.repository.DragonRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DragonRepositoryTest {
	@Resource
	private DragonRepository dragonRepository;
	
	@Test
	public void givenDragon_whenSave_theRetrieveSame() {
		Dragon dragon = new Dragon(1,"Meraxes");
		dragonRepository.save(dragon);
		
		Dragon retrievedDragon = dragonRepository.findById(1L).orElse(null);
		assertEquals("Meraxes", retrievedDragon.getName());
	}
	
	@Test
	public void givenDragon_whenSaved_changeName() {
		Dragon blueEye = new Dragon(2,"powerBlue");
		dragonRepository.save(blueEye);
		
		Dragon blueEyeToUpdate = dragonRepository.findById(2L).orElse(null);
		blueEyeToUpdate.setName("redEye");
		assertEquals("redEye", blueEyeToUpdate.getName());
		
	}
	
	@Test
	public void givenDragon_whenSaved_erased() {
		Dragon dragon1 = new Dragon(3,"errasedDragon");
		dragonRepository.save(dragon1);
		
		Dragon dragon1eraser = dragonRepository.findById(3L).orElse(null);
		dragon1eraser.erase();
		
		assertNull(dragon1eraser.name);
		
		
	}
}
