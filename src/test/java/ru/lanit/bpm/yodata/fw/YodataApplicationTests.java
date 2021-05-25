package ru.lanit.bpm.yodata.fw;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.lanit.bpm.yodata.app.repo.UserRepository;
import ru.lanit.bpm.yodata.domain.User;

import java.util.List;

@Slf4j
@SpringBootTest(classes = YodataApplication.class)
class YodataApplicationTests {
/*    @Autowired
    UserRepository userRepository;*/

    @Test
    void contextLoads() {
/*
        List<User> tolybayeva = userRepository.findByFirstName("tolybayeva");
        log.info(tolybayeva.toString());

*/
    }
}
