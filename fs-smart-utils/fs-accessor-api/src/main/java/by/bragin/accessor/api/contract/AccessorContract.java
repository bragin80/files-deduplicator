package by.bragin.accessor.api.contract;

import by.bragin.accessor.dto.FileEntityDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Operation(
           description = "Запуск сканирования файловой системы по указанному пути."
    )
    @PostMapping("/scan")
    @ResponseStatus(HttpStatus.ACCEPTED)
    ResponseEntity<List<FileEntityDto>> scan(@RequestParam String path);
}