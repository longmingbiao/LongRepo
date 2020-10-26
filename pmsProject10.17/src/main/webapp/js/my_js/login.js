// /*实行登录功能相关的脚本*/
// const pathUrl=$("#url").val();
//
// $("#submit").click(function () {
//     /*做题思路：
//     * 1.获取用户名和密码
//     * 2.判断输入的值是否为空
//     * 3.如果为空，则直接提示错误信息
//     * 4.如果不为空，才把值传递到服务端
//     * 5.利用ajax异步请求，把数据进行传递
//     * */
//     //步骤1：
//     const usernameValue=$("#username").val();
//     const userpwdValue=$("#pwd").val();
//     const checkcode=$("#checkCode").val();
//     //步骤2：
//     if(usernameValue.length==0){//证明没有输入
//         //把提示信息显示出来
//         $("#inputError").html("用户名不能为空");
//     }
//     else if(userpwdValue.length==0){
//         //把提示信息显示出来
//         $("#inputError").html("密码不能为空");
//     }
//     else if(checkcode.length==0){
//         $("#inputError").html("验证码不能为空");
//     }
//     else{
//         $.ajax({
//             url:pathUrl+"/user/login",
//             data:{username:usernameValue,password:userpwdValue,checkcode:checkcode},
//             dataType:"json",
//             type:"post",
//             success:function (result) {
//                 if(result.id==1){
//                     window.location.href="index.jsp";
//                 }
//                 else if (result.id==2){
//                     $("#inputError").html(result.message);//输出用户名密码错误信息
//                 }
//                 else if (result.id==3){
//                     $("#inputError").html(result.message);//输出验证码错误信息
//                     $("#code").attr("src","image.jsp?date="+new Date());
//                     $("#checkCode").val('');
//                 }
//             },
//             error:function () {
//                 alert("访问有误....")
//             }
//         })
//     }
//
// });
// //刷新验证码
// $("#code,#reflaseCode").click(function () {
//     $("#code").attr("src","image.jsp?date="+new Date())
// });


/*做题思路：
    * 1.获取用户名和密码
    * 2.判断输入的值是否为空
    * 3.如果为空，则直接提示错误信息
    * 4.如果不为空，才把值传递到服务端
    * 5.利用ajax异步请求，把数据进行传递
    * */
var pathUrl=$("#url").val();
$("#submit").click(function () {
    var username  =$("#username").val();
    var password  = $("#pwd").val();
    var checkcode = $("#checkCode").val();

    if(username.length==0){
        $("#inputError").text("用户名不能为空");
    }else if(password.length==0){
        $("#inputError").text("密码不能为空");
    }else if(checkcode.length==0){
        $("#inputError").text("验证码不能为空");
    }else{
        $.ajax({
            url:pathUrl+"/user/login",
            data:{username:username,password:password,checkcode:checkcode},
            dataType:"json",
            type:"post",
            success:function (result) {
                if(result.id==1){
                    // alert(result.message+result.id);
                    window.location.href="index.jsp";
                    $("#code").attr("src","image.jsp?date="+new Date());
                    $("#checkCode").val("");
                }else if(result.id==2){
                    $("#inputError").text(result.message);
                }else if(result.id==3){
                    $("#inputError").text(result.message);
                }

            },
            error:function () {
                alert("出异常了");
            }
        })
    }
});

$("#code,#reflaseCode").click(function () {
    $("#code").attr("src","image.jsp?date="+new Date());
})











