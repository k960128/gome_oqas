
    var socketUrl = "ws://10.2.51.69:8081/websocket/10";

    var socket = new WebSocket(socketUrl);

    //打开事件
    socket.onopen=function(){
        console.log("websocket已经打开")
    }
    //获得消息事件
    socket.onmessage=function(msg){
        console.log(msg.data);
    }

    //关闭
    socket.onclose=function(){
        console.log("关闭");
    }

    socket.onerror=function(){
        console.log("错误");
    }
