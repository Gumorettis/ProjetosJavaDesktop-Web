/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var contador = 1; 

function passar(){
    
    document.getElementById('radio'+contador).checked = true;
    contador++;
    
    if(contador > 4){
        contador = 1;
    }
}

setInterval(passar, 3500);




