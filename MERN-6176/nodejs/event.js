const Event = require('events')

const emmiter = new Event()


emmiter.on("todo", () => {
    console.log("this is emmiter for todo");
})


emmiter.on("work", () => {
    console.log("this is emmiter for work");
})



emmiter.emit('work')