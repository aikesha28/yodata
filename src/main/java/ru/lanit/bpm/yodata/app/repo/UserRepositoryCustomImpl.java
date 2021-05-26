package ru.lanit.bpm.yodata.app.repo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;
import ru.lanit.bpm.yodata.app.repo.UserRepositoryCustom;
import ru.lanit.bpm.yodata.domain.ParsingResults;
import ru.lanit.bpm.yodata.domain.User;

import javax.persistence.EntityManager;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Slf4j
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    @Autowired
    EntityManager entityManager;

/*
    @Override
    public Map<String, User> custom() {
        return null;
    }

*/

    @Override
    public List findUsers() {
        List<ParsingResults> prList = entityManager.createQuery("select pr from ParsingResults pr" +
                " where pr.sent = false",ParsingResults.class).getResultList();
        for(ParsingResults pr : prList){

            pr.getPage()
        }
        return prList;
    }
}
