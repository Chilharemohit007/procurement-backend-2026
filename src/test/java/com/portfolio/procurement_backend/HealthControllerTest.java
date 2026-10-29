package com.portfolio.procurement_backend;

import com.portfolio.procurement_backend.controller.HealthController;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthControllerTest {

    @Test
    void shouldReturnSuccessResponse() {

        HealthController controller = new HealthController();

        Map<String, Object> response = controller.hello();

        assertEquals("SUCCESS", response.get("status"));
        assertEquals(
                "Procurement API is running",
                response.get("message")
        );
    }
}
