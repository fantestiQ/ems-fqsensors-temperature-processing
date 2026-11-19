package com.fq.fqsensors.temperature.processing;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

 class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7(){
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidOffsetDateTime = UUIDv7Utils.extractOffDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidOffsetDateTime).isEqualTo(currentDateTime);
    }
}
