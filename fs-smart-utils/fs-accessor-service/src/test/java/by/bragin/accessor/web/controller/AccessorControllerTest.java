package by.bragin.accessor.web.controller;

import by.bragin.accessor.AccessorServiceApplicationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AccessorControllerTest extends AccessorServiceApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEcho() throws Exception {
        mockMvc.perform(get("/echo"))
                .andExpect(status().isOk());
    }
}
