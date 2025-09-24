package by.bragin.service;

import java.util.List;

public interface FileService {
    Object scan(String path);
    List<String> scanTrigger();
}
