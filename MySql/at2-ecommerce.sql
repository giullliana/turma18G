create database db_ecommerce ;

create table tb_produtos(
id bigint auto_increment,
nome varchar(200) not null UNIQUE,
tamanho varchar(200) not null,
preço float not null,
primary key(id));

insert into tb_produtos (nome,tamanho,preço) values ("Notebook","Médio",8000.00);
insert into tb_produtos (nome,tamanho,preço) values ("Macbook","Médio",18000.00);
insert into tb_produtos (nome,tamanho,preço) values ("Ipad","Pequeno",1000);
insert into tb_produtos (nome,tamanho,preço) values ("Fone","Médio",650);
insert into tb_produtos (nome,tamanho,preço) values ("Mouse","Pequeno",100);
insert into tb_produtos (nome,tamanho,preço) values ("Teclado","Médio",89);
insert into tb_produtos (nome,tamanho,preço) values ("Cabo HDMI","Grande",75);
insert into tb_produtos (nome,tamanho,preço) values ("Caixa de Som","Grande",899);

select*from tb_produtos;
select*from tb_produtos where preço> 500.00;
select*from tb_produtos where preço< 500.00;
update tb_produtos set nome ="Cabo USB" where id = 7;

select*from tb_produtos;



