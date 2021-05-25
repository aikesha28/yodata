package ru.lanit.bpm.yodata.adapter.hibernate;

import org.springframework.stereotype.Component;
import ru.lanit.bpm.yodata.app.repo.UserRepositoryCustom;
import ru.lanit.bpm.yodata.domain.User;

import java.util.Map;

@Component
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @Override
    public Map<String, User> custom() {
        return null;
    }
}
