const fs = require('fs')

fs.writeFileSync('data.txt', "Hello devang ; CEC");



fs.readFile('sample.txt', 'utf-8', (err, data) => {
    console.log(data);

})
