var images = new Array();
images[0] = "header.jpeg";
images[1] = "header.png";
images[2] = "header2.png";

setInterval("changeImage()", 3000);
var n = 0; 

function changeImage(){ 
    if (n >= images.length) 
        n = n % images.length;
    document.getElementById("pic").src = images[n];
    n++;
}