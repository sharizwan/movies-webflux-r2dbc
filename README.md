{
    "info": {
        "name": "Movie API - Spring WebFlux",
        "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
    },
    "item": [
        {
            "name": "Create Movie",
            "request": {
                "method": "POST",
                "header": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "body": {
                    "mode": "raw",
                    "raw": "{\n    \"title\": \"Inception\",\n    \"genre\": \"Sci-Fi\",\n    \"year\": 2010\n}"
                },
                "url": {
                    "raw": "http://localhost:9092/movies",
                    "protocol": "http",
                    "host": [
                        "localhost"
                    ],
                    "port": "9092",
                    "path": [
                        "movies"
                    ]
                }
            }
        },
        {
            "name": "Get All Movies",
            "request": {
                "method": "GET",
                "url": {
                    "raw": "http://localhost:9092/movies",
                    "protocol": "http",
                    "host": [
                        "localhost"
                    ],
                    "port": "9092",
                    "path": [
                        "movies"
                    ]
                }
            }
        },
        {
            "name": "Get Movie by ID",
            "request": {
                "method": "GET",
                "url": {
                    "raw": "http://localhost:9092/movies/1",
                    "protocol": "http",
                    "host": [
                        "localhost"
                    ],
                    "port": "9092",
                    "path": [
                        "movies",
                        "1"
                    ]
                }
            }
        },
        {
            "name": "Update Movie",
            "request": {
                "method": "PUT",
                "header": [
                    {
                        "key": "Content-Type",
                        "value": "application/json"
                    }
                ],
                "body": {
                    "mode": "raw",
                    "raw": "{\n    \"title\": \"Inception (Updated)\",\n    \"genre\": \"Thriller\",\n    \"year\": 2010\n}"
                },
                "url": {
                    "raw": "http://localhost:9092/movies/1",
                    "protocol": "http",
                    "host": [
                        "localhost"
                    ],
                    "port": "9092",
                    "path": [
                        "movies",
                        "1"
                    ]
                }
            }
        },
        {
            "name": "Delete Movie",
            "request": {
                "method": "DELETE",
                "url": {
                    "raw": "http://localhost:9092/movies/1",
                    "protocol": "http",
                    "host": [
                        "localhost"
                    ],
                    "port": "9092",
                    "path": [
                        "movies",
                        "1"
                    ]
                }
            }
        }
    ]
}
