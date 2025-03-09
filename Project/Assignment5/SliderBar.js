
let slider_img = document.querySelector('.slides');
let images = ['a.jpg', 'b.jpg', 'c.jpg', 'd.jpg'];
let i=0;

function next(){
    if (i < images.length-1){
        i++;
    }else{
        i=0;
    }
    return sett();
}

function prev(){
    if (i <=0){
        i=images.length;
    }
        i--;
    return sett();
}

function sett(){
   return slider_img.setAttribute('src', '' +images[i]);

}