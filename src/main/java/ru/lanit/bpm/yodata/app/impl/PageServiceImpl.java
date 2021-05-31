package ru.lanit.bpm.yodata.app.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.lanit.bpm.yodata.app.repo.PageRepository;
import ru.lanit.bpm.yodata.app.PageService;
import ru.lanit.bpm.yodata.domain.Page;

import java.util.List;

@AllArgsConstructor
@Service
public class PageServiceImpl implements PageService {
    private final PageRepository pageRepository;

    @Transactional
    @Override
    public void addPage(String name, String url, String parsingXPath) throws DublicateEntityException {
        if (pageRepository.findByName(name).isPresent()) {
            throw new DublicateEntityException("Page already exists");
        } else {
            Page page = new Page(name, url, parsingXPath);
            pageRepository.save(page);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Page> findAllPages() {
        return pageRepository.findAll();
    }

    @Transactional
    @Override
    public void deletePage(Long id) {
        pageRepository.deleteById(id);
    }
}
