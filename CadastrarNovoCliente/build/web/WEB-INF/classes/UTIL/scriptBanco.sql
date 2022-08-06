create table Cliente(
idCliente serial not null,
nomeCliente varchar(20),
rgCliente varchar(15),
idade integer,
telefone varchar(15)
);

create table Produto(
idProduto serial not null,
nomeProduto varchar(20),
valor integer,
tipoProduto varchar(15)
)
