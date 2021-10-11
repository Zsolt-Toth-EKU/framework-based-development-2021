package hu.ekcu.inf.framework.dao;

import hu.ekcu.inf.framework.dao.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
}
