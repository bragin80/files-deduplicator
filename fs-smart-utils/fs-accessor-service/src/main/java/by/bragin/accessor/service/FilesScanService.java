package by.bragin.accessor.service;

import by.bragin.accessor.dto.FileEntityDto;

import java.util.List;

public interface FilesScanService {
    List<FileEntityDto> scanFiles(String path);
}
