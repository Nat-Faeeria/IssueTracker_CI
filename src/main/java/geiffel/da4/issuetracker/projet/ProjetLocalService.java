package geiffel.da4.issuetracker.projet;

import geiffel.da4.issuetracker.utils.LocalService;

import java.util.List;

public class ProjetLocalService extends LocalService<Projet, Long> implements ProjetService {

    public ProjetLocalService(List<Projet> allValues) {
        super(allValues);
    }

    @Override
    protected String getIdentifier() {
        return "id";
    }

    @Override
    public List<Projet> getAll() {
        return super.getAll();
    }
}
