create database catalogoloja;
use catalogoloja;

create table endereco(
	cep			int primary key not null,
    rua			varchar(255),
    bairro		varchar(255),
    cidade		varchar(255),
    municipio	varchar(255),
    estado		varchar(255),
    uf			varchar(3)
);

create table pessoa(
	idpessoa		int not null primary key,
    nomepessoa		varchar(255),
    telefone		varchar(255),
    celular			varchar(255),
    enderecofk		int not null,
    foreign key (enderecofk) references endereco(cep)
    
);

create table pessoafisica(
	idpessoafisica	int not null,
    cpf				varchar(255),
    rg				varchar(255),
    foreign key (idpessoafisica) references pessoa(idpessoa)
);

create table pessoaJuridica(
	idpessoaJuridica int not null,
    cnpj			 varchar(255),
    ie				 varchar(255),
    foreign key (idpessoaJuridica) references pessoa(idpessoa)
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

insert into endereco values
(20040007,"Avenida Rio Branco","Centro","Rio de Janeiro","Rio de Janeiro","Rio de Janeiro","RJ"),
(26160265,"Estrada do Babi","Vila Sao Sebastiao","Belford Roxo","Belford Roxo","Rio de Janeiro","RJ");

insert into pessoa values
(10,"Jonas Goes","(021) 2262-5656","(021) 92970-7950",20040007);

insert into pessoafisica values 
(10,"511.544.487-07","53.457.288-9");

/* inner join Endereco on pessoa.enderecofk=Endereco.cep; */
select * from pessoafisica;

select pessoa.nomepessoa as Nome, pessoafisica.cpf 
as Identidade, endereco.rua as Endereco, endereco.numero 
as numero, endereco.cep as Cep from pessoafisica 
inner join pessoa on pessoa.idpessoa=pessoafisica.idpessoafisica
inner join pessoa on pessoa.enderecofk=endereco.cep;

select * from endereco;
select * from pessoa;
