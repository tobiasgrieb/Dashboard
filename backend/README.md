# Dashboard

This dashboard is for visualisation data from some exercises.

## Techstack
- Spring-Boot
- h2-database

## Endpoints
- api/v1/exercise

## Usage
You can use Postman to **GET** and **POST** data

#### GET
###### Get all exercises
    GET: http://localhost:8080/api/v1/exercise

#### POST
###### Add a new exercise
    POST: http://localhost:8080/api/v1/exercise
    
    JSON: {
          "breathingRepetitions": 30,
          "date": "2020-09-22"
          }