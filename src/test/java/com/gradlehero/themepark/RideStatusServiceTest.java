package com.gradlehero.themepark;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RideStatusServiceTest {

    @ParameterizedTest(name = "{index} gets {0} ride status")
    @ValueSource(strings = {"rollercoaster", "kogfume", "teacups"})
    public void getsRideStatus(String ride) {
        String rideStatus = RideStatusService.getRideStatus(ride);
        assertNotNull(rideStatus);
    }
}
