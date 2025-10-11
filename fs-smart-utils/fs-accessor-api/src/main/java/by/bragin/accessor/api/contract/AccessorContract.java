package by.bragin.accessor.api.contract;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ApiResponses(
)
@Tag(name = "Accessor", description = "Контоллер предоставляет доступ к методам работы с файлами.")
public interface AccessorContract {

    @Operation(
            description = "Проверка доступности сервиса."
    )
    @GetMapping("/echo")
    @ResponseStatus(HttpStatus.OK)
    void echo();
}