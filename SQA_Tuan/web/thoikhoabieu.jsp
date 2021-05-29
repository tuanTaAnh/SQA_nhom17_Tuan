<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--     <link rel="stylesheet" href="css/qlbh.css" /> -->
        <title>Thời khóa biểu</title>
    </head>
    <body>
        <div>
            <style type="text/css">
                * {
                    margin: 0;
                    padding: 0;
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
                .td{
                    padding-left: 10px;
                }

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
                .savebutton {
                    justify-content: center;
                    background-color: blue;
                    border: none;
                    color: white;
                    padding: 15px 32px;
                    text-align: center;
                    text-decoration: none;
                    font-size: 16px;
                    margin: 4px 2px;
                    cursor: pointer;
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
                <a href="dangkymon.jsp">ĐĂNG KÝ MÔN HỌC</a>
                |
                <a href="thoikhoabieu.jsp">THỜI KHÓA BIỂU</a>
                |
                <a href="thongtin.jsp">THÔNG TIN CÁ NHÂN</a>
                -
                <a href="dangnhap.jsp">Đăng xuất</a>
            </div>
        </div>
        <div style="padding-top: 40px">
            <div align="center" style="font-weight: bold; font-size: 20px; color: black; margin: 5px">Thời khóa biểu</div>
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
            <div>
                <div >
                    <style type="text/css">
                        #them{
                            color: black;
                            position: relative;
                            left: 50px;
                        }
                    </style>




                </div>
            </div>
            
            <div style="position: relative;left: 5px"> 
                <div align="center">
                    <table id="dkMonTable" align="center" width="100%" style=" border: 1px;border-color:black;  width: 1300px;">
                        <tbody>
                            <tr align="center" style="height: 30px; width: 100px; text-align: center;background: #009AFF; color: white;">
                                <td><b>STT</b></td>
                                <td style="width: 100px"><b>Mã Lớp Học</b></td>
                                <td style="width: 300px" ><b>Môn học</b></td>
                                <td ><b>Giảng Viên</b></td>
                                <td style="width: 100px" ><b>Số tín chỉ</b></td>
                                <td ><b>Lop hoc</b></td>
                                <td ><b>Thoi Gian hoc</b></td>
                                <td ><b>Xóa</b></td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>
            </div>
            
            
        </div>
        
        </div>
        
        
        <div align="center" style="padding-top: 150px; font-weight: bold; font-size: 20px; color: black; margin: 5px">
            <form id="SaveTKBForm" action="savethoikhoabieu" method="post">
                <input class="savebutton" type="submit" value="SAVE">
            </form>   
            <p id="saveTKBNotice">${noticeSaveTKB}</p>
        </div>
        
        
        
        <p id="deleteDemo"></p>
        
        <form style="display:none;" id="deleteTKBForm" action="delete" method="post">
            <input type="text" name="maLHDelete" id="maLHDelete">
            <input type="submit" name="tim" id="btnSearch" value="Tìm kiếm">
        </form>
        
        <script>
            
            var result = "${resultTKB}";
            var res = result.split("<br>");
//            document.getElementById("demo").innerHTML = res[0];
            
            var len = res.length-1;
            console.log(len);
            
            for(var i = 1;i < len;i++)
            {
                var contents = res[i].split(";");
                
                var maLH = contents[0];
                var tenMH = contents[2];
                var giangVien = contents[3];
                var soTC = contents[4];
                var lopHoc = contents[5];
                var thoiGianHoc = contents[6];
                
                
                var table = document.getElementById("dkMonTable");
                var row = table.insertRow(-1);
                row.style.align = "center";
                row.style.height = "30px";
                row.style.width = "500px";
                row.style.textAlign = "center";
                row.style.align = "center";
                row.style.color = "Navy";

                var btn = document.createElement("BUTTON");
                btn.textContent = 'Xóa';
                btn.style.paddingLeft = "5px";
                btn.style.paddingRight = "5px";

                var cellSTT = row.insertCell(0);
                var cellMaMH = row.insertCell(1);
                var cellTenMH = row.insertCell(2);
                var cellGiangVien = row.insertCell(3);
                var cellSoTC = row.insertCell(4);
                var cellLopHoc = row.insertCell(5);
                var cellTGHoc = row.insertCell(6);
                var cellXoa = row.insertCell(7);


                cellSTT.innerHTML = i;
                cellMaMH.innerHTML = maLH;
                cellTenMH.innerHTML = tenMH;
                cellGiangVien.innerHTML = giangVien;
                cellSoTC.innerHTML = soTC;
                cellLopHoc.innerHTML = lopHoc;
                cellTGHoc.innerHTML = thoiGianHoc;
                cellXoa.appendChild(btn);
                
                console.log(maLH);
                btn.onclick = function() {myFunction(this, maLH)};
            }
            document.getElementById("deleteDemo").innerHTML = "${resultDELETE}";
            
            function myFunction(r, m) {
                var i = r.parentNode.parentNode.rowIndex;
                var maDelete = document.getElementById("dkMonTable").rows[i].cells.item(1).innerHTML;
                console.log(maDelete);
                console.log(i);
                document.getElementById("maLHDelete").value = maDelete;
                document.getElementById("deleteTKBForm").submit();
            }
            
//            function myFunction(r) {
//                var i = r.parentNode.parentNode.rowIndex;
//                document.getElementById("dkMonTable").deleteRow(i);
//                document.getElementById("deleteTKBForm").submit();
//                
//            }
        </script>

    </body>
</html>