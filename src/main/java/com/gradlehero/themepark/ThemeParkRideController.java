package com.gradlehero.themepark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Iterator;

@RestController
public class ThemeParkRideController {
    @GetMapping(path = "/rides")
    public Iterator<ThemeParkRide> getRides() {
        return Arrays.asList(
                new ThemeParkRide("Rollercoaster", "A fast, thrilling ride with steep drops, sharp turns, and loops on winding tracks."),
                new ThemeParkRide("Log flume", "A water ride where passengers sit in log-shaped boats, gliding along channels and splashing down drops."),
                new ThemeParkRide("Teacups", "A spinning ride with cup-shaped cars that rotate around a central platform, letting riders spin themselves faster.")
        ).iterator();
    }
}
