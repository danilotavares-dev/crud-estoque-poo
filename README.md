# Sistema de Controle de Estoque (Prova A1)

Projeto acadêmico desenvolvido em Java com interface gráfica (Swing) para o gerenciamento de estoque, aplicando conceitos do padrão arquitetural **MVC** estruturado em **3 camadas**.

## Visão Geral

A aplicação permite o controle completo (CRUD) de itens em um estoque corporativo, registrando a quantidade e o valor total alocado. A interface visual foi desenhada para ser limpa e direta, garantindo que o foco permaneça nos dados, enquanto a persistência é gerenciada via banco de dados MySQL.

## Recursos Implementados

* **CRUD Completo:** Inserção, leitura, atualização e exclusão de registros de estoque.
* **Validação de Regras de Negócio:** Proteção contra entradas inválidas (como quantidades e valores negativos) isoladas na camada lógica.
* **Segurança de Credenciais:** Sistema de leitura de propriedades de banco de dados via arquivo `.properties`, garantindo que senhas não sejam enviadas ao controle de versão.

## Arquitetura do Sistema

O sistema foi desenhado separando responsabilidades visuais, lógicas e de dados, seguindo o padrão **MVC**:

* **`UI` (User Interface):** A *View*. Formulários Swing gerados pelo NetBeans responsáveis por capturar e exibir os dados do modelo para o usuário.
* **`BLL` (Business Logic Layer):** A camada inteligente do domínio. Centraliza as regras de negócio, atuando no controle e validação dos dados antes da persistência.
* **`DAL` (Data Access Layer):** Gerencia a conexão com o banco de dados (`ConexaoMySQL`) e executa as instruções SQL (`EstoqueDAL`).
* **`DTO` (Data Transfer Object):** Classes puras de trânsito (ex: `EstoqueDTO`) que mapeiam as entidades do banco para o ambiente orientado a objetos.

## Requisitos e Dependências

* Java 8 ou superior
* Banco de Dados MySQL (Local ou Remoto)
* Driver **MySQL Connector/J** (JDBC)
* Apache NetBeans IDE (Recomendado) ou Apache Ant

## Configuração do Ambiente

### 1. Banco de Dados
Execute o script SQL abaixo no seu SGBD para preparar a base e criar a tabela necessária:

```sql
CREATE DATABASE provaA1;
USE provaA1;

CREATE TABLE Estoque (
    estID INT AUTO_INCREMENT PRIMARY KEY,
    estQtd INT NOT NULL,
    estValorTotal DOUBLE NOT NULL
);
```

### 2. Configuração de Conexão
As credenciais do banco não são versionadas por segurança. Siga os passos abaixo:

#### 1. Na raiz do projeto, copie o arquivo modelo config.example.properties e renomeie a cópia para config.properties.

#### 2. Abra o config.properties e insira a senha do seu banco de dados local:

```Properties
DB_URL=jdbc:mysql://localhost:3306/provaA1?useSSL=false&serverTimezone=UTC
DB_USER=root
DB_PASS=SUA_SENHA_AQUI
```

### Como Executar
Via NetBeans IDE

1. Abra o projeto provaA1_Estoque.
2. Certifique-se de que o arquivo config.properties está solto na raiz do projeto (no mesmo nível do arquivo build.xml).
3. Adicione o .jar do MySQL Connector na pasta Libraries (Bibliotecas) da IDE.
4. Execute o projeto (atalho Shift + F6 no FormPrincipal.java).

### Via Terminal (Ant)

```Bach
cd provaA1_Estoque
ant
```

Após o build ser finalizado com sucesso, inicie o arquivo executável gerado na pasta dist:

```Bach
java -jar dist/provaA1_Estoque.jar
```

Autor: Danilo Tavares Lima