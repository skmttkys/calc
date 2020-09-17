$(function(){

  let numberArrays;
  $('.start_main').on('click',function(){
    $('.introduction_box').css('display','none');
    $('.rule_txt').text("1から13までの数字がバラバラにでるから、どんどん足して364を目指してね。");
    $('.btn_start,.ans_box').css('display','block');
    $('.start_practice').css('display','none');

    for(t=0; t<4; t++){
      if(t==0){
        numberArrays = Array.from(new Array(13)).map((v,i)=> i + 1);
      }else{
        var newnumberArrays = Array.from(new Array(13)).map((v,i)=> i + 1);
        numberArrays = numberArrays.concat(newnumberArrays);
      }
    }
  });

  $('.start_practice').on('click',function(){
    $('.introduction_box').css('display','none');
    $('.rule_txt').text("1から10までの数字がバラバラにでるから、どんどん足して55を目指してね。");
    $('.btn_start,.ans_box').css('display','block');
    $('.start_main').css('display','none');
    numberArrays = Array.from(new Array(10)).map((v,i) => i+1);
  });

  let correctArray = [];
  $('.btn_start').on('click',function(){
    $('.btn_start').css('display','none');
    var indexNumber = digIndexNumber(numberArrays);
    chosenNumber(numberArrays,0,indexNumber);
    correctArray.push(chosenNumber(numberArrays,0,indexNumber));
    arrayFilter(numberArrays,indexNumber);

  });

  $('.ans_box').on('change',function(){
    yourAns = $('.ans_box').val();
    yourAns = yourAns.replace(/[０-９]/g,function(s){return String.fromCharCode(s.charCodeAt(0)-0xFEE0)});
    $('.ans_box').val(yourAns);
    $('.btn_next').css('display','block');

  });


  let yourAnsArray = [];
  $('.btn_next').on('click',function(){
    yourAnsArray.push(yourAns);
    if(numberArrays.length==0){
      $('.add_num').text('おしまい');
      $('#ansArray').val(yourAnsArray);
      $('#correctArray').val(correctArray);
      $('.btn_next').css('display','none');
      $('.btn_finish').css('display','block');
      return
    }
    var indexNumber = digIndexNumber(numberArrays);
    var currentNumber = chosenNumber(numberArrays,yourAns,indexNumber);
    arrayFilter(numberArrays,indexNumber);

    correctArray.push(correctArray[correctArray.length-1] + currentNumber);
    $('.btn_next').css('display','none');

  });


});
function arrayFilter(array,indexNum){
  array.splice(indexNum,1);
  numberArrays = array;
}

function digIndexNumber(numberArrays){
  return Math.floor(Math.random() * numberArrays.length)
}

function chosenNumber(numberArrays,yourAns,indexNumber){
  var addNumber = numberArrays[indexNumber];
  $('.add_num').text(yourAns +' + '+addNumber+' は?');
  return addNumber;
}