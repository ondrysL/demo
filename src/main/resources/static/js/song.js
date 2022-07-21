const audioPlayer = document.getElementById("player")
const btnPlay = document.getElementById("play")
const waves = document.getElementsByClassName("box")
const minus = document.getElementById("minus")
const plus = document.getElementById("plus")
let vol = document.getElementById("vol")

btnPlay.addEventListener('click', playAudio)
minus.addEventListener('click', minusVol)
plus.addEventListener('click', plusVol)

let isPlaying = false;
let run = "running"
let pause = "paused"
let actualVolume = audioPlayer.volume;

function check(){
    vol.innerHTML = (actualVolume*10).toFixed(0)
    audioPlayer.volume = actualVolume
}

var t=setInterval(check,250);

function minusVol(){
    if((actualVolume*10).toFixed(0) == 0){
        console.log(actualVolume)
        return actualVolume
    }else{
        console.log(actualVolume)
        return actualVolume-=0.1
    }
}

function plusVol(){
    if((actualVolume*10).toFixed(0) == 10){
        console.log(actualVolume)
        return actualVolume
    }else{
        console.log(actualVolume)
        return actualVolume+=0.1
    }
}

function waveMove(waves, text){
    for(let i = 0; i < waves.length; i++){
        waves[i].style.animationPlayState = text
    }
}

function playAudio(){
    if(isPlaying){
        audioPlayer.pause()
        waveMove(waves, pause)
        isPlaying = false
    }else{
        audioPlayer.play()
        waveMove(waves, run)
        isPlaying = true;
    }
}




