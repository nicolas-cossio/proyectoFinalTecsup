create table document_type
(
    id          integer     not null
        primary key,
    name        varchar(45) not null,
    description varchar(45) not null,
    status      integer     not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp
);

alter table document_type
    owner to postgres;

create table roles
(
    id          integer     not null
        primary key,
    name        varchar(50) not null,
    status      integer     not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp
);

alter table roles
    owner to postgres;

create table users
(
    id                    integer               not null
        primary key,
    name                  varchar(150)          not null,
    lastname              varchar(150)          not null,
    document_number       varchar(15)           not null,
    birthday              date,
    status                integer               not null,
    usua_create           varchar(45),
    date_create           timestamp,
    usua_modif            varchar(45),
    date_modif            timestamp,
    usua_delet            varchar(45),
    date_delet            timestamp,
    id_role               integer               not null
        references roles,
    id_documenttype       integer               not null
        references document_type,
    email                 varchar(150)          not null,
    password              varchar(255)          not null,
    accountnonexpire      boolean default false not null,
    accountnonlocked      boolean default false not null,
    credentialsnonexpired boolean default false not null
);

alter table users
    owner to postgres;

create table difficulty_level
(
    id          integer not null
        primary key,
    description varchar(45),
    status      integer not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp
);

alter table difficulty_level
    owner to postgres;

create table courses
(
    id            integer      not null
        primary key,
    name          varchar(255) not null,
    description   varchar(255),
    price         numeric      not null,
    duration      integer,
    status        integer      not null,
    usua_create   varchar(45),
    date_create   timestamp,
    usua_modif    varchar(45),
    date_modif    timestamp,
    usua_delet    varchar(45),
    date_delet    timestamp,
    id_difficulty integer
        references difficulty_level
);

alter table courses
    owner to postgres;

create table courses_users
(
    id          integer not null
        primary key,
    status      integer not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp,
    id_course   integer
        references courses,
    id_users    integer
        references users
);

alter table courses_users
    owner to postgres;

create table modules
(
    id          integer     not null
        primary key,
    name        varchar(45) not null,
    description varchar(45) not null,
    initialdate date        not null,
    finaldate   date        not null,
    status      integer     not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp,
    id_course   integer     not null
        references courses
);

alter table modules
    owner to postgres;

create table comments
(
    id          integer      not null
        primary key,
    id_course   integer      not null
        references courses,
    id_user     integer      not null
        references users,
    description varchar(255) not null,
    rating      integer
        constraint comments_rating_check
            check ((rating >= 1) AND (rating <= 5)),
    date        timestamp default CURRENT_TIMESTAMP,
    status      integer      not null,
    usua_create varchar(45),
    date_create timestamp,
    usua_modif  varchar(45),
    date_modif  timestamp,
    usua_delet  varchar(45),
    date_delet  timestamp
);

alter table comments
    owner to postgres;

