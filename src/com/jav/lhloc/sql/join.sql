create table hoc_sinhs (
                           id int primary key auto_increment,
                           name varchar(255),
                           age int,
                           lop_hoc_id int
);

create table lop_hocs (
                          id int primary key auto_increment,
                          name varchar(255),
                          si_so int
);

insert into lop_hocs (name, si_so) values
                                       ('10A1', 30), ('10A2', 40), ('10A3', 50), ('10A4', 60);

insert into hoc_sinhs (name, age, lop_hoc_id) values
                                                  ('Nguyen Van A', 15, 1),
                                                  ('Nguyen Van B', 16, 2),
                                                  ('Nguyen Van C', 17, 3),
                                                  ('Nguyen Van D', 18, 4);

select hoc_sinhs.id, hoc_sinhs.name, lop_hocs.name
from hoc_sinhs, lop_hocs
where hoc_sinhs.lop_hoc_id = lop_hocs.id;

select hoc_sinhs.id, hoc_sinhs.name, lop_hocs.name
from hoc_sinhs join lop_hocs
                    on hoc_sinhs.lop_hoc_id = lop_hocs.id;

select *
from (select hoc_sinhs.id, hoc_sinhs.name, lop_hocs.name as hihi
      from hoc_sinhs
               join lop_hocs
                    on hoc_sinhs.lop_hoc_id = lop_hocs.id) as a
WHERE hihi like '10A1';