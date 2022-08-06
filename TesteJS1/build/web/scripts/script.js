/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function carregar() {
    var msg = window.document.getElementById('msg');
    var img = window.document.getElementById('imagem');
    
}

function verificar(){
    
    var data = new Date();
    var ano = data.getFullYear();
    var anoDigitado = window.document.getElementById('ano');
    var res = document.getElementById('resultado');
    
    if(anoDigitado.value.length == 0 || anoDigitado.value > ano){
        window.alert('Dados inválidos ! Tente novamente ! ');
    }
    else{
        var radioSelecionado = document.getElementsByName('radio');
        var idade = ano - Number(anoDigitado.value);
        
        var genero = '';
        
        if(radioSelecionado[0].checked){
            genero = 'Homem';
            document.getElementById('foto').src='imagens/homem.jpg';
        }
        else{
            genero = 'Mulher';
            document.getElementById('foto').src='imagens/mulher.jpg';
        }
        
        res.innerHTML = 'Sua idade é: '+idade+' anos, e Genero: '+genero;
    }
}