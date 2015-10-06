drop schema high_school2;

create schema high_school2;
-- tomando registration_number como clave unica entre los alumnos --
create table high_school2.student (registration_number int ,first_name varchar(20) not null,last_name varchar(20) not null, date_of_birth date not null);

create table high_school2.teacher (first_name varchar(20),last_name varchar(20), date_of_birth date not null);

create table high_school2.course (name varchar(20),teacher_first_name varchar(20) not null,teacher_last_name varchar(20) not null, hours_by_week double not null, shedule_time varchar(25) not null);

create table high_school2.student_course (registration_number int,course_name varchar(20),partial_note_1 int ,partial_note_2 int ,partial_note_3 int,final_note int);


alter table high_school2.student add constraint student_primary_key primary key (registration_number);
alter table high_school2.student change column registration_number registration_number int not null auto_increment;

alter table high_school2.teacher add constraint teacher_primary_key primary key (first_name ,last_name );

alter table high_school2.course add constraint course_primary_key primary key (name,shedule_time);
alter table high_school2.course add constraint teacher_foreign_key foreign key (teacher_first_name ,teacher_last_name) references high_school2.teacher(first_name ,last_name);

alter table high_school2.student_course add constraint student_course_primary_key primary key (registration_number ,course_name);
alter table high_school2.student_course add constraint student_foreign_key foreign key (registration_number) references high_school2.student (registration_number);
alter table high_school2.student_course add constraint course_foreign_key foreign key (course_name) references high_school2.course (name);

--  3 teachers --

insert into  high_school2.teacher values ('Carol','Amidon','1980-02-20');
insert into  high_school2.teacher values ('Harold','Perkins','1970-08-15');
insert into  high_school2.teacher values ('Pat','Houchens','1960-10-05');

--  5 courses  --
-- course (name ,teacher_first_name ,teacher_last_name , hours_by_week double , shedule_time varchar); --
insert into high_school2.course values ('History','Carol','Amidon',1.0, 'Monday 08:00 - 09:00');
insert into high_school2.course values ('Geography', 'Carol','Amidon',5.30,'Tuesday 10:30 - 12:00');
insert into high_school2.course values ('Geography', 'Carol','Amidon',5.30,'Thursday 15:00 - 17:00');
insert into high_school2.course values ('Geography', 'Carol','Amidon',5.30,'Friday 09:00 - 11:00');
insert into high_school2.course values ('Chemistry','Harold','Perkins',2.0 ,'Wednesday 16:30 - 18:30');
insert into high_school2.course values ('Mathematics','Harold','Perkins', 5.0,'Tuesday 10:00 - 12:00');
insert into high_school2.course values ('Mathematics','Harold','Perkins', 5.0,'Tuesday 13:30 - 14:30');
insert into high_school2.course values ('Mathematics','Harold','Perkins', 5.0,'Thursday 15:00 - 17:00');
insert into high_school2.course values ('Classics','Pat','Houchens',2.30, 'Monday 08:00 - 10:30');

-- student (registration_number int ,first_name ,last_name , date_of_birth date) --  
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('PARIL','ABREHAMSON','1992/10/21');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('RUTH','ALTMAN','1991/10/04');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('HELEN','ANDERSON','1994/10/04');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('WALTER','ARP','1992/10/02');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('DELIA','BENEDICT','1993/10/11');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ANNIE','BOOTH','1991/10/17');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('KARN','BORGEN','1995/10/09');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('OLAF','BRATZ','1989/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('DAGNY','BREDESON','1994/10/16');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLIFFORD','BUTH','1987/10/30');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('LILLIAN','CARLSON','1992/10/04');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('HAROLD','CHRISTIANSAN','1993/10/29');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('HENRY','CLARK','1994/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MABEL','DOUGHERTY','1987/10/01');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('VICTOR','EDWARDS','1988/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MYRTLE MATTISON','FENGDAHL','1993/10/24');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('GEORGE','FOLDEN','1995/10/17');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ARTHUR','GAARE','1993/10/08');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ARVID','GROVER','1991/10/28');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('EUGENE','HALL','1988/10/17');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('HILBERT','HALLAND','1996/10/27');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ARNOLD','HANSON','1987/10/16');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARENCE','HELSETH','1993/10/28');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MANDA','HOLM','1990/10/07');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('EBBA','HOVLAND','1990/10/01');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MONHRAD','IZUILE','1994/10/05');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('OLAF','JARE','1991/10/07');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MABEL','JOHNSON','1991/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ANNIE','KNUTH','1987/10/12');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ALFREDA','KOFLAR','1995/10/04');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MYRTLE','KUEHL','1987/10/13');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('AGNES','LAMMERS','1993/10/19');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MYHRE','LEACH','1995/10/19');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('BENJI','LEE','1987/10/13');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MARION','LEGGER','1987/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','LEITZ','1991/10/27');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MARTIN','LOE','1995/10/10');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ALLIE','LOKKEN','1988/10/29');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('VICTOR','LORENZEN','1990/10/12');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('JORGEN','LUTHE','1995/10/09');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MABEL','MAYFIELD','1994/10/03');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARENCE','MCGAUGH','1989/10/09');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('SELMER','MCNAIR','1989/10/26');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ANNA','MERROTT','1989/10/21');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('RALPH','MILLER','1996/10/21');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MELVIN','MOE','1987/10/02');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ADELBERT','MURPHY','1992/10/19');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('INGA','NELSON','1997/10/06');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('MORA','NERGAARD','1995/10/12');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','NORDQUEST','1989/10/14');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('ARHTUR','NYENG','1995/10/16');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('NELLIE','OLIVER','1989/10/22');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','OLSEN','1993/10/19');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','PAASCH','1992/10/03');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('AUTHUR','PEPPER','1992/10/23');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('IZETTA','PETERSON','1992/10/03');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('SELMA','POEHLS','1990/10/26');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('THEODORE','ROBINSON','1996/10/19');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('JOHN','ROMKEY','1992/10/12');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','RUGG','1996/10/08');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('DELLA','SALOMONSON','1993/10/24');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('CLARA','SANDERN','1995/10/28');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('NORMAN','SAUDER','1990/10/14');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('NELMAR','SCHEEL','1997/10/05');
insert into high_school2.student (first_name ,last_name , date_of_birth) values ('HEROLD','SCHMILEY','1990/10/27');


-- and 20 students per course --
-- student_course (registration_number ,course_name ); --

insert into high_school2.student_course  values (01,'History',6,7,6,6);
insert into high_school2.student_course  values (01,'Geography',8,7,8,7);
insert into high_school2.student_course values (02,'Mathematics',7,5,7,6);
insert into high_school2.student_course  values (02,'Chemistry',8,9,7,8);
insert into high_school2.student_course  values (03,'Classics',6,5,7,6);
insert into high_school2.student_course (registration_number ,course_name ) values (03,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (04,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (04,'Classics');
insert into high_school2.student_course (registration_number ,course_name ) values (05,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (05,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (06,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (06,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (07,'Classics');
insert into high_school2.student_course (registration_number ,course_name ) values (07,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (08,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (08,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (09,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (09,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (10,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (10,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (11,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (12,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (12,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (13,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (13,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (14,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (15,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (15,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (16,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (16,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (17,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (18,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (18,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (19,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (20,'Mathematics');

insert into high_school2.student_course (registration_number ,course_name ) values (21,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (21,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (22,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (22,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (23,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (24,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (24,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (25,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (25,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (26,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (27,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (27,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (28,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (28,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (29,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (30,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (30,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (31,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (32,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (33,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (34,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (34,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (35,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (35,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (36,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (37,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (37,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (38,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (38,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (39,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (40,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (40,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (41,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (41,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (42,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (43,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (43,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (44,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (45,'Mathematics');

insert into high_school2.student_course (registration_number ,course_name ) values (46,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (46,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (47,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (47,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (48,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (49,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (49,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (50,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (50,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (51,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (52,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (52,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (53,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (53,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (54,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (55,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (55,'Geography');
insert into high_school2.student_course (registration_number ,course_name ) values (56,'Chemistry');
insert into high_school2.student_course (registration_number ,course_name ) values (57,'Mathematics');
insert into high_school2.student_course (registration_number ,course_name ) values (58,'Classics');

insert into high_school2.student_course (registration_number ,course_name ) values (59,'Classics');
insert into high_school2.student_course (registration_number ,course_name ) values (60,'Classics');
insert into high_school2.student_course (registration_number ,course_name ) values (61,'Classics');
insert into high_school2.student_course (registration_number ,course_name ) values (62,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (63,'History');
insert into high_school2.student_course (registration_number ,course_name ) values (64,'Geography');