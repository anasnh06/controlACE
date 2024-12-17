package ma.graphql.control.web;


import ma.graphql.control.dto.EtudiantDTO;
import ma.graphql.control.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class EtudiantGraphQLController {

    @Autowired
    private EtudiantService etudiantService;

    @QueryMapping
    public List<EtudiantDTO> getEtudiantByDate(@Argument Date dateNaissance) {
        return etudiantService.getEtudiantByDate(dateNaissance);
    }

    @MutationMapping
    public EtudiantDTO saveEtudiant(@Argument EtudiantDTO etudiantDTO) {
        return etudiantService.saveEtudiant(etudiantDTO);
    }


}
