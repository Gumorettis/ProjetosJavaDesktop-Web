CREATE TABLE cliente
(
  id_cliente serial NOT NULL pk,
  nome_cliente character varying(20),
  cpf_cliente integer,
  idade_cliente integer,
  endereco_cliente character varying(20)
)

CREATE TABLE vendedor
(
  id_vendedor serial NOT NULL,
  nome_vendedor character varying(20),
  rg_vendedor varchar(20) not null,
  empresa character varying(20),
  horas_trabalhadas integer
)