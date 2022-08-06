/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var hamburger_menu = document.getElementById("hamburguer-menu");
var container = document.querySelector(".container");
    
    function evento1(){
        
    hamburger_menu.addEventListener("click", function (){
    
    container.classList.toggle("active");
    
    });
}
    
    window.addEventListener("load",evento1);

