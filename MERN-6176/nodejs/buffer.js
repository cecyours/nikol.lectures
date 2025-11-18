const buf = Buffer.from("hello world")
console.log(buf);


console.log(buf.toString());


// allocation of buffer 

const buf2 = Buffer.alloc(5)
buf2.write("Node");
console.log(buf2);

// 
const buf3 = Buffer.from([75, 85, 76, 68, 69, 69, 80])

console.log(buf3.toString());



