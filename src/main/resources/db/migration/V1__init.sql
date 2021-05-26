CREATE TABLE user
(
    login       varchar(50) primary key,
    password    varchar(50)  not null,
    first_name  varchar(250) not null,
    last_name   varchar(250) not null,
    telegram_id varchar(250) not null
);

INSERT INTO user
values ('tolybayeva', 'tolybayeva', 'Толыбаева', 'Айкен', 'aiken'),
       ('giba', 'giba', 'Гиба', 'Дмитрий', 'dima'),
       ('shustikov', 'Shustikov', 'Шустиков', 'Алексей', 'alexey'),
       ('korobkin', 'Korobkin', 'Коробкин', 'Иван', 'ivan'),
       ('zaychenko', 'Zaychenko', 'Зайченко', 'Александр', 'alexander'),
       ('salnikov', 'Salnikov', 'Сальников', 'Николай', 'nikolay');

CREATE TABLE page
(
    id            BIGINT primary key,
    name          varchar(50)  not null,
    url           varchar(250) not null,
    parsingxpath varchar(250) not null
);

INSERT INTO page
values (1, 'page1', 'url1', 'xpath1'),
       (2, 'page2', 'url2', 'xpath2'),
       (3, 'page3', 'url3', 'xpath3');

CREATE TABLE subscription
(
    id      BIGINT primary key,
    page_id BIGINT      not null,
    user_id varchar(50) not null
);

INSERT INTO subscription
values (1, 1, 'tolybayeva'),
       (2, 2, 'tolybayeva'),
       (3, 3, 'tolybayeva'),
       (4, 2, 'giba'),
       (5, 3, 'giba'),
       (6, 4, 'shustikov'),
       (7, 3, 'shustikov'),
       (8, 1, 'korobkin'),
       (9, 2, 'zaychenko');

CREATE TABLE parsing_result
(
    id                BIGINT primary key,
    page_id           BIGINT      not null,
    parsing_date_time varchar(50) not null,
    result            varchar(50) not null,
    sent              BOOLEAN     not null
);

INSERT INTO parsing_result
values (1, 1, 'datetime1', 'result1', true),
       (2, 2, 'datetime2', 'result2', false),
       (3, 2, 'datetime3', 'result3', true),
       (4, 2, 'datetime4', 'result4', false),
       (5, 1, 'datetime5', 'result5', false),
       (6, 1, 'datetime6', 'result6', true),
       (7, 3, 'datetime7', 'result7', true),
       (8, 1, 'datetime8', 'result8', false),
       (9, 2, 'datetime9', 'result9', true),
       (10, 1, 'datetime10', 'result10', false);

