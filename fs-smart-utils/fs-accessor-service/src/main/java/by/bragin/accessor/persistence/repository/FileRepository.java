package by.bragin.accessor.persistence.repository;

import by.bragin.accessor.persistence.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FileRepository extends JpaRepository<File, Long> {
}
