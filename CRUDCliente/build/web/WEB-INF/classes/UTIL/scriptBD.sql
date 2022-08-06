create table Cliente(
id_cliente serial not null,
nome_cliente varchar(20) not null,
telefone_cliente integer,
cpf_cliente varchar(20)
);

create table venda(
idVenda serial, 
tipoVenda varchar(20) not null,
valorVenda integer not null,
descricaoVenda varchar(20) 
);

create table pessoa(
id_pessoa serial primary key,
cpf_pessoa varchar(14),
nome_pessoa varchar(60),
email_pessoa varchar(60),
telefone_pessoa varchar(20),
login_pessoa varchar(15),
senha_pessoa varchar(60),
tipo_pessoa varchar(1)
);

create table responsavel (
id_responsavel integer not null primary key,
nick_responsavel varchar(20),
constraint fkpessoar foreign key (id_responsavel) references pessoa
);

create table ocorrencia(
idOcorrencia serial not null primary key,
descricaoOcorrencia varchar(30),
idResp integer,
constraint fkOcorrencia foreign key (idResp) references responsavel (id_responsavel)
);

create table funcionario (
id_funcionario integer not null primary key,
constraint fkpessoaf foreign key (id_funcionario) references pessoa
);


//herança do projeto está entre Funcionario e Responsavel (que são filhos de Pessoa)