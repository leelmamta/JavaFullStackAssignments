// add on submit functionality 
// After submitting form Store it into local storage or JSON Object 
// and direct to another page dashboard 
// You have to check also if it exists or not 

// localStorage.user = {name: "John"};
// console.log(localStorage.user); // [object Object]

// // Using JSON.stringify as a workaround
// localStorage.user = JSON.stringify({name: "John"});

// let user = JSON.parse( localStorage.user );
// console.log( user.name ); // John

// // Printing the whole storage with added formatting options to make the object look nicer
// console.log( JSON.stringify(localStorage, null, 2) );


// localStorage.users = {
//     username :"leelmamta", 
//     firstname : "mamta",
//     lastname :"leel",
//     password : "902398"
// }

const userName = document.getElementById("username");
const firstname = document.getElementById("firstname"); 
const lastname = document.getElementById("lastname"); 
const password = document.getElementById("password"); 
console.log(userName.namespaceURI);