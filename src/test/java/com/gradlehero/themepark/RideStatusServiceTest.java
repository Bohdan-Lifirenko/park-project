package com.gradlehero.themepark;


import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;


public class RideStatusServiceTest {

    @Test
    public void unknowRideCausesFailure() {
        String rideStatus = RideStatusService.getRideStatus("teacups");

        assertNotNull(rideStatus);
    }
}
