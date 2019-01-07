


window.onload =function () {

    //点击事件
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
            for(var n=0;n<7;n++){
                document.getElementById("doc_list").innerHTML += '<li onclick=docRequest(data[n]["id"])>' + data[n]["title"] + '</li>';
            }
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
            //console.log(data);
            for(var n=0;n<7;n++){
                document.getElementById("edu_list").innerHTML += '<li onclick="docRequest(data[n]["id"])">' + data[n]["title"] + '</li>';
            }
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
            //console.log(data);
            // for(var n=0;n<7;n++){
            //     document.getElementById("theory_list").innerHTML += '<li onclick="docRequest(data[n]["id"])">' + data[n]["title"] + '</li>';
            // }
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
            //console.log(data);
            for(var n=0;n<7;n++){
                document.getElementById("explore_list").innerHTML += '<li onclick="docRequest(data[n]["id"])">' + data[n]["title"] + '</li>';
            }
        }
    });

    //精彩课堂
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 1,
            channel_id: 5,
        },
        dataType: "json",
        success: function (data) {
            console.log(data);
            // var video = document.getElementById("video");
            // video.src = data[0]["title"];
        }
    });

    //教学能力讲座
    $.ajax({
        url: "news/fromMain",
        type: "POST",
        data: {
            num: 7,
            channel_id: 6,
        },
        dataType: "json",
        success: function (data) {
            console.log(data);
            //         for(var n=0;n<7;n++){
            //             document.getElementById("lecture_list").innerHTML += '<li onclick="docRequest(data[n].id)">' + data[n]["title"] + "</li>";
            // }
        }
    });
}



