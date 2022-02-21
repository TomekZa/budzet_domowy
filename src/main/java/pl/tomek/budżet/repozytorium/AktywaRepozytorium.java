package pl.tomek.budżet.repozytorium;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomek.budżet.encje.AktywaEncja;

import java.util.UUID;

@Repository
public interface AktywaRepozytorium extends JpaRepository<AktywaEncja, UUID> {
}
