package by.bragin.service.mock;

import by.bragin.service.FileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceMock implements FileService {
    @Override
    public Object scan(String path) {
        return path;
    }
}
