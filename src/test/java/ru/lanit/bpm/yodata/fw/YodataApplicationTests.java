package ru.lanit.bpm.yodata.fw;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ru.lanit.bpm.yodata.app.PageService;
import ru.lanit.bpm.yodata.app.impl.DublicateEntityException;
import ru.lanit.bpm.yodata.app.repo.PageRepository;
import ru.lanit.bpm.yodata.domain.Page;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest(classes = YodataApplication.class)
class YodataApplicationTests {
    @Autowired
    PageService pageService;
    @Autowired
    PageRepository pageRepository;

    @Transactional
    @Test
    void contextLoads() throws DublicateEntityException {
        pageService.addPage("name", "url", "xpath");
        Page name = pageRepository.findByName("name").orElseThrow();
        assertEquals("name", name.getName());
    }

    @Transactional
    @Test
    void contextLoads_exc_dublicate() {
        try {
            //Arrange
            pageService.addPage("name", "url", "xpath");

            //Act
            pageService.addPage("name", "url2", "xpath");
        } catch (DublicateEntityException e) {
            return;
        }
        fail("ERROR");
    }
}
