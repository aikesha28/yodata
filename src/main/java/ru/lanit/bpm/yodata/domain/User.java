package ru.lanit.bpm.yodata.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@ToString
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    private String login;
    @ToString.Exclude
    private String password;
    private String firstName;
    private String lastName;
    private String telegramId;
    @ManyToMany
            //EAGER все связанные сущности сразу извлекаем
            //LAZY при обращении вытягивает сущности
            //проблема N+1
    List<Page> pages;
}
