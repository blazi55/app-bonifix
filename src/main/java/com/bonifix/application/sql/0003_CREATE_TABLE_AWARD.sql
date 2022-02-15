create table award (
    id bigint primary key,
    price bigint,
    name varchar(100),
    company_id bigint unique,
    foreign key (company_id) references company(id)
);