package by.bragin.accessor.service.impl;

import by.bragin.accessor.service.FilesScanService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FilesScanServiceImpl implements FilesScanService {

    @Override
    public List<String> scanFiles(String path) {
        return Collections.singletonList(path);
    }
}
