//IIFE and Closure
const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Mahi: "+empId()); 
  console.log("sagar: "+empId()); 
  console.log("raj: "+empId());
   

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(lastName);
  }
  
  var greeting = function(ln){
    console.log('Welcome ' + ln);
  };
  
  fullName("Mahi", "maheshuni", greeting);
  console.log("\n");
  fullName("sagar", "ambadas", greeting);
  console.log("\n");
  fullName("raj", "jage", greeting);
  
