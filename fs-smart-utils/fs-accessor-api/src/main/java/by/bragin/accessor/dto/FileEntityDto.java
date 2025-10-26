package by.bragin.accessor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
    public class FileEntityDto {
        private String name;
        private String path;
        private Long size;
    }

