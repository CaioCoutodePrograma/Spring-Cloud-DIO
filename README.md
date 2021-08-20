# Microservice-SpringCloud
Projeto com arquitetura baseada em Micro serviços desenvolvido em Java com Spring Boot e Cloud

# :rocket: Tecnologias 
- Java 8 
- Gradle 7.1 
- Docker
- Spring Boot 2.5.3 
- ElasticSearch
- Redis
# :man_technologist: Como rodar o Projeto
É necessário ter os 3 primeiros itens da lista anterior instalados na sua máquina.
1. Na raiz do projeto, através do terminal, execute o comando: `docker-compose up -d`
2. E para iniciar os serviços pelo terminal, no diretório de cada um utilize o comando: `gradle :bootRun` ou inicie através da sua IDE preferida

Obs.: Eles devem ser iniciados nessa ordem:
1. config-server 
2. service-discovery
3. gateway
- Os demais não possuem ordem.


