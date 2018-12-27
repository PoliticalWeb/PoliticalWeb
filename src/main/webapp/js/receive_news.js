
//权威文件
function docRequest(id){
    $.ajax({
       url: "news/fromOne",
       type: "POST",
        data: id,
        dataType: "json",
        success: function (data) {
            window.open(data);
        }
    });
}

window.onload =function () {

    //首页接收新闻
    //权威文件
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
          num: 7,
          channel_id: 1,
        },
        dataType: "json",
        success: function (data) {
            var doc_list = document.getElementsByClassName("doc_list");
            $.each(data,function (n,value) {
               doc_list.innerHTML += '<li onclick="docRequest(data.id)">' + data.title + '</li>';
            });
        }
    });


    //教育名著
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 2,
        },
        dataType: "json",
        success: function (data) {
            var edu_list = document.getElementsByClassName("edu_list");
            $.each(data,function (n,value) {
                edu_list.innerHTML += '<li onclick="docRequest(data.id)">' + data.title + '</li>';
            });
        }
    });

    //学者观点
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 3,
        },
        dataType: "json",
        success: function (data) {
            var theory_list = document.getElementsByClassName("theory_list");
            $.each(data,function (n,value) {
                theory_list.innerHTML += '<li onclick="docRequest(data.id)">' + data.title + '</li>';
            });
        }
    });

    //理论探索
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 4,
        },
        dataType: "json",
        success: function (data) {
            var explore_list = document.getElementsByClassName("explore_list");
            $.each(data,function (n,value) {
                explore_list.innerHTML += '<li onclick="docRequest(data.id)">' + data.title + '</li>';
            });
        }
    });

    //教学能力讲座
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 5,
        },
        dataType: "json",
        success: function (data) {
            var lecture_list = document.getElementsByClassName("lecture_list");
            $.each(data,function (n,value) {
                lecture_list.innerHTML += '<li onclick="docRequest(data.id)">' + data.title + "</li>";
            });
        }
    });

    //精彩课堂
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 6,
        },
        dataType: "json",
        success: function (data) {
                var video = document.getElementById("video");
                video.src = data;
        }
    });
}

// $(function(){
//     $('#send').click(function(){
//         $.ajax({
//             type: "GET",
//             url: "test.json",
//             data: {username:$("#username").val(), content:$("#content").val()},
//             dataType: "json",
//             success: function(data){
//                 $('#resText').empty();   //清空resText里面的所有内容
//                 var html = '';
//                 $.each(data, function(commentIndex, comment){
//                     html += '<div class="comment"><h6>' + comment['username']
//                         + ':</h6><p class="para"' + comment['content']
//                         + '</p></div>';
//                 });
//                 $('#resText').html(html);
//             }
//         });
//     });
// });


