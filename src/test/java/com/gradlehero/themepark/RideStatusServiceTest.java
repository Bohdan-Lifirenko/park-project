package com.gradlehero.themepark;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RideStatusServiceTest {

    @Test
    public void unknowRideCausesFailure() {
        String rideStatus = RideStatusService.getRideStatus("teacups");

        assertNotNull(rideStatus);
    }
}
