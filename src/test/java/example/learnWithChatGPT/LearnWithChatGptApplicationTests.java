package example.learnWithChatGPT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class LearnWithChatGptApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	void getTaskById() throws Exception {

	}

}
