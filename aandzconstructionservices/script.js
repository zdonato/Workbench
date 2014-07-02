var images = new Array();
images[0] = "header.jpeg";
images[1] = "header.png";

var blocks = new Array(); 
blocks[0] = "serv";
blocks[1] = "res";
blocks[2] = "com";
blocks[3] = "sup"; 

setInterval("changeImage()", 3000);
var n = 0; 

function changeImage(){ 
    if (n >= images.length) 
        n = n % images.length;
    document.getElementById("pic").src = images[n];
    n++;
}

function swap(show){
    var i; 
    for (i = 0; i < blocks.length; i++) {
        document.getElementById(blocks[i]).className = "hide";   
    }
    
    document.getElementById(show).className = "show";
}
