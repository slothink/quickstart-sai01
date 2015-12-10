Spring4 + Hibernate4 + Gradle
=============================
Configurations
- Gradle Build
- Spring4 with Annotation Configuration (No XML)
- Hibernate4 with XML Configurations (No JPA)
- Servlet 3.0 Annotation Configuration (No web.xml)

Build
-----

#1 clone repository
> git clone git@github.com:slothink/quickstart-sai01.git

#2 database
> gradle makeCreateDatabaseUserSql

출력된 sql 로 mysql 에 database 및 사용자 계정 생성한다

#3 Start Server
> gradle appStart

#4