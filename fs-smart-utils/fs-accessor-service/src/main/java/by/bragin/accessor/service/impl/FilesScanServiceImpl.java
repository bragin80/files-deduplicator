package by.bragin.accessor.service.impl;

import by.bragin.accessor.dto.FileEntityDto;
import by.bragin.accessor.service.FilesScanService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilesScanServiceImpl implements FilesScanService {

    @Override
    public List<FileEntityDto> scanFiles(String path) {
        List<FileEntityDto> filesList = new ArrayList<>();
        File directory = new File(path);
        File[] directoryFiles = directory.listFiles();

        if (directoryFiles != null) {
            Arrays.stream(directoryFiles).filter(File::isFile).forEach(file -> {
                FileEntityDto fileEntityDto = new FileEntityDto();
                fileEntityDto.setName(file.getName());
                fileEntityDto.setPath(file.getAbsolutePath());
                fileEntityDto.setSize(file.length());
                filesList.add(fileEntityDto);
            });
        }

        return filesList;
    }
}