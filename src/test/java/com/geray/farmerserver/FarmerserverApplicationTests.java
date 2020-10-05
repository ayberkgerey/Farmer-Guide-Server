package com.geray.farmerserver;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(FarmerserverApplication.class)
@RunWith(SpringRunner.class)
class FarmerserverApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getTest() throws Exception {
        mockMvc.perform(get("/1")).andExpect(status().isOk());
    }

}
