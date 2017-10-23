var redStop = "";
var comp = "";
function openMenu(id, status) {
    var rollback = "";
    if (id == '08') {

    }
    if (status == '') return;
    if (id == '02') {
        four();
        if (redStop == "F") {
            openWin('黄色提示', '660', '250', "order/indexPrompt.htm?message=" + encodeURI(encodeURI(comp)) + "&type=yellow");
            window.setTimeout(function () {
                openMenu1(id, status);
            }, 3000);
        } else if (redStop == "T") {
            openWin('红色提示', '660', '250', "order/indexPrompt.htm?message=" + encodeURI(encodeURI(comp)) + "&type=red");
            window.setTimeout(function () {
                openMenu1(id, status);
            }, 3000);
        } else {

            openMenu1(id, status);
        }
    } else {

        openMenu1(id, status);
    }

}
function openMenu1(id, status) {
    if (status == '') return;
    if (id == '16') {
        var flag = "";
        $.ajax({
            url: "getNowServerTime.htm?&date=" + new Date(),
            async: false,
            cache: false,
            error: function () {
                return false;
            },
            success: function (reply) {
                flag = reply;
            }
        });
        //	if(flag=="true"){
        //		alert("系统正忙，该功能在11点后开放");
        //		return;
        //	}
    }
    if (id == '05') {	//判断是否为门诊护士站
        //判断是否启用皮试叫号
        $.ajax({
            async: false,
            cache: false,
            url: "number/isSkintestRead.htm?date=" + new Date(),
            error: function () {
            },
            success: function (data) {
                //如设置中为Y，则启用皮试叫号
                if (data == 'Y') {
                    var params = "channelmode=0,width=1000,height=600,depended=no,left=" + window.screen.width + ",top=0,location=0,menubar =0,alwaysLowered=0, scrollbars=0,directories =0,resizable=0,alwaysRaised=1,z-look=1,fullscreen=0";
                    var win1 = window.open("number/skin_testshow.htm?hosnum=" + $("#hosnum_skintest").val() + "&nodecode=" + $("#nodecode_skintest").val() + "&t=" + new Date(), "皮试叫号", "'" + params + "'");
                }
            }
        });
    }
    //测试节点
    if (id == '00') {
        var str = $("#menu_" + id + "").text() + 'autoComeIN.htm?key=' + $("#login_userjobno").val() + "&dept=" + $("#login_deptcode").val() + "&shayne=" + $("#login_wardid").val();
        myOpen(str, 'window');
        window.setTimeout(function () {
            window.focus();
        }, 1);
        //var str='<%=basePath%>autoComeIN.htm?key='+$("#login_userjobno").val()+"&dept="+$("#login_deptcode").val()+"&shayne="+$("#login_wardid").val();
        //window.location = str;
        return;
    }
    //document.location.href = "system.htm?id="+id;
    //window.open('system.htm?id='+id,'window','fullscreen=2');
    myOpen('system.htm?id=' + id, 'window');
    window.setTimeout(function () {
        window.focus();
    }, 1);
    var tflag = '0';
    if (id == '04') {
        $.ajax({
            async: false,
            cache: false,
            type: 'post',
            url: "expirydate.htm",
            data: {"id": id, "date": new Date()},
            error: function () {
            },
            success: function (data) {
                if (data > "0") {
                    var isExpiry = confirm("有-" + data + "-种药品即将过期，是否进入有效期管理?");
                    if (isExpiry == true) {
                        var str = '<%=basePath%>others.htm?menuid=' + id + "&validto_warning=Y";
                        window.location = str;
                        window.setTimeout(function () {
                            window.focus();
                        }, 1000);

                        return;
                    } else {

                    }
                }
            }
        });
    }
}


function myOpen(winurl, winname) {
    window.location = winurl;
    //objWin= window.open( winurl,winname, "scrollbars=yes,status=yes,resizable=yes,top=0,left=0,width="+(screen.availWidth-18)+",height="+(screen.availHeight-60));
    //objWin.focus();
    //return true;
}
function setWin() {
    $('#content').css('height', $(window).height() - 285);
    clusterTransactionCheckin();
}

function clusterTransactionCheckin() {
    $.ajax({
        async: true,
        cache: false,
        ifModified: true,
        type: "GET",
        url: "clusterTransactionCheckin.htm?now=" + new Date().getMilliseconds(),
        dataType: "json",
        error: function () {
            //报错
        },
        success: function (data) {
            //成功
        }
    });
}

//判断是否弹层
function four() {
    $.ajax({
        async: false,
        cache: false,
        type: "POST",
        url: "order/checkSetController.htm",
        data: "now=" + new Date().getTime(),
        dataType: "json",
        error: function () {
            alert("检查是否配置四定控制失败");
            $.unblockUI();
            return;

        },
        success: function (data) {
            if (data.status) {
                var comp1 = "";
                var comp2 = "";
                $("#Prompt").val(true);
                //var json=new Array;
                $.ajax({
                    async: false,
                    cache: false,
                    type: "GET",
                    url: "order/getRed.htm",
                    data: "now=" + (new Date()).getTime(),
                    //dataType:"json",
                    error: function (data) {
                        alert(data);
                    }, success: function (data) {
                        if (data.indexOf("error") > -1) {
                            alert(data);
                            return;
                        } else {
                            var mapList = eval("(" + data + ")");
                            $("#war_med").val(mapList[0].war_med);
                            $("#stop_med").val(mapList[0].stop_med);
                            $("#war_pre").val(mapList[0].war_pre);
                            $("#stop_pre").val(mapList[0].stop_pre);
                            $("#war_hel").val(mapList[0].war_hel);
                            $("#stop_hel").val(mapList[0].stop_hel)
                            $("#war_jyy").val(mapList[0].war_jyy);
                            $("#stop_jyy").val(mapList[0].stop_jyy);
                            $("#war_jyu").val(mapList[0].war_jyu);
                            $("#stop_jyu").val(mapList[0].stop_jyu);
                            $("#war_kjy").val(mapList[0].war_kjy);
                            $("#stop_kjy").val(mapList[0].stop_kjy);
                            $.ajax({
                                async: false,
                                cache: false,
                                type: "GET",
                                url: "order/getperson.htm",
                                data: "now=" + (new Date()).getTime(),
                                error: function (data) {
                                    alert(data);
                                },
                                success: function (data) {
                                    if (data == "fail") {
                                        alert("加载失败！");
                                    } else {

                                        var arr = data.split("~");
                                        //药品金额比
                                        if (parseFloat(arr[0]) > parseFloat($("#war_med").val()) && arr[0] < parseFloat($("#stop_med").val())) {
                                            comp1 = "药品金额比已达：" + arr[0] + " 黄线值为：" + $("#war_med").val();
                                        } else if (parseFloat(arr[0]) > parseFloat($("#stop_med").val())) {
                                            comp2 = "药品金额比：";
                                        }
                                        //人均药费
                                        if (parseFloat(arr[1]) > parseFloat($("#war_pre").val()) && parseFloat(arr[1]) < parseFloat($("#stop_pre").val())) {
                                            comp1 = comp1 + "人均药费已达：" + arr[1] + " 黄线值为：" + $("#war_pre").val();
                                        } else if (parseFloat(arr[1]) > parseFloat($("#stop_pre").val())) {
                                            comp2 = comp2 + " 人均药费： ";
                                        }
                                        //人均医疗费
                                        if (parseFloat(arr[2]) > parseFloat($("#war_hel").val()) && parseFloat(arr[2]) < parseFloat($("#stop_hel").val())) {
                                            comp1 = comp1 + " 人均医疗费已达：" + arr[2] + " 黄线值为：" + $("#war_hel").val();
                                            redStop = false;
                                        } else if (parseFloat(arr[2]) > parseFloat($("#stop_hel").val())) {
                                            comp2 = comp2 + " 人均医疗费： ";
                                        }
                                        //人均静脉用药
                                        if (parseFloat(arr[3]) > parseFloat($("#war_jyy").val()) && parseFloat(arr[3]) < parseFloat($("#stop_jyy").val())) {
                                            comp1 = comp1 + " 人均静脉用药数已达：" + arr[3] + " 黄线值为：" + $("#war_jyy").val();
                                        } else if (parseFloat(arr[3]) > parseFloat($("#stop_jyy").val())) {
                                            comp2 = comp2 + " 人均静脉用药数： ";
                                        }
                                        //静脉使用
                                        if (parseFloat(arr[4]) > parseFloat($("#war_jyu").val()) && parseFloat(arr[4]) < parseFloat($("#stop_jyu").val())) {
                                            comp1 = comp1 + " 静脉用药使用率已达：" + arr[4] + " 黄线值为：" + $("#war_jyu").val();
                                        } else if (parseFloat(arr[4]) > parseFloat($("#stop_jyu").val())) {
                                            comp2 = comp2 + " 静脉用药使用率： ";
                                        }
                                        //抗菌药
                                        if (parseFloat(arr[5]) > parseFloat($("#war_kjy").val()) && parseFloat(arr[5]) < parseFloat($("#stop_kjy").val())) {
                                            comp1 = comp1 + " 抗菌药物金额比已达：" + arr[5] + " 黄线值为：" + $("#war_kjy").val();
                                        } else if (parseFloat(arr[5]) > parseFloat($("#stop_kjy").val())) {
                                            comp2 = comp2 + " 抗菌药物金额比： ";
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
                if (comp1 == "" && comp2 == "") {
                    redStop = "N";//不弹
                } else if (comp2 != "") {
                    redStop = "T";//弹红
                    comp = comp1 + "~" + comp2;
                } else {
                    redStop = "F";//弹黄
                    comp = comp1;
                }
                return redStop, comp;
            }
        }
    });
}