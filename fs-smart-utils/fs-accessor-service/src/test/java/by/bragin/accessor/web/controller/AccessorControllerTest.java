package by.bragin.accessor.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AccessorController.class)
public class AccessorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEcho() throws Exception {
        mockMvc.perform(get("/echo"))
                .andExpect(status().isOk());
    }
}
