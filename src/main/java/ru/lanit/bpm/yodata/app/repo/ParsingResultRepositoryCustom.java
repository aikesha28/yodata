package ru.lanit.bpm.yodata.app.repo;

import ru.lanit.bpm.yodata.domain.ParsingResults;
import ru.lanit.bpm.yodata.domain.User;

import java.util.List;
import java.util.Map;

public interface ParsingResultRepositoryCustom {
    Map<String, User> custom();

    Map<ParsingResults, List<User>> findUsers();
}
