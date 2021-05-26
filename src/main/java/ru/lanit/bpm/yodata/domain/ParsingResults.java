package ru.lanit.bpm.yodata.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@ToString
@Getter
@Entity
@Table(name="parsing_result")
public class ParsingResults {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="page_id")
    private Page page;
    private String parsingDateTime;
    private String result;
    private boolean sent;
}
