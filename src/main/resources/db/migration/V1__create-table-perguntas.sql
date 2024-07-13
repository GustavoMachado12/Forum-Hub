create table perguntas(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(200) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    data datetime not null,
    situacao varchar(100) not null,

    primary key (id)
);
