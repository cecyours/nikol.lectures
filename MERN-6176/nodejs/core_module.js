import http from 'http'
import fs from 'fs'

fs.writeFileSync('mine.txt', "helo workd",)

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' })




    const url = req.url

    switch (url) {
        case '/about':
            res.write("welcome to about page")
            break
        case '/contact':
            res.write("welcome to contact page")
    }

    res.end();
})

server.listen(4000, () => {
    console.log("server is running on 4000");
})


