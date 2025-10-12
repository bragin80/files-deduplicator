package by.bragin.accessor.web.controller;

import by.bragin.accessor.AccessorServiceApplicationTest;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AccessorControllerTest extends AccessorServiceApplicationTest {

    @Test
    public void testEcho() throws Exception {
        mockMvc.perform(get("/echo"))
                .andExpect(status().isOk());
    }
}
