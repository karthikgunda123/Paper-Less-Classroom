package bd.edu.diu.cis.classroom.repository;

import bd.edu.diu.cis.classroom.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findRoleByName(String name);
}
