package geiffel.da4.issuetracker.projet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjetLocalServiceTest {
    List<Projet> projets = new ArrayList<>() {{
        add(new Projet(1L, "leMemeNom1"));
        add(new Projet(2L, "leMemeNom2"));
        add(new Projet(3L, "leMemeNom3"));
        add(new Projet(4L, "leMemeNom4"));
    }};

    private final ProjetService projetService = new ProjetLocalService(projets);

    @Test
    void whenGettingAll_shouldBeOfSize4() {
        List<Projet> lesProjets = projetService.getAll();
        assertEquals(4, lesProjets.size());
    }


}
