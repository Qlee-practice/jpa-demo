create table orders (
  id           bigint not null primary key auto_increment,
  user_id      bigint not null,
  product_name varchar(225)
)