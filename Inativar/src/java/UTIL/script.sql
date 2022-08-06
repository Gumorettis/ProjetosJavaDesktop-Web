/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  gusta
 * Created: 05/06/2021
 */

//nome do banco: inativar

create table pessoa(
idPessoa serial primary key,
nomePessoa varchar(20),
endereco varchar(15),
telefone integer,
tipo_pessoa varchar(2),
status_pessoa varchar(15),
login_pessoa varchar(30),
senha_pessoa varchar(30)
);

create table funcionario(
idPessoaFuncionario integer not null primary key,
cpf varchar(15),
idade integer,
constraint fkfuncionario foreign key(idPessoaFuncionario) references pessoa
);

create table administrador(
idPessoaAdm integer not null primary key,
nivelCredencial varchar(12),
constraint fkpessoaAdm foreign key(idPessoaAdm) references pessoa
);