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
    nomePessoa		varchar(255),
    telefone		varchar(255),
    celular			varchar(255),
    enderecofk		int not null,
    foreign key (enderecofk) references endereco(cep)
    
);

create table PessoaFisica(
	idPessoaFisica	int not null,
    cpf				varchar(255),
    rg				varchar(255),
    enderecoCli		int not null,    
    foreign key (enderecoCli) references endereco(cep),
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

insert into endereco values
(20040007,"Avenida Rio Branco",185,"Centro","Rio de Janeiro","Rio de Janeiro","Rio de Janeiro","RJ"),
(26160265,"Estrada do Babi",77,"Vila Sao Sebastiao","Belford Roxo","Belford Roxo","Rio de Janeiro","RJ");

insert into Pessoa values
(1,"Jonas Goes","(021) 2262-5656","(021) 92970-7950",20040007);

insert into PessoaFisica values 
(1,"511.544.487-07","53.457.288-9",20040007);

/* inner join Endereco on Pessoa.enderecofk=Endereco.cep; */
select * from PessoaFisica;
select Pessoa.nomePessoa as Nome, PessoaFisica.cpf as Identidade, endereco.rua as Endereco, endereco.numero as numero, endereco.cep as Cep from PessoaFisica 
inner join Pessoa on Pessoa.idPessoa=PessoaFisica.idPessoaFisica
inner join endereco on PessoaFisica.enderecoCli=endereco.cep;
