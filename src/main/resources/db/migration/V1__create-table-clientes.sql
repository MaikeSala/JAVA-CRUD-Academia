create table clientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    data_Nascimento varchar(11) not null,
    genero varchar(100) not null,
    telefone varchar(20) not null,
    email varchar(100) not null unique,
    data_Adesao varchar(11) not null,
    tipo_Plano varchar(10) not null,
    logradouro varchar(100) not null,
    numero varchar (10),
    cep varchar(10) not null,
    cidade varchar(100) not null,
    estado varchar(2) not null,
    pais varchar(100) not null,

    primary key(id)
);