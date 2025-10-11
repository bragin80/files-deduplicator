package by.bragin.accessor.web.controller;

import by.bragin.accessor.api.contract.AccessorContract;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessorController implements AccessorContract {
    @Override
    public void echo() {
    }
}
