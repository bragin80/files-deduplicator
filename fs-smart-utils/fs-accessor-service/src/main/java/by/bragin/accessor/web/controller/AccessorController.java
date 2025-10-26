package by.bragin.accessor.web.controller;

import by.bragin.accessor.api.contract.AccessorContract;
import by.bragin.accessor.service.FilesScanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccessorController implements AccessorContract {
    private final FilesScanService scanService;

    @Override
    public void echo() {
    }

    @Override
    public ResponseEntity<List<String>> scan(String path) {
        return ResponseEntity.accepted().body(scanService.scanFiles(path));
    }
}
