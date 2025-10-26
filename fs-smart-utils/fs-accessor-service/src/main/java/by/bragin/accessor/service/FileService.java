package by.bragin.accessor.service;

import by.bragin.accessor.persistence.entity.FileEntity;

public interface FileService {
    Long saveFile(FileEntity file);
}
