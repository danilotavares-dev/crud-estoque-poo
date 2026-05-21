
# Prova A1 - Sistema de Estoque

Projeto de exemplo em Java (Swing) para gerenciamento simples de estoque, desenvolvido como trabalho da disciplina.

## Descrição

Aplicação desktop em Java que permite inserir, editar, listar e excluir registros de estoque (quantidade e valor total). A interface foi criada com Swing (NetBeans GUI Builder) e a persistência utiliza MySQL via JDBC.

## Estrutura do repositório

- `provaA1_Estoque/` - projeto NetBeans/Ant contendo o código-fonte, recursos e script de build.
	- `src/provaa1_estoque/` - código-fonte Java (UI, BLL, DAL, DTO).

## Requisitos

- Java 8 ou superior
- MySQL (servidor local ou remoto)
- MySQL Connector/J (JDBC driver) adicionado às bibliotecas do projeto
- NetBeans (recomendado) ou Ant (opcional)

## Configuração do banco de dados

1. Crie a base de dados e a tabela executando os comandos SQL abaixo no MySQL:

```
CREATE DATABASE provaA1;
USE provaA1;

CREATE TABLE Estoque (
	estID INT AUTO_INCREMENT PRIMARY KEY,
	estQtd INT NOT NULL,
	estValorTotal DOUBLE NOT NULL
);
```

2. Atualize as credenciais de conexão se necessário editando o arquivo [provaA1_Estoque/src/provaa1_estoque/DAL/ConexaoMySQL.java](provaA1_Estoque/src/provaa1_estoque/DAL/ConexaoMySQL.java).

Observação: o projeto atualmente usa as credenciais e URL definidas em `ConexaoMySQL.java`.

## Como executar

- Abrir o projeto `provaA1_Estoque` no NetBeans e executar (Run).
- Ou usar Ant (na raiz do projeto):

```
cd provaA1_Estoque
ant
```

Após build, procure o JAR gerado em `provaA1_Estoque/dist/` e execute com:

```
java -jar provaA1_Estoque/dist/<nome-do-jar>.jar
```

## Observações e próximas etapas

- Certifique-se de adicionar o driver MySQL (Connector/J) às bibliotecas do projeto.
- Substitua credenciais sensíveis por variáveis de ambiente ou um arquivo de configuração antes de publicar em repositório público.
- Posso criar um `.gitignore` mais específico, preparar um script de criação do banco ou fazer o commit/push para você — quer que eu faça isso?

