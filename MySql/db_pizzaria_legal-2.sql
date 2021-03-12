create database db_pizzaria_legal;
use db_pizzaria_legal;
create table tb_categoria(
id bigint auto_increment,
tamnho varchar(255) not null,
primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
sabor varchar(255) not null,
doce varchar(255) not null,
salgada varchar(255) not null,
preço float not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES  tb_categoria(id)
);

insert tb_categoria(tamnho) value ("média"),("Grande"),("Broto"),("média"),("Grande"),("Broto"),("média"),("Broto");
select*from tb_categoria;
insert tb_pizza(sabor,doce,salgada,preço,categoria_id)value("Mussarela","Não","Salgada","35.50",2),("Calabresa","Não","Salgada","35.50",2),
("Catupiry","Não","Salgada","38.50",1),("Marguerita","Não","Salgada","40.00",2),("Mussarela com Bacon","Não","Salgada","30.70",1),
("Banana","Doce","Não","25.00",3),("Chocolate","Doce","Não","25.00",3),("Marshmellow","Doce","Não","30.00",1);
select*from tb_pizza;
select* from tb_pizza WHERE preço>= 45.00;
select* from tb_pizza WHERE preço = (29.00 or 60.00);
select* from tb_pizza WHERE preço = (29.00 and 60.00);
select*from tb_pizza where preço >29 and preço <60;
SELECT* FROM tb_pizza  WHERE sabor LIKE 'c%' ;
select*from tb_pizza
inner join tb_categoria on tb_categoria.id= tb_pizza.categoria_id;
select*from tb_pizza where sabor like 'm%';



