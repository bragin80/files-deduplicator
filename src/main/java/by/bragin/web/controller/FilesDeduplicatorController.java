package by.bragin.web.controller;

import by.bragin.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/deduplicator")
public class FilesDeduplicatorController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public ResponseEntity<?> folderPath(@RequestParam(name = "path") String path) {
        return new ResponseEntity<>(fileService.scan(path), HttpStatus.OK);
    }
}
