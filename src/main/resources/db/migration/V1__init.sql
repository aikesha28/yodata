CREATE TABLE user
(
    login       varchar(50) primary key,
    password    varchar(50)  not null,
    first_name  varchar(250) not null,
    last_name   varchar(250) not null,
    telegram_id varchar(250) not null
);

INSERT INTO user
values ('tolybayeva', '123', 'Толыбаева', 'Айкен', '123456');

CREATE TABLE page
(
    id            BIGINT primary key,
    name          varchar(50)  not null,
    url           varchar(250) not null,
    parsing_xpath varchar(250) not null
);

CREATE TABLE subscription
(
    id      BIGINT primary key,
    page_id BIGINT not null,
    user_id varchar(50) not null
);

CREATE TABLE parsing_result
(
    id               BIGINT primary key,
    page_id          BIGINT not null,
    parsing_datetime varchar(50) not null,
    result           varchar(50) not null,
    sent             BOOLEAN not null
);

