package by.bragin.accessor.service;

import by.bragin.accessor.AccessorServiceApplicationTest;
import by.bragin.accessor.persistence.entity.File;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileServiceTest extends AccessorServiceApplicationTest {
    @Autowired
    private FileService fileService;

    @Test
    public void testSaveFile() {
        assertNotNull(
                fileService.saveFile(
                        File.builder()
                                .name("test.txt")
                                .path("/test/path")
                                .build()
                )
        );
    }
}
