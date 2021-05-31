package ru.lanit.bpm.yodata.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lanit.bpm.yodata.app.UserService;
import ru.lanit.bpm.yodata.app.repo.UserRepository;
import ru.lanit.bpm.yodata.domain.User;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public User findUserSubscription(String userLogin) throws EntityDoesNotExistsException {
        return userRepository.findById(userLogin).orElseThrow(() -> new EntityDoesNotExistsException("User not found!"));
    }
}
