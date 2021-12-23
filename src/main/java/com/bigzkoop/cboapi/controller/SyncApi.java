package com.bigzkoop.cboapi.controller;

import com.bigzkoop.cboapi.service.SyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/addProduct")
@RequiredArgsConstructor
public class SyncApi {

    private final SyncService syncService;

    public static void main(String[] args) {
        // Parse the date-time string into OffsetDateTime
        OffsetDateTime odt = OffsetDateTime.parse("2009-12-31T18:30:00.000+00:00");
        System.out.println(odt);

        // Convert OffsetDateTime into Instant
        Instant instant = odt.toInstant();

        // If at all, you need java.util.Date
        Date date = Date.from(instant);
        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy dd MM HH:mm:ss");
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);

    }
}
