create table user_award(
    id bigint primary key,
    user_account_id bigint,
    award_id bigint,
    foreign key (user_account_id) references user_account(id),
    foreign key (award_id) references award(id)
);