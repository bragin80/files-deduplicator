package by.bragin.accessor.service.impl;

import by.bragin.accessor.persistence.entity.FileEntity;
import by.bragin.accessor.persistence.repository.FileEntityRepository;
import by.bragin.accessor.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class FileServiceImpl implements FileService {
    private final FileEntityRepository fileRepository;

    @Transactional
    @Override
    public Long saveFile(FileEntity file) {
        return fileRepository.save(file).getId();
    }
}
