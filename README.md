# pwcho-zad1

## Usage
Clone project:
```
git clone https://github.com/RaggerBreak/pwcho-zad1.git
```
To run this project use docker compose:
```
docker-compose -f docker-compose.dev.yml up -d
```
Verify the deployment by navigating to your server address in your preferred browser:
* ``127.0.0.1:80``
* ``http://localhost:80/``


## Technologies
- Java 11
- Maven
- Angular
- Spring Framework
  - Spring Cloud
  - Spring Cloud Gateway
  - Spring Cloud OpenFeign
- Redis
- PostgreSQL
- JPA, Hibernate
- Docker, Docker Compose


## Architecture
![Alt text](PwchoZad1.png?raw=true "Architecture")

## Application
Fib calc -> submit
1. FRONTEND call SERVER (POST /api/server/fib/{fibonacciPosition}) via Gateway to calculate, save and return fibonacci number
2. SERVER call FIB (POST /api/fib/{fibonacciPosition}) via OpenFeign
3. FIB calculate fibonacci number, save in Redis and return result
4. SERVER save result from FIB in Postgres and return to FRONTEND

Fib calc -> Last 10 indexes
1. FRONTEND call SERVER (GET /api/server/position/last10) via Gateway
2. SERVER returns to FRONTEND last ten given positions from Postgres

Fib calc -> History
1. FRONTEND call SERVER (GET /api/server/fib/all) via Gateway
2. SERVER call FIB (GET /api/fib/all) via OpenFeign
3. FIB returns to SERVER history of calculated fibonacci numbers from Redis
4. SERVER returns history of calculated fibonacci numbers to FRONTEND


