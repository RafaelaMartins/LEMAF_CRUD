# LEMAF_CRUD
CRUD proposto pela empresa LEMAF, realizado na linguagem Java. O CRUD conta com:
   - Cadastro de Usuários ***(Interface e Método)***
   - Cadastro de Cargoss ***(Interface e Método)***
   - Lista de Usuários ***(Interface e Método)***
   - Lista de Cargos ***(Interface e Método)***
   - Edição de Usúarios ***(Interface e Método)***
   - Edição de Cargos ***(Interface e Método)***
   - Exclusão de Usuários ***(Método)***
   - Exclusão de Cargos ***(Método)***

# FERRAMENTAS & MÉTODOS
Este trabalho foi desenvolvido utilizando a linguagem de programação Java.
A conexão com o banco de dados foi feita utilizando um componente chamado
JDBC + MySQL. Na parte gráfica utilizou-se o JFrame. Os métodos implementados
são os métodos básicos de um CRUD (C-CREATE,R-READ,U-UPDATE,D-DELETE).
    - Netbens 8.1
    - MySQL Connector Java 5.1.38
    - Mysql  Ver 14.14 Distrib 5.7.27
    - Openjdk version "1.8.0_242"
    - OpenJDK Runtime Environment (build 1.8.0_242-8u242-b08-0ubuntu3~16.04-b08)
    - OpenJDK 64-Bit Server VM (build 25.242-b08, mixed mode)


![Netbens](netbens.png)

A versão MySQL do conector Java:
![MySQL Conector Java](drive.png)

A versão do MySQL Server:
![MySQL Server](mysql.png)

***A criação do Database é manual ou seja o seguinte comando deve ser executado
manualmente. As demais funcionalidades são automaticas do CRUD.***
Segue o comando de Scherma.

![Criando o nome do Database](database.png)

o nome do Database PRECISA ser ***cargosUsers***.

O "user" e password adicionado para a conexão do MySQL é a padrão ***(root,root)***. 
A porta de configuração do MySQL é a porta ***3306***, assim como o nome do database
***TEM*** que ser ***cargosUsers***.
Segue a foto da aba "Services" do Netbens após a instalação dos componentes
do MySQL Server, JDBC(MySQL Connector Java), Configuração do database e 
criação do Schema(Database).

![Aba de Service](service.png)

# CONFIGURAÇÃO DO WORKSPACE

A configuração dos componentes devem ser a seguinte:
    *Porta de acesso do Banco de dados.***Port:'3306'***
    *Usuário e senha de acesso ao Banco de Dados.***User:'root', Passw:'root'***
    *Criação do database(Schemas) com o nome ***'cargosUsers'***
    *Configuração de diretório do MySQL = ***'LocalHost'***
Feito as configurações e instalações adequadas dos componentes o programa executará normalmente.
![Após configurar o banco irá conectar ao executar o projeto](conect.png)

# DECISÕES DE IMPLENTAÇÃO + BANCO DE DADOS
O banco de dados possui a seguinte arquitetura.
    *Duas tabelas ***(CARGOS & USUARIOS)***
    *Decidiu-se incluir 2 campos 'UID' em 'USUARIOS'e 'CID' em 'Cargos', sendo esses 2 chaves 
*primária de suas respectivas tabelas.
    *'CID' é chave primária da tabela Cargo é ***Chave Extrangeira*** _da tabela 'Usuários'_.  
    *As tabelas possuem o método ***ON CASCATE*** para evitar a existencia de registros 
 inconsistente.
 

***Decidiu-se incluir UID e CID como chaves primárias porque é usual que exista chaves primárias
do tipo Inteiro para controlar as operações dos registros.***   

![Código de criação da tabela Cargos](cargos.png)

![Código de criação da tabela Usuário](users.png)

# TESTES

Cadastrar Cargos:
![Cadastro de Cargos](cargo_1.png)

Confirmação do Cadastro de Cargos:
![Código de criação da tabela Cargos](cargo_confirma.png)

View dos Cargos Cadastrados:
![Lista de Cargos Cadastrados](cargo_view.png)

Edição de Cargos:
![Código de criação da tabela Cargos](cargos_edit.png)

Modicação do Cargo:
![Código de criação da tabela Cargos](cargo_edit2.png)

Confirmação da edição do Cargo:
![Código de criação da tabela Cargos](cargo_edit3.png)

Resultado da edição do Cargo concluída:
![Código de criação da tabela Cargos](cargo_edit4.png)

Exclusão de Cargos:
![Código de criação da tabela Cargos](cargo_delete.png)

Exclusão de Cargos confirmada:
![Código de criação da tabela Cargos](cargo_delete2.png)

Resultado da Exclusão do Cargo:
![Código de criação da tabela Cargos](cargo_delete3.png)

Cadastro de Usuários:
![Código de criação da tabela Cargos](usuario_1.png)

Cadastro de Usuário Validação de CPF:
![Código de criação da tabela Cargos](usuario_cpf.png)

Cadastro de Usuário Confirmação:
![Código de criação da tabela Cargos](usuario_confirma.png)

View com lista de Usuários Cadastrados:
![Código de criação da tabela Cargos](usuario_view.png)

Edição de Usuarios:
![Código de criação da tabela Cargos](usuario_edit.png)

Edição de Usuarios Confirmada:
![Código de criação da tabela Cargos](usuario_edit2.png)

Resultado da edição de Usuários:
![Código de criação da tabela Cargos](usuario_edit3.png)

Exclusão de Usuários:
![Código de criação da tabela Cargos](usuario_delete.png)

Resultado da Exclusão do Usuário:
![Código de criação da tabela Cargos](usuario_delete2.png)



##ATENÇÃO: É IMPORTANTE QUE UTILIZE OS BOTÕES *SAIR* NAS JANELAS DO PROJETO POIS ELA FINALIZA
##ADEQUADAMENTE AS FUNCIONALIDADES. O BOTÃO X QUE EXISTE NO CANTO SUPERIOR DAS JANELAS NÃO
##REALIZA A FUNÇÃO COM SEGURANÇA MAS PARA A EXECUÇÃO GERAL DO PROJETO.








