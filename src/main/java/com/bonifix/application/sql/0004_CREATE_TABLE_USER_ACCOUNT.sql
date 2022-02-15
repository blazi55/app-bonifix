create table user_account (
    id bigint primary key,
    balance bigint,
    user_id bigint unique,
    foreign key (user_id) references user(id)
);