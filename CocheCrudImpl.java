package InterfacesTask;

public class CocheCrudImpl implements CocheCrudInterface{
    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public void save() {

    }
    @Override
    public void findAll() {

    }
    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        return "CocheCrudImpl{" +
                "\nsave='" + save + '\'' +
                "\nfindAll='" + findAll + '\'' +
                "\ndelete='" + delete + '\'' +
                '}';
    }
    }