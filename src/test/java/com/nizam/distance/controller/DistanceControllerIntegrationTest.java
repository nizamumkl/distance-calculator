package com.nizam.distance.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nizam.distance.request.DistanceRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@WebMvcTest(DistanceController.class)
@AutoConfigureMockMvc
public class DistanceControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCalculateDistanceEndpoint() throws Exception {
        DistanceRequest request = new DistanceRequest();
        request.setFirstDistance(3);
        request.setFirstUnit("yards");
        request.setSecondDistance(5);
        request.setSecondUnit("meters");
        request.setResultUnit("meters");

        mockMvc.perform(post("/calculateDistance")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.totalDistance").value(7.74)); // Adjust the expected value as per any calculation logic
    }

}

