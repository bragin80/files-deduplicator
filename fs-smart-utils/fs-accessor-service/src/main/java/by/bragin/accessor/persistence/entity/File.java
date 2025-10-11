package by.bragin.accessor.persistence.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
// @Entity
public class File extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private Long size;
    private String md5;
    private LocalDateTime creationDate;
    private LocalDateTime lastModified;
}
