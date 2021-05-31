package ru.lanit.bpm.yodata.adapter.hibernate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.lanit.bpm.yodata.app.repo.ParsingResultRepositoryCustom;
import ru.lanit.bpm.yodata.domain.ParsingResults;
import ru.lanit.bpm.yodata.domain.User;

import javax.persistence.EntityManager;
import java.util.*;

@Component
@Slf4j
@RequiredArgsConstructor
public class ParsingResultRepositoryCustomImpl implements ParsingResultRepositoryCustom {
    private final EntityManager entityManager;

    @Override
    public Map<String, User> custom() {
        return null;
    }

    @Override
    public Map<ParsingResults, List<User>> findUsers() {
        List<ParsingResults> prList = entityManager.createQuery("select pr from ParsingResults pr where pr.sent = false", ParsingResults.class).getResultList();
        Map<ParsingResults, List<User>> result = new HashMap<>();
        for (ParsingResults pr : prList) {
            Long id = pr.getPage().getId();
            List<User> uList =
                    entityManager.createQuery("select u from User u join Subscription s on u.login = s.name join s.page p where p.id = ?1", User.class)
                            .setParameter(1, id)
                            .getResultList();
            result.put(pr, uList);
        }
/*        List<ParsingResults> prList = entityManager.createQuery("select pr from ParsingResults pr where pr.sent = false", ParsingResults.class)
                .getResultList().forEach(entityManager.createQuery("select u from User u join Subscription s on u.login = s.name join s.page p where p.id = ?1", User.class)
                        .setParameter(1, F)
                        .getResultList());
        Map<ParsingResults, List<User>> result = new HashMap<>();
        for (ParsingResults pr : prList) {
            Long id = pr.getPage().getId();
            List<User> uList =

            result.put(pr, uList);
        }         */
        return result;
    }
}
