package ma.graphql.control.dao.repositories;

import ma.graphql.control.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public List<Etudiant> findByDateNaissance(Date dateNaissance);
}
