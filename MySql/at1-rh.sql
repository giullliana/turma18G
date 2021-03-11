create database db_giuecoRH;

USE db_giuecoRH;
create table tb_funcionariosRH(
id bigint auto_increment,
nome varchar(200) not null,
idade int not null,
salario float not null,
primary key(id)
);

insert into tb_funcionariosRH (nome,idade,salario) values ("Vanessa",19,10000);
insert into tb_funcionariosRH (nome,idade,salario) values ("Sheila",29,12000);
insert into tb_funcionariosRH (nome,idade,salario) values ("Otavio",25,5000);
insert into tb_funcionariosRH (nome,idade,salario) values ("Bruno",31,10300);
insert into tb_funcionariosRH (nome,idade,salario) values ("Pedro",33,1000);

select *from tb_funcionariosrh;

select*from tb_funcionariosrh where salario < 2000.00;
select*from tb_funcionariosrh where salario> 2000.00;
update tb_funcionariosrh set nome ="Paulo" where id = 8;
select* from tb_funcionariosrh;

