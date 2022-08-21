#2
create database dev_ti_2022;

#3
use dev_ti_2022;

#5
create table if not exists pessoa (
	id_pessoa int auto_increment primary key,
	nome varchar(50) not null,
	endereco varchar(70) not null, 
	estado char(2) not null default'SC',
	data_nascimento date not null default(date_format(now(), '%y-%m-%d')),
	sexo enum('m','f','n') not null default 'n',
	salario decimal(10, 2) not null check (salario >=0) default 1000.00
) engine = InnoDB;

#6
describe pessoa;

#7
INSERT INTO pessoa VALUES(null, 'André', 'Av.X, 10', 'RJ', '1980-01-01', 'm', 1000.00);
INSERT INTO pessoa VALUES(null, 'Maria', 'Av.X, 50', 'RJ', '1970-10-31', 'f', 3000.00);
INSERT INTO pessoa VALUES(null, 'Luis', 'Rua Y, 25', 'PR', '1990-05-15', 'm', 1000.00);
INSERT INTO pessoa VALUES(null, 'Ana', 'Rua Y, .50', 'PR', '2000-02-28', 'f', 4300.00);
INSERT INTO pessoa VALUES(null, 'Augusto', 'Av.Z, 80', 'SC', '1995-08-17', 'm', 8600.00);
INSERT INTO pessoa VALUES(null, 'Ricardo', 'Av.X, 50', 'PR', '2005-07-16', 'm', 1500.00);
INSERT INTO pessoa VALUES(null, 'Thais', 'Rua Z, 20', 'SP', '1960-06-06', 'f', 10000.00);
INSERT INTO pessoa VALUES(null, 'Pedro', 'Rua Z, 100', 'SP', '1980-09-05', 'm', 8900.00);
INSERT INTO pessoa VALUES(null, 'Flavia', 'Av.Z, 40', 'SC', '1980-01-01', 'f', 2300.00);
INSERT INTO pessoa VALUES(null, 'Patricia', 'Alameda W, 42', 'SP', '1985-11-23', 'f', 15000.00);

#8
update pessoa set data_nascimento = '1998-09-07' where id_pessoa = '4';

#9
update pessoa set salario = '9000.00' where id_pessoa = '8';
update pessoa set salario = '8500.00' where id_pessoa = '5'; 

INSERT INTO pessoa VALUES(null, 'Fulano', 'Rua F', '2000-01-01', 'p', 1000.00);
INSERT INTO pessoa VALUES(null, 'Fulano', 'Rua F', '2000-01-01', 'm', -1000.00);

#12 a
select *from pessoa;

#12 b
select nome, salario from pessoa;

#12 c
select nome from pessoa order by nome asc;

#12 d
select nome, data_nascimento, salario from pessoa order by data_nascimento desc;

#12 e
select *from pessoa where sexo ='f';

#12 f
select sexo, avg(salario) as 'media salarial'
from pessoa 
group by sexo
having avg(salario);

#12 g
select sexo, concat('R$ ',round(avg(salario),2)) as 'media salarial'
from pessoa 
group by sexo
having avg(salario);

#12 h
select sexo, concat('R$ ',(format(avg(salario), 2, 'de_DE'))) as 'media salarial'
from pessoa 
group by sexo
having avg(salario);

#12 i
select sexo, concat('R$ ',lpad(format(avg(salario), 2, 'de_DE'),20,' ')) as 'media salarial'
from pessoa 
group by sexo
having avg(salario);

#12 j
select rpad(lpad(sexo, 4,''),7,'') As 'sexo',concat('R$ ',lpad(format(avg(salario), 2, 'de_DE'),20,' ')) as 'media salarial'
from pessoa 
group by sexo
having avg(salario);

#12 k 
select sexo,concat('R$ ', format(avg(salario), 2, 'de_DE')) as 'media salarial' 
from pessoa group by sexo having avg(salario)>=5000;

#12 i
select max(salario)as 'Maior salário',min(salario)as 'menor salário' 
from pessoa order by salario;

#12 m
select estado,concat('R$ ', format(avg(salario), 2, 'de_DE')) as 'media salarial'
 from pessoa group by estado order by avg(salario)desc;

#12 n
select estado,concat('R$ ', format(avg(salario), 2, 'de_DE')) as 'media salarial'
 from pessoa 
 where salario >= 5000
 group by estado order by avg(salario)desc;
 
 #12 o 
 select nome,  estado from pessoa where  estado= 'SC';
 
 #12 p
 select nome, data_nascimento from pessoa where year(data_nascimento) <= 1980;
 
 #12 q
  select nome, data_nascimento, estado from pessoa where year(data_nascimento) <= 1980 and estado='SP';
  
#12 r
INSERT INTO pessoa (nome, endereco)
VALUES('Fulano', 'Rua dos Fulanos');
 
#12 r b
select nome, data_nascimento, estado, sexo, salario from pessoa where nome ='Fulano';

select *from pessoa;

#12 s
delete from pessoa where id_pessoa = 11;

#12 t
select nome, endereco from pessoa where endereco like'Rua%';

#12 u
select nome, endereco from pessoa where endereco not like 'Alameda%';

#12 v
select  nome, date_format(data_nascimento, '%d de %M de %Y') as 'Nascimento' from pessoa where data_nascimento between '1985-11-01' and '2000-04-15';

#12 w
set lc_time_names ='pt_BR';
select  nome, date_format(data_nascimento, '%d de %M de %Y') as 'Nascimento' from pessoa where data_nascimento between '1985-11-01' and '2000-04-15';

#12 x 
select  count(nome), date_format(data_nascimento, '%d de %M de %Y') as 'Nascimento' from pessoa where data_nascimento between '1985-11-01' and '2000-04-15';

#12 y
select nome, salario from pessoa where nome not like 'André' and salario != 1000.00;

#12 z
select nome, salario from pessoa where nome != 'André' or salario != 1000.00;

#13 
truncate pessoa;

#15
drop database dev_ti_2022
