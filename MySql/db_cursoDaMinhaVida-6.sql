create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table tb_categorias(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
duração int not null,
preço float not null,
modalidade varchar(255) not null,
material varchar(255) not null,
categorias_id bigint,
primary key(id),
FOREIGN KEY (categorias_id) REFERENCES  tb_categorias(id)
);
insert tb_categorias(descricao,ativo) values ("Profissionalizante",true),("Hobbies",true),("Línguas",true),("Outros",true);
select*from tb_categorias;
insert tb_produto(nome,duração,preço,modalidade,material,categorias_id) values ("Costura",10,100.00,"On-line","Máquina",1),
("Programador Java",50,1000.00,"Presencial","Notebook",1),("Violão",50,1000.00,"Presencial","Violão",2),("Inglês",45,200.00,"Presencial","Notebook",3),
("Alemão",45,200.00,"Presencial","Notebook",3),("Italiano",45,200.00,"Presencial","Notebook",3),("Java",45,1000.00,"Presencial","Notebook",1),
("JavaScript",45,200.00,"Presencial","Notebook",1);
select* from tb_produto WHERE preço> 50.00;
select* from tb_produto WHERE preço > 03.00 and preço <60.00;
select*from tb_produto where nome like 'j%';
select*from tb_produto
inner join tb_categorias on tb_categorias.id= tb_produto.categorias_id;
select*from tb_produto where modalidade like 'Presencial';
