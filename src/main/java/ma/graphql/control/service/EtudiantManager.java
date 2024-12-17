package ma.graphql.control.service;

import ma.graphql.control.dao.entities.Etudiant;
import ma.graphql.control.dao.repositories.EtudiantRepository;
import ma.graphql.control.dto.EtudiantDTO;
import ma.graphql.control.mapper.EtudiantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class EtudiantManager implements EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private EtudiantMapper etudiantMapper;

    @Override
    public EtudiantDTO saveEtudiant(EtudiantDTO etudiantDTO) {
        Etudiant etudiant = etudiantMapper.toEntity(etudiantDTO);
        etudiant = etudiantRepository.save(etudiant);
        return etudiantMapper.toDTO(etudiant);
    }

    @Override
    public EtudiantDTO updateEtudiant(Long id, EtudiantDTO etudiantDTO) {
        return null;
    }

    @Override
    public boolean deleteEtudiant(Long id) {
        return false;
    }

    @Override
    public List<EtudiantDTO> saveEtudiants(List<EtudiantDTO> etudiantDTOs) {
        List<Etudiant> etudiants = etudiantDTOs.stream()
                .map(etudiantMapper::toEntity)
                .collect(Collectors.toList());
        List<Etudiant> savedEtudiants = etudiantRepository.saveAll(etudiants);
        return savedEtudiants.stream()
                .map(etudiantMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EtudiantDTO getEtudiantById(Long id) {
        return null;
    }

    @Override
    public List<EtudiantDTO> getAllEtudiants() {
        return null;
    }

    @Override
    public List<EtudiantDTO> getEtudiantByDate(Date dateNaissance) {
        return etudiantRepository.findByDateNaissance(dateNaissance)
                .stream()
                .map(etudiantMapper::toDTO)
                .collect(Collectors.toList());
    }
}
