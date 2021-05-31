package ru.lanit.bpm.yodata.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@ToString
@Getter
@Entity
@Table(name = "page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_pages_id")
    @SequenceGenerator(name="sq_pages_id",allocationSize = 1)
    private Long id;
    private String name;
    private String url;
    private String parsingXPath;

    public Page(String name, String url, String parsingXPath) {
        this.name=name;
        this.url=url;
        this.parsingXPath=parsingXPath;
    }
}
