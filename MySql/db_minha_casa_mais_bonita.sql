create database db_minha_casa_mais_bonita;
use db_minha_casa_mais_bonita;
CREATE TABLE tb_categoria (
	id INT NOT NULL AUTO_INCREMENT,
	sala varchar(255) NOT NULL,
	banheiro varchar(250) NOT NULL ,
	cozinha varchar(255) NOT NULL,
     	PRIMARY KEY (id)
);
use db_minha_casa_mais_bonita;
create table tb_produtos(
id int not null auto_increment,
nomeP varchar (255) not null,
marca varchar(255),
pronta_entrega BOOLEAN,
preço decimal,
qtdProduto int,
categoria_id int,
PRIMARY KEY (id)
);
use db_minha_casa_mais_bonita;
create table tb_usuarios(
id int not null auto_increment,
nomeU varchar (255) not null,
endereço varchar(255),
email varchar(255),
cpf varchar(255),
Serasa Boolean,
PRIMARY KEY (id)
);

insert into tb_categoria (sala, banheiro,cozinha) values ("Vaso", "Acento", "Banqueta"),("Almofada", "Toalha", "Mesa"),
("Cuba", "Pia", "Prato"),("Quadro", "Vaso Sanitário", "Garfo"),("Sofá", "Box", "Faca");
insert into tb_produtos(nomeP,marca,pronta_entrega,preço,qtdProduto,categoria_id)values("Manta","Arteb",true,70.00,1,1),
("Almofada","Arteb",true,35.00,1,1),("Banco","AX",true,100.00,1,3),("Banqueta","Artr",true,200.00,1,2),("Toalha","Arteb",true,189.00,1,2),
("Bowl","Iob",true,12.00,1,3),("Copo","Arcrib",true,50.00,1,3),("Cacto","Garden",true,800.00,1,3);
insert into tb_usuarios(nomeU,endereço,email,cpf,Serasa)values ("Giulliana M","R: Jurupis,80","giu@live.com", 33.4,true),
("Rafael R","R: Jurara ,100","rafinha@live.com",88.1,true),("Katia S","AV: Tiradentes,07","kktb@live.com",11.5,true),
("Gabriel M","R: Alves ,180","gabrielm@live.com",99.5,true),("Giullia M","R: Santos Dummont,78","giulliamoureira@live.com",97.5,true);
select* from tb_produtos WHERE preço> 50.00;
select* from tb_produtos WHERE preço > 03.00 and preço <60.00;
select*from tb_usuarios where nomeU like 'c%';
select*from tb_produtos where nomeP like 'b%';
select * from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id;

select avg (preço) FROM tb_produtos;
select sum(preço) from tb_produtos;

select count(id) from tb_produtos;
select * from tb_produtos where preço>=100.00;