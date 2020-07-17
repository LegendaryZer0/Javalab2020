module.exports = function (app) {
    app.get('/users', (request, response) => {
        var result = [{
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
        response.send(JSON.stringify(result));
    });
};