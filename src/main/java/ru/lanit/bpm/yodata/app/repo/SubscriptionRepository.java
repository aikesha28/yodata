package ru.lanit.bpm.yodata.app.repo;

import org.springframework.data.repository.CrudRepository;
import ru.lanit.bpm.yodata.domain.Subscription;

import java.util.List;

public interface SubscriptionRepository extends CrudRepository<Subscription,Long> {
    List<Subscription> findByUserLogin(String userLogin);
}
