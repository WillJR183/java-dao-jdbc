# :clipboard: Projeto JDBC com Padrão DAO

O objetivo deste projeto é implementar uma aplicação Java com a API JDBC, construindo a estrutura básica e utilizando os principais recursos disponibilizados pela API.
Além disso, aplicar manualmente o padrão de projetos DAO. O Java Database Connectivity (JDBC), é a API padrão do Java para acesso a dados. Enquanto o padrão Data Access
Object (DAO), é um padrão de projetos caracterizado pela presença de objetos, responsáveis por fazer o acesso aos dados para cada entidade de negócio. Cada DAO é definida
como uma interface, dessa forma caso a tecnologia para acesso a dados mude, o contrato dos objetos será preservado. E para finalizar, a injeção de dependência é feita por meio do padrão de projetos Factory, que basicamente é responsável por instanciar as implementações do DAO.

## :bookmark_tabs: Requisitos

Para executar a aplicação é necessário:

* Possuir uma distribuição Java ```JDK``` ou ```JRE``` instalado na sua máquina.
  * Exemplo de distribuições: [Amazon Corretto](https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc) / [Azul Zulu](https://www.azul.com/downloads/?package=jdk#download-openjdk).

* Possuir o MySQL Server e Workbench instalado e configurado.
  * [MySQL Community](https://dev.mysql.com/downloads/mysql/)

## :mag: Tópicos abordados

* JDBC
  * ``Statement``
    * ``Statement.RETURN_GENERATED_KEYS``
  * ``ResultSet``
    * ``first()``
    * ``beforeFirst()``
    * ``next()``
    * ``absolute(int)``
  * ``PrepareStatement``
    * ``executeUpdate()``
    * ``getGeneratedKeys()``
  * ``Transactions``
    * ``setAutoCommit(false)``
    * ``commit()``
    * ``rollback()`` 
* Banco de Dados Relacional
* Álgebra Relacional e SQL
* MySQL
* Padrão de Projetos DAO
* Padrão de Projetos Factory
* Exceções Personalizadas

## :paperclip: Referências

* [Udemy - Java Completo com Prof. Nélio Alves](https://www.udemy.com/course/java-curso-completo/)  
* [Java JDBC API](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)
* [Pacote java.sql](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)
* [Transactions](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)
* [Data Access Object](https://www.oracle.com/java/technologies/dataaccessobject.html)
