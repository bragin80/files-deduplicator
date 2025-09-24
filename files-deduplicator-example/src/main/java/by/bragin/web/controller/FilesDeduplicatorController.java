package by.bragin.web.controller;

import by.bragin.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/deduplicator")
@RestController
public class FilesDeduplicatorController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<?> folderPath(@RequestParam(name = "path") String path) {
        return new ResponseEntity<>(fileService.scan(path), HttpStatus.OK);
    }

    @PostMapping("/scan")
    public ResponseEntity<List<String>> scanTrigger() {
        List<String> files = fileService.scanTrigger();
        return new ResponseEntity<>(files, HttpStatus.OK);
    }
}
