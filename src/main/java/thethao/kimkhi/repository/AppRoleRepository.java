package thethao.kimkhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thethao.kimkhi.models.AppRole;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
	
}
