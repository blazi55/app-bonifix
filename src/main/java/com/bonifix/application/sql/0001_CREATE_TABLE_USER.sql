create table user (
    id bigint auto_increment primary key,
    login varchar(40),
    password varchar(40),
    firstname varchar(100),
    lastname varchar(100)
);
