package ru.lanit.bpm.yodata.app;

import ru.lanit.bpm.yodata.app.impl.EntityDoesNotExistsException;
import ru.lanit.bpm.yodata.domain.User;

public interface UserService {
    User findUserSubscription(String userLogin) throws EntityDoesNotExistsException;
}
