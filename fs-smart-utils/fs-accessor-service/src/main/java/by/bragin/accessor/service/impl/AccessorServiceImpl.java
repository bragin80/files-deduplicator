package by.bragin.accessor.service.impl;

import by.bragin.accessor.service.AccessorService;
import by.bragin.accessor.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AccessorServiceImpl implements AccessorService {
    private final FileService fileService;
}
