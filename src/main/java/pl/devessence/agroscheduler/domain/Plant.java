package pl.devessence.agroscheduler.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plant {

    @Id
    @GeneratedValue
    private Long id;

    private String plantName;
    private String activityName;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate endDate;
    private Integer minTemperature;
    private Integer maxTemperature;
    private Boolean sunny;
    private Boolean cloudy;
    private Boolean rainy;
    private String additionalInfo;
    private Boolean completed;
}
