import http from 'http'
import fs from 'fs'

fs.writeFileSync('mine.txt', "helo workd",)

const server = http.createServer((req, res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' })
    res.end('Hello Vishu, Welcome to Node.js Core Modules!');
})

server.listen(4000, () => {
    console.log("server is running on 4000");
})


