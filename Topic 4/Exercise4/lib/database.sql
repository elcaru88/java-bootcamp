drop schema userservice ;
create schema userservice ;

create table userservice.photo (userPhoto varchar(20), likes int);

create table userservice.users (userName varchar(20) , userPass varchar(20) not null,
userPhoto varchar(20), friends varchar(20)  );

alter table userservice.photo add constraint photo_PK primary key (userPhoto );

alter table userservice.users add constraint users_PK primary key (userName);
alter table userservice.users add constraint friends_FK foreign key (friends) references userservice.users (userName);
alter table userservice.users add constraint photo_FK foreign key (userPhoto) references userservice.photo (userPhoto) ;

