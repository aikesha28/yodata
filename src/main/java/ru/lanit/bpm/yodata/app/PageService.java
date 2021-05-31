package ru.lanit.bpm.yodata.app;

import ru.lanit.bpm.yodata.app.impl.DublicateEntityException;
import ru.lanit.bpm.yodata.domain.Page;

import java.util.List;

public interface PageService {
    void addPage(String name, String url,String parsingXPath) throws DublicateEntityException;

    List<Page> findAllPages();

    void deletePage(Long id);
}
