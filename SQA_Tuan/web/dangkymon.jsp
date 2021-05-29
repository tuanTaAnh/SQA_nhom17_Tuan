<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--     <link rel="stylesheet" href="css/qlbh.css" /> -->
        <meta charset="UTF-8">
        <title>Đăng ký môn học</title>
    </head>
    <body>
        <div>
            <style type="text/css">
                * {
                    margin: 0;
                    padding: 0;
                }
                .td{
                    padding-left: 10px;
                }
                .button {
                    -moz-box-shadow:inset 0px 1px 0px 0px #ffffff;
                    -webkit-box-shadow:inset 0px 1px 0px 0px #ffffff;
                    box-shadow:inset 0px 1px 0px 0px #ffffff;
                    background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #ededed), color-stop(1, #dfdfdf) );
                    background:-moz-linear-gradient( center top, #ededed 5%, #dfdfdf 100% );
                    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ededed', endColorstr='#dfdfdf');
                    background-color:#ededed;
                    -webkit-border-top-left-radius:6px;
                    -moz-border-radius-topleft:6px;
                    border-top-left-radius:6px;
                    -webkit-border-top-right-radius:6px;
                    -moz-border-radius-topright:6px;
                    border-top-right-radius:6px;
                    -webkit-border-bottom-right-radius:6px;
                    -moz-border-radius-bottomright:6px;
                    border-bottom-right-radius:6px;
                    -webkit-border-bottom-left-radius:6px;
                    -moz-border-radius-bottomleft:6px;
                    border-bottom-left-radius:6px;
                    text-indent:0;
                    border:1px solid #dcdcdc;
                    display:inline-block;
                    color:#777777;
                    font-family:Times New Roman;
                    font-size:15px;
                    font-weight:normal;
                    font-style:normal;
                    height:25px;
                    line-height:25px;
                    width:100px;
                    text-decoration:none;
                    text-align:center;
                    text-shadow:1px 1px 0px #ffffff;
                }
                .button:hover {
                    background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #dfdfdf), color-stop(1, #ededed) );
                    background:-moz-linear-gradient( center top, #dfdfdf 5%, #ededed 100% );
                    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#dfdfdf', endColorstr='#ededed');
                    background-color:#dfdfdf;
                }.button:active {
                    position:relative;
                    top:1px;
                }
                /* This button was generated using http://tools.ngoisaoso.vn/css3button/ */


                #menu {
                    font-size: 18px;
                    color: white;
                    padding-top: 10px;
                    background-color: blue;
                    height: 30px;
                    top: 100px;
                    left: 0px;
                    text-align: center;
                    border-bottom-left-radius: 5px;
                    border-bottom-right-radius: 5px;
                }
                #menu a{
                    color: white;
                    padding: 5px;
                    text-decoration: none;
                    text-align: center;
                    right: 5px;

                }
                .h1{
                    font-family: arial;
                    width: 300px;
                    height: 50px;
                    padding-left: 10px;
                    font-size: 20px;
                    font-weight: bold;
                    text-align: justify;
                }
                .h2{
                    font-family: arial;
                    width: 700px;
                    height: 150px;
                    padding-left: 10px;
                    font-size: 18px;
                    text-align: justify;
                    padding-top: 5px;
                }
                #news-block-title {
                    font-size: 18px;
                    border-bottom: 1px solid #cd2122;
                    position: relative;
                    left: 300px;
                    font-size: 30px;
                    top: 50px;

                }
                p{
                    padding-top: 10px;
                    font-size: 16px;
                    font-weight: normal;
                }
                .a3{
                    font-size: 20px;
                    text-decoration: none;
                    font-style: bold;
                    color: black;
                    font-size: 20px;
                }
                .a3:hover{
                    color: #CD2122;
                }
                .tr{
                    margin: 0 0 30px;
                    overflow: hidden;
                    list-style-type: none;
                }
                
                table, td, th {
                    border: 1px solid black;
                }

            </style>
            <div align="center">
                <a href="">
                    <img src="ptit.jpg">
                </a>
            </div>
            <div id="menu">
                <a href="index.jsp">TRANG CHỦ</a>
                |
                <a id="url_dkmon" href="dangkymon.jsp" onclick="cickDK()">ĐĂNG KÝ MÔN HỌC</a>
                |
                <a href="thoikhoabieu.jsp">THỜI KHÓA BIỂU</a>
                |
                <a href="thongtin.jsp">THÔNG TIN CÁ NHÂN</a>
                -
                <a href="dangnhap.jsp">Đăng xuất</a>
            </div>
        </div>
        <div style="padding-top: 20px">
            <div align="center" style="font-weight: bold; font-size: 20px; color: black; margin: 5px">Đăng ký môn học</div>
            <div align="center">
                <style type="text/css">
                    #thongtin{
                        color: black;
                        margin: 30px;
                        font-weight: bold;
                    }
                </style>
                <div id="thongtin">

                </div>
            </div>

            <div style="position: relative; left: 50px">
                <span style="font-size: 20px">
                    <b>Danh sách học phần - Khoa: 
                    </b> 
                </span>
                <span style="font-size: 20px; position: relative; top: 10px">
                    <form action="dangky" method="post">
                        Tìm kiếm:
                        <input type="text" name="search" id="txtSearch">
                        <input type="submit" name="tim" id="btnSearch" value="Tìm kiếm">
                    </form>
                </span>

            <table id="dkMonTable" width="1250px" style="padding-top: 10px; padding-bottom: 10px; padding-left: 5px; padding-right: 5px; margin-top: 50px;">
                <tr style="height: 30px; width: 500px; text-align: center;background: #009AFF; color: white; align: center;">
                    <td style="width: 80px"><b>STT</b></td>
                    <td style="width: 100px" ><b>Mã MH</b></td>
                    <td style="width: 100px" ><b>Mã LH</b></td>
                    <td width="250px"><b>Tên MH</b></td>
                    <td width="50px"><b>Số TC</b></td>
                    <td style="width: 200px" ><b>Giảng viên</b></td>
                    <td width="100px"><b>Lớp học</b></td>
                    <td width="150px"><b>Thời gian học</b></td>
                    <td width="100px"><b>Số Lượng</b></td>
                    <td width="100px"><b>Còn Lại</b></td>
                    <td width="50px"><b>Chọn</b></td>
                </tr>
            </table>
            
        </div>
            
        
        <form style="display:none;" id="loginForm" action="thoikhoabieu" method="post">
            <input type="text" name="maLH" id="maLHSearch">
            <input type="submit" name="tim" id="btnSearch" value="Tìm kiếm">
        </form>
            
            <p id="rs" style="display:none;text-align: center;color: red; font-size: 40px;">${result}</p>
            <p id="demo" style="display:none;text-align: center;color: red; font-size: 40px;"></p>
            
            <script>
                function cickDK() {              
                    a = "OK";
                }
            </script>
        <script>
            
            var a;
            if(a != "")
                a = "${noticeDK}";
            if(a != "" && a != "OK")
            {
                alert(a);
                a = "";
            }
//            document.getElementById("notice").innerHTML = a;
            
            var result = "${resultDKM}";
            var res = result.split("<br>");
            document.getElementById("demo").innerHTML = res[0];
            
            var len = res.length-1;
            
            console.log("len: ", len);
            
            for(var i = 0;i < len;i++)
            {
                console.log(res[i]);
                var contents = res[i].split(";");
                console.log(contents.length);
                
                var maLH = contents[0];
                var maMH = contents[1];
                var tenMH = contents[2];
                var giangVien = contents[3];
                var soLuong = contents[4];
                var soTC = contents[5];
                var lopHoc = contents[6];
                var conLai = contents[7];
                var tGHoc = contents[8];
                
                console.log("maLH ", maLH);
                console.log("maMH ", maMH);
                console.log("tenMH ", tenMH);
                console.log("giangVien ", giangVien);
                console.log("soLuong ", soLuong);
                console.log("soTC ", soTC);
                console.log("lopHoc ", lopHoc);
                console.log("tGHoc ", tGHoc);
                console.log("conLai ", 5);
                
                
                var table = document.getElementById("dkMonTable");
                var row = table.insertRow(-1);
                row.style.align = "center";
                row.style.height = "30px";
                row.style.width = "500px";
                row.style.textAlign = "center";
                row.style.align = "center";
                row.style.color = "Navy";

                var btn = document.createElement("BUTTON");
                btn.textContent = 'Chọn';
                btn.style.paddingLeft = "5px";
                btn.style.paddingRight = "5px";

                var cellSTT = row.insertCell(0);
                var cellSLH = row.insertCell(1);
                var cellMaMH = row.insertCell(2);
                var cellTenMH = row.insertCell(3);
                var cellSoTC = row.insertCell(4);
                var cellGiangVien = row.insertCell(5);
                var cellLopHoc = row.insertCell(6);
                var cellTGHoc = row.insertCell(7);
                var cellSoLuong = row.insertCell(8);
                var cellConLai = row.insertCell(9);
                var cellChon = row.insertCell(10);

                cellSTT.innerHTML = i;
                cellSLH.innerHTML = maLH;
                cellMaMH.innerHTML = maMH;
                cellTenMH.innerHTML = tenMH;
                cellSoTC.innerHTML = soTC;
                cellGiangVien.innerHTML = giangVien;
                cellLopHoc.innerHTML = lopHoc;
                cellTGHoc.innerHTML = tGHoc;
                cellSoLuong.innerHTML = soLuong;
                cellConLai.innerHTML = conLai;
                cellChon.appendChild(btn);

                btn.onclick = function() {myFunction(this)};
            }
            
            function myFunction(r) {
                var i = r.parentNode.parentNode.rowIndex;
                var maInsert = document.getElementById("dkMonTable").rows[i].cells.item(1).innerHTML;
                console.log(maInsert);
                document.getElementById("maLHSearch").value = maInsert;
                document.getElementById("loginForm").submit();
            }
            
        </script>
    </body>
</html>