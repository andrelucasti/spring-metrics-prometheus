package com.andrelucas.medium;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

@RestController
@RequestMapping("/artist")
public class ArtistFavoriteController {
    private final MeterRegistry meterRegistry;


    public ArtistFavoriteController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Timed
    @GetMapping
    public ResponseEntity<String> testeMetric(){
        String hello = "Hello";
        return ResponseEntity.ok().body(hello);
    }
}