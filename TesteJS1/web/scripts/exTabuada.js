/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function calcularTabuada(){
    var num = document.getElementById('txtnum');
    var tab = document.getElementsByName(('resTabuada'));
    
    if(num.value.length == 0){
        window.alert('Por favor digite um Numero ! ');
    }
    else{
       
       var aux = 1;
       var numConvertido = Number(num.value);
       
        while (aux <= 10){
            var item = document.createElement('option');
            item.text = `${numConvertido} x ${aux} = ${numConvertido*aux}`;
            tab.add(item);
            aux ++;
        }
    }
}

