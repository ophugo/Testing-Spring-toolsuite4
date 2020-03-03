package mx.tex.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class UsingMocksApplicationTests {
	
	@Mock
	List<String> direwolvesList;
	
	@Mock
	List<String> swordsList;	
	
	@Captor
	ArgumentCaptor<String> swordName;

	@Mock
	Map<String, String> translationMap;
	 
	@InjectMocks
	DothrakiTranslator translator = new DothrakiTranslator();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
	    direwolvesList.add("drogon");
	    verify(direwolvesList).add(anyString());
	    assertEquals(0, direwolvesList.size());
	 
	    when(direwolvesList.size()).thenReturn(100);
	    assertEquals(100, direwolvesList.size());
	}
	
	@Test
	public void whenUseCaptorAnnotation_thenTheSame() {
		swordsList.add("needle");
	    verify(swordsList).add(swordName.capture());
	 
	    assertEquals("needle", swordName.getValue());
	}

	@Test
	public void whenUseInjectMocksAnnotation_thenCorrect() {
	    when(translationMap.get("khaleesi")).thenReturn("queen");
	 
	    assertEquals("queen", translator.getTranslation("khaleesi"));
	}

}
