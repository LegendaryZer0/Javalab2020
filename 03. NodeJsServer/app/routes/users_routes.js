bodyParser = require('body-parser').json();

module.exports = function (app) {
    app.get('/users', (request, response) => {
        let result = [{
            "id": 1,
            "name": "Marsel"
        },
            {
                "id": 2,
                "name": "Andrey"
            },
            {
                "id": 3,
                "name": "Maxim"
            }];
        response.setHeader("Content-Type", "application/json");
        response.send(JSON.stringify(result));
    });

    app.post('/users', bodyParser, (request, response) => {
        let body = request.body;
        console.log(body["name"]);
        let responseBody = {
            id : Math.random(),
            "name" : body["name"]   
        };

        response.setHeader("Content-Type", "application/json");
        response.send(JSON.stringify(responseBody));
    });
};