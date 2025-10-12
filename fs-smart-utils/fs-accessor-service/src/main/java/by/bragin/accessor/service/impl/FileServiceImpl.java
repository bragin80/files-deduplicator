package by.bragin.accessor.service.impl;

import by.bragin.accessor.persistence.entity.File;
import by.bragin.accessor.persistence.repository.FileRepository;
import by.bragin.accessor.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class FileServiceImpl implements FileService {
    private final FileRepository fileRepository;

    @Transactional
    @Override
    public Long saveFile(File file) {
        return fileRepository.save(file).getId();
    }
}
