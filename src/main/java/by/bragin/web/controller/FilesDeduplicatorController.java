package by.bragin.web.controller;

import by.bragin.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/deduplicator")
@RestController
public class FilesDeduplicatorController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<?> folderPath(@RequestParam(name = "path") String path) {
        return new ResponseEntity<>(fileService.scan(path), HttpStatus.OK);
    }
}
