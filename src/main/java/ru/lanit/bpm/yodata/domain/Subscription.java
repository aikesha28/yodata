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
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "page_id")
    private Page page;

    public Subscription(User user, Page page) {
        this.page=page;
        this.user=user;
    }
}
