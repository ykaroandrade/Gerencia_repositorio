#!/bin/bash

echo "Instalando Dependências"
echo "Instalando Java"
sudo apt-get install -y python-software-properties
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install -y oracle-java8-installer

echo "Instalando Maven"
sudo apt-get install -y maven

echo "Instalando dependências Maven"
mvn dependency:go-offline
mvn install

echo "Instalando PostgreSQL"
sudo apt-get install -y postgresql postgresql-contrib

echo "Criando database"
sudo psql -U postgres -c 'CREATE DATABASE aula;'

echo "Rotina de inicialização do banco de dados."
sudo psql -U postgres psql -d aula -a -f Scripts/Database.txt

