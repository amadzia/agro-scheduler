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
public class Activity {

    @Id
    @GeneratedValue
    private Long id;
    private String activityName;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate creationDate;
    private Boolean completed;
}
