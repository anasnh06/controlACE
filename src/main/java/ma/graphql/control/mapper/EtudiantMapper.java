package ma.graphql.control.mapper;

import ma.graphql.control.dao.entities.Etudiant;
import ma.graphql.control.dto.EtudiantDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Etudiant toEntity(EtudiantDTO etudiantDTO) {
        return modelMapper.map(etudiantDTO, Etudiant.class);
    }

    public EtudiantDTO toDTO(Etudiant etudiant) {
        return modelMapper.map(etudiant, EtudiantDTO.class);
    }
}
