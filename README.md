# MSEP Proof of Concept Project

This project is intended to be a proof of concept and an environment for testing PCF and Spring Cloud related technologies.

# Cloud Servers

## Config Server
This service is a basic implementation of the Spring Cloud Configuration consuming configurations from the [msep-config-repo](https://github.com/AlithyaCLD/msep-config-repo) Github repo.

### PCF
On PCF it's possible to use a provided Spring Cloud Configuration Server by using the following JSON configuration: [config-server-pcf.json](https://github.com/AlithyaCLD/MSEP/blob/master/config-server/config-server-pcf.json)

That configuration was created based on this [reference](https://docs.pivotal.io/spring-cloud-services/1-3/common/config-server/configuring-with-git.html).

## Discovery Server
This is a basic implementation of [Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/) Eureka discovery server.

### PCF
On PCF it's possible to use a provided Discovery Server without any specific configurations. For more details, follow the PCF [reference](https://docs.pivotal.io/spring-cloud-services/1-3/common/service-registry/) documentation.

## Circuit Breaker Dashboard

### PCF

## Gateway Service

### PCF

## Business Services

## User Service

## Product Service
