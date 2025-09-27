package by.bragin.service.mock;

import by.bragin.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceMock implements FileService {
    @Override
    public Object scan(String path) {
        return path;
    }

    @Override
    public List<String> scanTrigger() {
        return List.of("/Pictures/img1.jpg", "/Pictures/img1(1).jpg");
    }
}
