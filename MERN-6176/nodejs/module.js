import os from 'os'
import { add } from './math.js';


console.log("----core module----");
console.log(os.platform());
console.log(os.totalmem());


console.log("----local module----");
console.log(add(1, 5));


console.log("----third party module----");
console.log("modules which is install from npm or yarn ");









