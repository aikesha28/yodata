package ru.lanit.bpm.yodata.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lanit.bpm.yodata.app.SubscriptionService;
import ru.lanit.bpm.yodata.app.UserService;
import ru.lanit.bpm.yodata.app.repo.PageRepository;
import ru.lanit.bpm.yodata.app.repo.SubscriptionRepository;
import ru.lanit.bpm.yodata.app.repo.UserRepository;
import ru.lanit.bpm.yodata.domain.Page;
import ru.lanit.bpm.yodata.domain.Subscription;
import ru.lanit.bpm.yodata.domain.User;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;
    private final UserService userService;
    private final PageRepository pageRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Subscription> findUserSubscription(String userLogin) {
        return subscriptionRepository.findByUserLogin(userLogin);
    }

    @Transactional
    @Override
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void addSubscrtuction(Long pageId, String userLogin)throws EntityDoesNotExistsException {
        User user = userService.findUserSubscription(userLogin);
        Page page = pageRepository.findById(pageId).orElseThrow(()->new EntityDoesNotExistsException("Pagenot found!"));
        Subscription s = new Subscription(user, page);
        subscriptionRepository.save(s);
    }
}
