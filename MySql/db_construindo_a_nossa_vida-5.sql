create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_produto(
id bigint auto_increment,
cimento varchar(255) not null,
tijolo varchar(255) not null,
azulejo varchar(255) not null,
preço float not null,
cau varchar(255) not null,
cândida varchar(255) not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES  tb_categoria(id)
);
insert tb_categoria(descricao,ativo) values ("Construção",true),("Limpeza",true),("Outros",true);
select*from tb_categoria;
insert tb_produto(cimento,tijolo,azulejo,preço,cau,cândida,categoria_id)values("Sim","Não","Não",27.00,"Não","Nâo",1),
("Não","Sim","Não",07.00,"Não","Nâo",1),("Sim","Não","Não",27.00,"Não","Nâo",1),("Não","Não","Sim",50.00,"Não","Nâo",1),
("Não","Não","Não",10.00,"Sim","Nâo",1),("Não","Não","Não",12.00,"Não","Sim",2),("Não","Não","Não",12.00,"Não","Sim",2),
("Não","Não","Não",12.00,"Não","Sim",2);
select* from tb_produto WHERE preço> 50.00;
select* from tb_produto WHERE preço = 03.00 or 60.00;
select*from tb_produto where id like 'c%';
select*from tb_produto
inner join tb_categoria on tb_categoria.id= tb_produto.categoria_id;
select*from tb_produto where preço >=25.00;