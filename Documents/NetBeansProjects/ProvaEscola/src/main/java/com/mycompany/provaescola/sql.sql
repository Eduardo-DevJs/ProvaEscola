CREATE DATABASE bd_escola
USE bd_escola

CREATE TABLE usuarios (
    id_user INT PRIMARY KEY AUTO_INCREMENT,
    usuario varchar(50) not null,
    senha varchar(50) not null,
    perfil varchar(50) not null
);

INSERT INTO usuarios (usuario, senha, perfil) VALUES ("admin","admin", "administrador");



CREATE TABLE alunos (
   id_aluno INT PRIMARY KEY AUTO_INCREMENT,
   nome VARCHAR(255) NOT NULL,
   idade INT NOT NULL,
   matricula VARCHAR(50) NOT NULL,
   telefone VARCHAR(20) NOT NULL,
   turma VARCHAR(50) NOT NULL  
);

CREATE TABLE professores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    disciplina VARCHAR(255) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL
);
