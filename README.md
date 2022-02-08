# TestCloud
https://github.com/serdyuksb1982?tab=repositories

Spring boot and Spring Cloud API. Динамическая и синхронная архитектура на Spring Cloud. API включает RESTfull, микросервисы. 
Создание Eureka Server на порту 8761 на базе Maven с помощью Spring Initializr, добавив в него зависимость Eureka Server. Для активации реализации Eureka Server добавил в него аннотацию @EnableEurekaServer.

Клиент №1: https://github.com/serdyuksb1982/TestCloud/tree/main/MicroService%231
  Первый микросервис. EXAMINATOR. Выполняет роль экзаменационного сервиса.
  Порт 8086

Клиент №2: https://github.com/serdyuksb1982/TestCloud/tree/main/MicroService%232
  Это второй микросервис, отвечает за запросы-ответы   по истории. Rest. Сохранение в базе данных на MySQL.
  В Pom.xml добавлены зависимости: spring-cloud.version>Hoxton.SR4</spring-cloud.version, spring-cloud-starter-netflix-eureka-client,
  В application.properties: eureka.client.service-url.default-zone=http://localhost:8761/eureka spring.application.name=Historic
  Порт 8088.

Клиент №3: https://github.com/serdyuksb1982/TestCloud/tree/main/MicroService%233
  Это третий микросервис, имитирующий математические вопросы.
  Порт 8085.
  
Eureka_Server: https://github.com/serdyuksb1982/TestCloud/tree/main/eureka_server
  Server.port=8761
