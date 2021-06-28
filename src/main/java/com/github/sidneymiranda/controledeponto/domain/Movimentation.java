package com.github.sidneymiranda.controledeponto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimentation {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    class MovimentationID implements Serializable {
        private Long movimentationId;
        private Long userId;
    }

    @EmbeddedId
    private MovimentationID id;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;
}
