create database db_alunos;

create table tb_alunos(
id bigint auto_increment,
nome varchar(200) not null,
idade int not null,
mediaTotal float not null,
primary key(id)
);
insert into tb_alunos(nome,idade,mediaTotal) values ("Otávio",08,7.5);
insert into tb_alunos(nome,idade,mediaTotal) values ("Ariane",08,8.5);
insert into tb_alunos(nome,idade,mediaTotal) values ("Sheila",08,6.5);
insert into tb_alunos(nome,idade,mediaTotal) values ("Hermes",08,7.5);
insert into tb_alunos(nome,idade,mediaTotal) values ("Oliver",08,5.0);
insert into tb_alunos(nome,idade,mediaTotal) values ("Teresa",08,10.0);
insert into tb_alunos(nome,idade,mediaTotal) values ("Edite",08,3.5);
insert into tb_alunos(nome,idade,mediaTotal) values ("Ana",08,7.0);

select*from tb_alunos where mediaTotal >= 7.0;
select*from tb_alunos where mediaTotal < 7.0;

update tb_alunos set mediaTotal =7.0 where mediaTotal=6.5;