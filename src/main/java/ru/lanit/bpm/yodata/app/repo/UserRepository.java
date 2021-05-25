package ru.lanit.bpm.yodata.app.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.lanit.bpm.yodata.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String>, UserRepositoryCustom{
    @Query("select u from User u")
    List<User> findSpecialUsers(String lastName);
}
