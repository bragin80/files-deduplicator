package by.bragin.accessor.api.contract;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface AccessorContract {
    @GetMapping("/echo")
    @ResponseStatus(HttpStatus.OK)
    void echo();
}
