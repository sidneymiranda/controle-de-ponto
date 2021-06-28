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
public class CompTime {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    class CompTimeID implements Serializable {
        private Long bankHoursID;
        private Movimentation movimentationID;
        private User userID;
    }

    @EmbeddedId
    private CompTimeID id;
    private LocalDateTime dateWorked;
    private BigDecimal workedHours;
    private BigDecimal hoursBalance;

}
