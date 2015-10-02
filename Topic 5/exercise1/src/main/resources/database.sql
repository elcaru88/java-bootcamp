drop schema high_school;

create schema high_school;
-- tomando registrationNumber como clave unica entre los alumnos --
create table high_school.student (registrationNumber int ,firstName varchar(20) not null,lastName varchar(20) not null, dateOfBirth date not null);

create table high_school.teacher (firstName varchar(20),lastName varchar(20), dateOfBirth date not null);

create table high_school.course (name varchar(20),teacherFirstName varchar(20) not null,teacherLastName varchar(20) not null, hoursByWeek double not null, sheduleTime varchar(25) not null);

create table high_school.studentCourse (registrationNumber int,courseName varchar(20),partialNote_1 int,partialNote_2 int ,partialNote_3 int,finalNote int);


alter table high_school.student add constraint student_primary_key primary key (registrationNumber);
alter table high_school.student change column registrationNumber registrationNumber int not null auto_increment;

alter table high_school.teacher add constraint teacher_primary_key primary key (firstName ,lastName );

alter table high_school.course add constraint course_primary_key primary key (name,sheduleTime);
alter table high_school.course add constraint teacher_foreign_key foreign key (teacherFirstName ,teacherLastName) references high_school.teacher(firstName ,lastName);

alter table high_school.studentCourse add constraint studentCourse_primary_key primary key (registrationNumber ,courseName);
alter table high_school.studentCourse add constraint student_foreign_key foreign key (registrationNumber) references high_school.student (registrationNumber);
alter table high_school.studentCourse add constraint course_foreign_key foreign key (courseName) references high_school.course (name);

--  3 teachers --

insert into  high_school.teacher values ('Carol','Amidon','1980-02-20');
insert into  high_school.teacher values ('Harold','Perkins','1970-08-15');
insert into  high_school.teacher values ('Pat','Houchens','1960-10-05');

--  5 courses  --
-- course (name ,teacherFirstName ,teacherLastName , hoursByWeek double , sheduleTime varchar); --
insert into high_school.course values ('History','Carol','Amidon',1.0, 'Monday 08:00 - 09:00');
insert into high_school.course values ('Geography', 'Carol','Amidon',5.30,'Tuesday 10:30 - 12:00');
insert into high_school.course values ('Geography', 'Carol','Amidon',5.30,'Thursday 15:00 - 17:00');
insert into high_school.course values ('Geography', 'Carol','Amidon',5.30,'Friday 09:00 - 11:00');
insert into high_school.course values ('Chemistry','Harold','Perkins',2.0 ,'Wednesday 16:30 - 18:30');
insert into high_school.course values ('Mathematics','Harold','Perkins', 5.0,'Tuesday 10:00 - 12:00');
insert into high_school.course values ('Mathematics','Harold','Perkins', 5.0,'Tuesday 13:30 - 14:30');
insert into high_school.course values ('Mathematics','Harold','Perkins', 5.0,'Thursday 15:00 - 17:00');
insert into high_school.course values ('Classics','Pat','Houchens',2.30, 'Monday 08:00 - 10:30');

-- student (registrationNumber int ,firstName ,lastName , dateOfBirth date) --  
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('PARIL','ABREHAMSON','1992/10/21');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('RUTH','ALTMAN','1991/10/04');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('HELEN','ANDERSON','1994/10/04');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('WALTER','ARP','1992/10/02');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('DELIA','BENEDICT','1993/10/11');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ANNIE','BOOTH','1991/10/17');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('KARN','BORGEN','1995/10/09');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('OLAF','BRATZ','1989/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('DAGNY','BREDESON','1994/10/16');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLIFFORD','BUTH','1987/10/30');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('LILLIAN','CARLSON','1992/10/04');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('HAROLD','CHRISTIANSAN','1993/10/29');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('HENRY','CLARK','1994/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MABEL','DOUGHERTY','1987/10/01');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('VICTOR','EDWARDS','1988/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MYRTLE MATTISON','FENGDAHL','1993/10/24');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('GEORGE','FOLDEN','1995/10/17');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ARTHUR','GAARE','1993/10/08');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ARVID','GROVER','1991/10/28');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('EUGENE','HALL','1988/10/17');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('HILBERT','HALLAND','1996/10/27');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ARNOLD','HANSON','1987/10/16');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARENCE','HELSETH','1993/10/28');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MANDA','HOLM','1990/10/07');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('EBBA','HOVLAND','1990/10/01');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MONHRAD','IZUILE','1994/10/05');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('OLAF','JARE','1991/10/07');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MABEL','JOHNSON','1991/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ANNIE','KNUTH','1987/10/12');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ALFREDA','KOFLAR','1995/10/04');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MYRTLE','KUEHL','1987/10/13');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('AGNES','LAMMERS','1993/10/19');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MYHRE','LEACH','1995/10/19');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('BENJI','LEE','1987/10/13');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MARION','LEGGER','1987/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','LEITZ','1991/10/27');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MARTIN','LOE','1995/10/10');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ALLIE','LOKKEN','1988/10/29');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('VICTOR','LORENZEN','1990/10/12');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('JORGEN','LUTHE','1995/10/09');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MABEL','MAYFIELD','1994/10/03');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARENCE','MCGAUGH','1989/10/09');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('SELMER','MCNAIR','1989/10/26');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ANNA','MERROTT','1989/10/21');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('RALPH','MILLER','1996/10/21');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MELVIN','MOE','1987/10/02');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ADELBERT','MURPHY','1992/10/19');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('INGA','NELSON','1997/10/06');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('MORA','NERGAARD','1995/10/12');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','NORDQUEST','1989/10/14');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('ARHTUR','NYENG','1995/10/16');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('NELLIE','OLIVER','1989/10/22');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','OLSEN','1993/10/19');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','PAASCH','1992/10/03');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('AUTHUR','PEPPER','1992/10/23');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('IZETTA','PETERSON','1992/10/03');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('SELMA','POEHLS','1990/10/26');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('THEODORE','ROBINSON','1996/10/19');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('JOHN','ROMKEY','1992/10/12');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','RUGG','1996/10/08');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('DELLA','SALOMONSON','1993/10/24');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('CLARA','SANDERN','1995/10/28');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('NORMAN','SAUDER','1990/10/14');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('NELMAR','SCHEEL','1997/10/05');
insert into high_school.student (firstName ,lastName , dateOfBirth) values ('HEROLD','SCHMILEY','1990/10/27');


-- and 20 students per course --
-- studentCourse (registrationNumber ,courseName ); --

insert into high_school.studentCourse (registrationNumber ,courseName ) values (01,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (01,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (02,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (02,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (03,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (03,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (04,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (04,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (05,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (05,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (06,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (06,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (07,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (07,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (08,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (08,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (09,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (09,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (10,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (10,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (11,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (12,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (12,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (13,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (13,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (14,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (15,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (15,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (16,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (16,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (17,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (18,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (18,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (19,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (20,'Mathematics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (21,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (21,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (22,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (22,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (23,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (24,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (24,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (25,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (25,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (26,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (27,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (27,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (28,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (28,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (29,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (30,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (30,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (31,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (32,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (33,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (34,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (34,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (35,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (35,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (36,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (37,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (37,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (38,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (38,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (39,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (40,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (40,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (41,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (41,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (42,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (43,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (43,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (44,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (45,'Mathematics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (46,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (46,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (47,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (47,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (48,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (49,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (49,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (50,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (50,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (51,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (52,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (52,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (53,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (53,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (54,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (55,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (55,'Geography');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (56,'Chemistry');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (57,'Mathematics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (58,'Classics');

insert into high_school.studentCourse (registrationNumber ,courseName ) values (59,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (60,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (61,'Classics');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (62,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (63,'History');
insert into high_school.studentCourse (registrationNumber ,courseName ) values (64,'Geography');