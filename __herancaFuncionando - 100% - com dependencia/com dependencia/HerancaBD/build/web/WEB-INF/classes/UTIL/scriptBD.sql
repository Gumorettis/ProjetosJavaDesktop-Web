/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  gusta
 * Created: 07/03/2021
 */

//nome do banco: bancoHeranca

create table pessoa(
idPessoa serial primary key,
nomePessoa varchar(20),
endereco varchar(15),
telefone integer,
tipo_pessoa varchar(2),
login_pessoa varchar(30),
senha_pessoa varchar(30)
);

create table pessoaFisica(
idPessoaFisica integer not null primary key,
cpf varchar(15),
idade integer,
constraint fkpessoaFisica foreign key(idPessoaFisica) references pessoa
);

create table pessoaJuridica(
idPessoaJuridica integer not null primary key,
cnpj varchar(15),
capital integer,
constraint fkpessoaJuridica foreign key(idPessoaJuridica) references pessoa
);

create table publicacao(
idpublicacao serial not null primary key, 
idpublicador integer,
descricao varchar(30),
constraint fkpublicacao foreign key (idpublicador) references pessoaFisica (idPessoaFisica)
)