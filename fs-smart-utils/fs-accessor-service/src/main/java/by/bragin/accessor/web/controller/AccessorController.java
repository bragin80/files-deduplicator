package by.bragin.accessor.web.controller;

import by.bragin.accessor.api.contract.AccessorContract;
import by.bragin.accessor.service.AccessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class AccessorController implements AccessorContract {
    private final AccessorService accessorService;

    @Override
    public void echo() {
    }
}
