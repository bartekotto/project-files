package workshop.sb.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// TODO 1 dodaj adnotację @WebMvcTest (kontroler nie ma wstrzykiwanych żadnych zależności)
@WebMvcTest
public class CalculatorApplicationTests {
    // TODO 2 wstrzyknij MockMvc
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/sum/2/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("5")));
    }

    @Test
    public void shouldSubstract() throws Exception {
        this.mockMvc.perform(get("/sub/2/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("-1")));
    }

    @Test
    public void shouldMultiply() throws Exception {
        this.mockMvc.perform(get("/div/3/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("1")));
    }

    @Test
    public void shouldDivide() throws Exception {
        this.mockMvc.perform(get("/mul/2/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("6")));
    }
}
