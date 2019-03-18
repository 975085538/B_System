

create table thacher (
  id int primary key,
  type int
);


create table student(id int primary key );

create table liuyan(
  ti_id int references ti(id),
  t_id int references thacher(id),
  s_id int references student(id),
  message varchar(128),
  reply varchar(128)
);

create table ti(
  id int primary key ,
  name varchar(32),
  desc varchar(32),
  type int references thacher(type)
)


