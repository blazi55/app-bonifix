create table company (
    id bigint primary key,
    name varchar(100)
);

create table company_role (
    id bigint primary key,
    user_id bigint unique,
    company_id bigint,
    foreign key (user_id) references user(id),
    foreign key (company_id) references company(id)
);