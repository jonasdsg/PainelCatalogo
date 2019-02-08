create database catalogoloja;
use catalogoloja;

create table endereco(
	cep			int primary key not null,
    rua			varchar(255),
    bairro		varchar(255),
    cidade		varchar(255),
    estado		varchar(255),
    uf			varchar(3)
);

create table pessoa(
	id_pessoa		int not null primary key,
    nome_pessoa		varchar(255),
    telefone		varchar(255),
    celular			varchar(255),
    numero_casa		int
);

create table pessoafisica(
	id_pf			int not null,
    cpf				varchar(255),
    rg				varchar(255),
    cep_endereco	int not null,
	foreign key (id_pf) references pessoa(id_pessoa),
    foreign key (cep_endereco) references endereco(cep)
    
);

create table pessoajuridica(
	id_pj			 int not null,
    cnpj			 varchar(255),
    ie				 varchar(255),
    cep_endereco	int not null,
    foreign key (cep_endereco) references endereco(cep),
    foreign key (id_pj) references pessoa(id_pessoa)
);

create table dispositivos(
	chave_dispositivo			int primary key not null,
	tipo_dispositivo			varchar(255),
    serie_dispositivo			varchar(255),
    modelo_dispositivo			varchar(255),
    descricao_dispositivo		varchar(255),
    estado_dispositivo			varchar(255),
    local_armazenado			varchar(255)
);

select * from endereco;
select * from pessoa;
select * from pessoafisica;

update pessoa set id_pessoa=id_pessoa+8;