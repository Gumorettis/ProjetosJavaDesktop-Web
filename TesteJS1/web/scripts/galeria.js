/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    var imagens = document.querySelectorAll('.imagem');
    var exbir = document.querySelectorAll('.exibicao');
    var img = document.querySelectorAll('#img');
    var botao = document.querySelectorAll('#fechar');
    var srcImagem = "";
    
    for(var i = 0; i < imagens.length; i++){
        
        imagens[i].addEventListener('click', function(){
        
        srcImagem = imagens[i].getAttribute('src'); 
        alert('clicou'+srcImagem);
        
        });
    }