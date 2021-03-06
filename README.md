# Dashboard

This dashboard is for data visualisation for breathing exercises.
### Requirements
- Node.js (https://nodejs.org/en/download/)

### Techstack
- Spring-Boot
- React
---

# SPRING-BOOT
### Endpoints
- api/v1/breathing-exercise

### Usage
You can use Postman to **GET** and **POST** data

### GET
###### Get all exercises
    GET: http://localhost:8080/api/v1/breathing-exercise

#### POST
###### Add a new exercise
    POST: http://localhost:8080/api/v1/breathing-exercise

    JSON: {
          "breathingRepetitions": 30,
          "date": "2020-09-22"
          }

#### Run Spring-Boot service
    cd ~/backend
    mvnw spring-boot:run
---

# REACT

### Install npm packages
    npm install @material-ui/core
    npm install anxios
    npm install react-icons --save

### Start dashboard
    cd ~/frontend
    npm start
