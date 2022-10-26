package ca.mcgill.ecse.mmss.dao;
import org.springframework.data.repository.CrudRepository;
package ca.mcgill.ecse.mmss.model.Artefact;

public interface ArtefactRepository extends CrudRepository<Artefact, Integer> {
    Artefact findArtefactByArtefactId(int artefactId);
}