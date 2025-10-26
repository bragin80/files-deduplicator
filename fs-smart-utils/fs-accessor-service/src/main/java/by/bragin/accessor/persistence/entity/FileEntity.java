package by.bragin.accessor.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@Entity
public class FileEntity extends BaseEntity {
    @NotNull
    private String name;
    @NotNull
    private String path;
    private Long size;
    private String md5;
}
