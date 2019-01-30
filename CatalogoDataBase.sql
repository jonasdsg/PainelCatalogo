create database catalogoloja;
use catalogoloja;

create table endereco(
	cep			int primary key not null,
    rua			varchar(255),
    numero		smallint,
    bairro		varchar(255),
    cidade		varchar(255),
    municipio	varchar(255),
    estado		varchar(255),
    uf			varchar(3)
);
create table Pessoa(
	idPessoa		int not null primary key,
    telefone		varchar(255),
    celular			varchar(255),
    enderecofk		int not null,
    foreign key (enderecofk) references endereco(cep)
    
);

create table PessoaFisica(
	idPessoaFisica	int not null,
    cpf				varchar(255),
    rg				varchar(255),
    foreign key (idPessoaFisica) references Pessoa(idPessoa)
);

create table PessoaJuridica(
	idPessoaJuridica int not null,
    cnpj			 varchar(255),
    ie				 varchar(255),
    foreign key (idPessoaJuridica) references Pessoa(idPessoa)
);

create table Dispositivos(
	chaveDispositivo		int primary key not null,
	tipodeDispositivo		varchar(255),
    numerodeSerie		varchar(255),
    modelodoDispositivo		varchar(255),
    descricaodoDispositivo		varchar(255),
    estadodoDispositivo		varchar(255),
    localArmazenado		varchar(255)
);