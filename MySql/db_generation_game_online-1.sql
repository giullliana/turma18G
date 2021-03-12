create database db_generation_game_online;
use db_generation_game_online;
create table tb_classe(
id bigint auto_increment,
categoria varchar(255) not null,
superpoder boolean not null,
primary key(id)
);
create table tb_personagem(
id bigint auto_increment,
nome varchar(255) not null,
ataque varchar(255) not null,
defesa varchar(255) not null,
superpoderes varchar(255) not null,
armas varchar(255) not null,
classe_id bigint,
primary key(id),
FOREIGN KEY (classe_id) REFERENCES  tb_classe(id)
);
insert tb_classe(categoria,superpoder) values ("Arqueiro",True),("Gladiador",True),("Mago",True),
("Feiticeira",True),("Amazona",True);
select*from tb_classe;
insert tb_personagem(nome,ataque,defesa,superpoderes,armas,classe_id) values 
("Aruana","soco","mortal pra trás","humana","corda",5),("Galvin","chute","escudo","humano","soco ingles",2),
("Gavião","bicada","voô rasante","meio humano meio gavião","garras de metal",1),("Merida","KaratÊ","mortal pra frente","humana","Arco e Flecha",1),
("Melvin","Boxe","pulo com chute","super força","Arco e flecha",1),("Wanda","Telepatia","ilusão","Bruxa","Raio nas mãos",4),
("Magneto","controle do ferro","armadura de ferro","Controla o ferro","espada",3),("Maguk","Movimentar a agua","sumir","poder sobre as aguas","Movimentar a agua ",3);
select*from tb_personagem;
DELETE from tb_personagem WHERE id=2;
select*from tb_personagem;
SELECT * FROM tb_personagem WHERE armas IN("Arco e Flecha");
SELECT * FROM tb_personagem WHERE superpoderes IN("humano");
SELECT* FROM tb_personagem  WHERE nome LIKE 'c%' ;
select*from tb_personagem
inner join tb_classe on tb_classe.id= tb_personagem.classe_id;
select*from tb_classe where categoria like 'Mago%';
