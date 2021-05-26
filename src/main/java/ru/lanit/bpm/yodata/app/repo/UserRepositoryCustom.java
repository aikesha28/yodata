package ru.lanit.bpm.yodata.app.repo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import ru.lanit.bpm.yodata.domain.ParsingResults;
import ru.lanit.bpm.yodata.domain.User;

import java.util.List;
import java.util.Map;

public interface UserRepositoryCustom {
/*
    Map<String, User> custom();
*/

    List findUsers();
}
