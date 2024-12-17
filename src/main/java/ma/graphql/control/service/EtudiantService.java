package ma.graphql.control.service;

import ma.graphql.control.dto.EtudiantDTO;

import java.util.Date;
import java.util.List;

public interface EtudiantService {

    public EtudiantDTO saveEtudiant(EtudiantDTO etudiantDTO);

    public EtudiantDTO updateEtudiant(Long id, EtudiantDTO etudiantDTO);

    public boolean deleteEtudiant(Long id);

    public List<EtudiantDTO> saveEtudiants(List<EtudiantDTO> etudiantDTOs);


    public EtudiantDTO getEtudiantById(Long id);
    public List<EtudiantDTO> getAllEtudiants();


    public List<EtudiantDTO> getEtudiantByDate(Date dateNaissance);


}
