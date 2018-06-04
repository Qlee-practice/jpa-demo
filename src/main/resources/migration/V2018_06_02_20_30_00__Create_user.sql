create table users (
  id       bigint primary key not null auto_increment,
  name     varchar(225)       not null,
  password varchar(225)       not null
)