var numQues = 3;


window.onload = function () {
 //Start with the div visible
 document.getElementById("question2").style.visibility = "hidden";
 document.getElementById("question3").style.visibility = "hidden";
}



function enterAnswer(){
 
 
    if (quiz1.an[2].checked == true){
       confirm("Correct!")
       
       }
       else if (quiz2.an[3].checked == true){
       confirm("Correct!")
     
       }
       else if (quiz3.an[2].checked == true){
       confirm("Correct!")
     
      }
       else {
       confirm("Incorrect")
     
     }

  }
  function reset() {
  document.getElementById("question1").reset();
  document.getElementById("question2").reset();
  document.getElementById("question3").reset();
}

var i = 0;
function next() {
i++;
  if(i == 1){
      document.getElementById("question1").style.visibility = "hidden";
      document.getElementById("question2").style.visibility = "visible";
      document.getElementById("question3").style.visibility = "hidden";
   } 
    else if(i == 2){
      document.getElementById("question1").style.visibility = "hidden";
      document.getElementById("question2").style.visibility = "hidden";
      document.getElementById("question3").style.visibility = "visible";


   }
     else{
      document.getElementById("question1").style.visibility = "hidden";
      document.getElementById("question2").style.visibility = "hidden";
      document.getElementById("question3").style.visibility = "hidden";
    }
  }

     
  
  
