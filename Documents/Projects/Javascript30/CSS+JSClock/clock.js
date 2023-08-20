//  Real Time that we can access through 
// and rotation of hour should be in an hour 
//  var d = new Date(); 
//  var hour = d.getHours() ; 
//  var min = d.getMinutes(); 
//  var sec = d.getSeconds(); 
// console.log(sec)
// console.log(min);
// console.log(hour)



// Rotation 
// 360 degree - 360/12 = 30deg rotation every hour 
// 30/60 = 0.5deg / every minute -> 
// 1/120 degree => Hour wala 


// Minute => 360/60 = 6 deg every minute 
// 0.1deg -. devery sec 

// sec (360/60 )= 6 degree every second 

// Position 
// 0 (9) -> 360 


// How to convert these into degrees 
const secondHand = document.querySelector('.second-hand');
const minHand = document.querySelector('.min-hand'); 
const hourHand = document.querySelector('.hour-hand'); 

function selectDate(){
    var now = new Date(); 
    var seconds = now.getSeconds(); 
    var minutes = now.getMinutes(); 
    var hour = now.getHours(); 

    var secondDeg = ((seconds/60)*360)+90; 
    var minDeg = ((minutes/60)*360)+90; 
    var hourDeg = (((hour)/12)*360 )+90; 

    secondHand.style.transform = `rotate(${secondDeg}deg)`;
    minHand.style.transform = `rotate(${minDeg}deg)`; 
    hourHand.style.transform = `rotate(${hourDeg}deg)`; 

    
}

setInterval(selectDate, 100)

// setInterval(selectDate, 1000)