package by.bragin.accessor.web.advice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class AccessorErrorInfo {
    private HttpStatus status;
    private String message;
}
