package lk.ijse.gdse.aad67.NoteCollector_V2.dao;

import lk.ijse.gdse.aad67.NoteCollector_V2.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserEntity,String> {
       Optional<UserEntity> findByEmail(String email);
}
