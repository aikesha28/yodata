package ru.lanit.bpm.yodata.app;

import ru.lanit.bpm.yodata.app.impl.EntityDoesNotExistsException;
import ru.lanit.bpm.yodata.domain.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> findUserSubscription(String userLogin);

    void deleteSubscription(Long id);

    void addSubscrtuction(Long pageId, String userLogin) throws EntityDoesNotExistsException;
}
