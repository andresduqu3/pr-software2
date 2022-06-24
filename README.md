# SOFTWARE 2

Versiones usadas:
- Netbeans 12.6
- Java SE 17.02
- Vmware Workstation Pro 16.2.3

Configuración de Docker (No es necesario si se tiene la maquina virtual)
		
# NEO4J

	docker pull neo4j

	docker run --publish=7474:7474 --publish=7687:7687  --name neo4j-s2 --volume=$HOME/neo4j/data:/data  neo4j

	docker start neo4j-s2

	docker update --restart unless-stopped neo4j-s2

	docker exec -it neo4j-s2 bash

url	localhost:7474




# CASSANDRA

Step 1: Pull Cassandra Docker Image

	docker image pull cassandra:3.11.11

Step 2: Run Cassandra Docker Image as Docker Container

	docker run -d --name cassandra-s2 -p 9042:9042 cassandra:3.11.11
	
	docker update --restart unless-stopped  cassandra-s2

Step 3: Login to cassandra-node(Docker Container) on bash mode

	docker exec -it cassandra-s2 bash

Step 4: Open Cassandra SQL CLI

	cqlsh



# ORACLE XE 11G

https://hub.docker.com/r/oracleinanutshell/oracle-xe-11g

	docker pull oracleinanutshell/oracle-xe-11g

	docker run -d -p 1521:1521 --name oracle-s2 -e ORACLE_ALLOW_REMOTE=true oracleinanutshell/oracle-xe-11g

	docker start oracle-s2

	docker update --restart unless-stopped oracle-s2

	docker exec -it oracle-s2 bash

user	system
pass	oracle

Nuevo uuario

conectarse a system
luego se puede crear el usuario:

	create user samuel IDENTIFIED by 12345678;

	grant dba to samuel;

	GRANT CREATE SESSION TO samuel;




# MONGODB
		
	docker pull mongo:5.0.6

	docker run  -p 27017:27017 --name mongo-s2 -v $HOME/mongodb/data:/data/db -d mongo:5.0.6

	docker start mongo-s2

	docker update --restart unless-stopped mongo-s2

	docker exec -it mongo-s2 bash

url	mongodb://localhost:27017



# COUCHDB

	docker pull bitnami/couchdb:3.2.0

	docker run  -p 5984:5984 --name couchdb-s2 -v $HOME/couchdb/data:/data/db -d bitnami/couchdb:3.2.0

	docker start couchdb-s2

	docker update --restart unless-stopped couchdb-s2

	docker exec -it couchdb-s2 bash

user	admin
pass	couchdb



# REDIS

	docker pull redis:6.2.6

	docker run -d --name redis-s2 -p 6379:6379 redis:6.2.6

	docker start redis-s2

	docker update --restart unless-stopped redis-s2

	docker exec -it redis-s2 bash

	redis-cli
