create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categorias(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_produto(
id bigint auto_increment,
xarope varchar(255) not null,
comprimido varchar(255) not null,
solução varchar(255) not null,
preço float not null,
alimentos varchar(255) not null,
higiene varchar(255) not null,
categorias_id bigint,
primary key(id),
FOREIGN KEY (categorias_id) REFERENCES  tb_categorias(id)
);
insert tb_categorias(descricao,ativo) values ("Medicamentos",true),("Cosmeticos",true),("Alimentação",true),("Outros",true);
select*from tb_categorias;
insert tb_produto(xarope,comprimido,solução,preço,alimentos,higiene,categorias_id)value ("Melagrião","não","não",34.00,"não","não",1), ("não","Amoxilina","não","50.00","não","não",1),
("não","não","Base","88.00","não","não",2),("não","não","Kell","25.00","não","sim",1),("não","não","não","14.50","Chocolate","não",3),("não","não","não","14.50","Barra de cereal","não",3),
("não","não","não","10.50","não","Shampoo",1),("não","Benegripe","não","08.30","não","não",1);
select*from tb_produto;
select* from tb_produto WHERE preço> 50.00;
select* from tb_produto WHERE preço = 03.00 or 60.00;
select*from tb_produto where xarope like 'b%';
select*from tb_produto where comprimido like 'b%';
select*from tb_produto
inner join tb_categorias on tb_categorias.id= tb_produto.categorias_id;
select*from tb_produto where preço >=25.00;



