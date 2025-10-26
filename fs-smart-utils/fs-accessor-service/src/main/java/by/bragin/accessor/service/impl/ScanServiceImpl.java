package by.bragin.accessor.service.impl;

import by.bragin.accessor.service.ScanService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ScanServiceImpl implements ScanService {

    @Override
    public List<String> startScan(String path) {
        return Collections.singletonList(path);
    }
}
