# testag12sb2

Video explicativo do desafio e não listado para visualização youtube
link direto:

Clonar:
    
   $ git clone https://github.com/tiagosuleiman/testag12sb2.git
   
Diretorios:
suleiman@tiago:~/dev/code/java/testag12sb2$ ls -a
   
       :: files
       :: .git 
       :: .gitignore
       :: README.md
       :: backend
       :: frontend

Etapas: 

  1 - Start Frontend

    $ cd [rootProject]/frontend
    $ npm install
    $ npm start
  
  2 - Start Backend
  
    $ cd [rootProject]/backend
    $ mvn package (required install maven)
    $ java -jar [rootProject]/backend/target/spring-boot-upload-files-0.0.1-SNAPSHOT.jar

  3 - URL:
    
    frontend: http://localhost:4200
    backend : http://localhost:8080
    Database H2: http://localhost:8080/h2
    WS Consulta  todos agentes: http://localhost:8080/agentes
    WS Agentes por região: http://localhost:8080/agentes/SE   (Options: SE, N, NE, S)
     
Desafio
    
    Criar um sistema Web composto de um Front-end SPA (Single Page Application)
    Angular e um Back-end Java Spring Boot para envio de arquivos XML e posterior
    processamento deles.
    
    Requisitos
    
     Criar uma interface Web para upload de um ou mais arquivos com extensão .xml.
     Para o desenvolvimento da interface, deve ser utilizado o tema Indigo do Angular
    Material.
     Durante o envio do(s) arquivo(s) mostrar um loader para informar ao usuário que
    estão sendo processados, e ao final esse loader deve desaparecer (utilizar
    componentes do Angular Material).
     Os arquivos contêm uma lista de agentes com código e data em formato ISO, e uma
    lista com quatro regiões (SE, S, NE, N) com sete valores numéricos de geração, compra
    e preço médio.
     Todos os arquivos seguem o mesmo formato, como nos exemplos em anexo:
    o exemplo_01.xml
    o exemplo_02.xml
    o exemplo_03.xml
     Não é necessário validar os dados dos arquivos, considere que eles estarão sempre
    corretos e no formato especificado acima.
     Os arquivos devem ser lidos e enviados um a um, sequencialmente.
     Os arquivos podem conter quantidades grandes de dados, por exemplo, 1.000 agentes
    (agentes/agente[0..999])
     Os dados de preço médio (/agentes/agente[]/submercado[]/precoMedio) são
    confidenciais, portanto devem ser removidos ou substituídos por valores em branco
    antes de serem enviados.
     Ao receber cada arquivo, o back-end deve apenas imprimir na saída padrão
    (System.out) os códigos de agentes (/agentes/agente[]/codigo) recebidos.
     Utlizar
     Salvar os itens no Banco de dados.
     Recuperar um dado consolidado por região.

Instruções

    1. Criar o sistema utilizando as seguintes tecnologias base:

     Front-end:
    o Angular 12+
    o Angular Material 12+
    o Typescript 4+
    o RxJS 6+
    o NodeJS 14+
     Back-end:
    o Spring Boot 2
    o Maven 3
    o JPA

    o Hibernate

     Banco de Dados:

Disponibilizá-lo em um repositório Git público (exemplo: GitHub, Bitbucket).
