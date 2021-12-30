create table student
(
    id         int         not null
        primary key,
    name       varchar(50) null,
    sex        varchar(10) null,
    age        int         null,
    username   varchar(20) null,
    password   varchar(20) null,
    major      int         not null,
    enrollment date        null,
    constraint student_major__fk
        foreign key (major) references major (id)
);

INSERT INTO software_practice.student (id, name, sex, age, username, password, major, enrollment) VALUES (1000, 'qlf', '男', 100, 'qlf', '123456', 10, '2021-09-01');
