package by.bragin.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/deduplicator")
public class FilesDeduplicatorController {

    @GetMapping
    public ResponseEntity<String> folderPath(@RequestParam(defaultValue
            = "folder-path") String path) {
        return new ResponseEntity<>(path, HttpStatus.OK);
    }
}
