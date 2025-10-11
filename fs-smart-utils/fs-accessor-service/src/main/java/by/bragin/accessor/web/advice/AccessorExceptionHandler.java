package by.bragin.accessor.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccessorExceptionHandler {
    /**
     * Перегхватываем все сообщения об ошибках
     * @param exception
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<AccessorErrorInfo> handleException(Exception exception) {
        return ResponseEntity.badRequest().body(
                AccessorErrorInfo.builder()
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .message(exception.getMessage())
                        .build()
        );
    }
}
