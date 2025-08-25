package com.gradlehero.themepark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class RideStatusServiceFailureTest {
    @Test
    public void unknowRideCausesFailure() {
        assertThrows(IllegalArgumentException.class, () -> {
            RideStatusService.getRideStatus("dodgems");
        });
    }

    @Test
    public void notAGoodTest() {
        fail();
    }
}

