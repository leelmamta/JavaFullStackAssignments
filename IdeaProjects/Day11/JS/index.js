// alert("messgae");

let str = 'Here are  the things That i want to learn ';
const fName = 'mamta'; 
const LName = 'Leel'; 
const age = 40; 
console.log('My Name is'+fName+'And my age is '+age);
console.log(`My Name is ${fName} and my age is ${age}`);

// String 
// Splitting around space 
console.log(str.split(' '));
console.log(str.concat(fName));
console.log(str.slice(5, 20));
console.log(str.slice(-30));
const numbers = new Array(1, 2, 3, 4); 
// Important concept Here that we can update the values at particular place but not the array 
const place = ['delhi', 'banglore', 'china', 'gurgoan']; 
place[3] = 'mum'; 
console.log(place);


// JSON Objects

const Employee = {
    firstName : 'mamta',
    lastName :'leel',
    age : 22, 
    skills :['Java', "Html", 'CSS', 'Javascript'],
    address:{
        street: 'Loha Mandi Road ', 
        PlotNo : 'Plot no 1 ', 
        Colony :'4-s , Ablock ', 
        district :'Jaipur', 
        Pincode : 302013
    }
}

console.log(Employee.address.district);

console.log(Employee.skills[2]);

const dailyTasks = [
    {
        id :1, 
        Text:"Message sent", 
        isCompleted:true
    }, 
    {
        id :2, 
        Text:"BreakFast", 
        isCompleted:true
    }, 
    {
        id :3, 
        Text:"Meeting", 
        isCompleted:false 
    }

]

for (let index = 0; index < dailyTasks.length; index++) {
    console.log(dailyTasks[index]);
}

for(let values in dailyTasks){
    console.log(values[0]);
}

dailyTasks.forEach(task => {
    console.log(task.Text);
});



// Now lets try Functions in javascript  

// function addTwoNumbers( a , let b) {
//     console.log(a+b);
// } //-> Syntax Error 

function multiply(a, b) {
    return a*b;
    
}

console.log(multiply("str", 3));
console.log(multiply("str", "ptr")); // _> Strings cant be multiplied so Give NaN
console.log(multiply(4, 5));


// Lets try lambda method 
// const add = () =>{
//    console.log(a+b); 
// }
// add(9,10) // -> reference error 

const addNums= (a, b) =>  a+b; 
console.log(addNums(9,10));

function usersData(firstN , lastN , dob) {
    this.firstN = firstN; 
    this.lastN = lastN ; 
    this.dob  = new Date(dob); 

    this.CompleteData = function() {
        return `${firstN} ${lastN} ${this.dob.getDate()}`
    }
}
 
const user1 = new usersData('mamta' , 'leel', '04-01-2000'); 

console.log(user1.CompleteData())


