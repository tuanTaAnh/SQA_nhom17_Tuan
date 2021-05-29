<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="controller.login" %>
<!DOCTYPE html>
<html>
    <head>
        <!--     <link rel="stylesheet" href="css/qlbh.css" /> -->
        <title>Tranng chủ</title>
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
        <div style="margin-bottom: 100px;">
            <br><br>
            <h1 style="color: blue; padding-left: 150px; font-size: 20"><strong>Thông tin chung</strong></h1>
            <div align="left" style="padding-top: 20px; padding-left: 20px">
                <div style="padding-left: 150px; padding-right: 150px; font-size: 20px">

                    Ngày 18/03/2021:<br>

                    THÔNG BÁO V/v: Hướng dẫn đăng ký chuyên ngành trên hệ thống qldt.ptit.edu.vn cho sinh viên khóa 2018 các ngành: Quản trị kinh doanh; Công nghệ thông tin; MarketingTin tức mới cập nhật (18/03/2021)

                    <br>Thực hiện theo thông báo về việc tổ chức cho sinh viên khóa 2018 các ngành CNTT, QTKD, MR đăng ký chuyên ngành học, Phòng giáo vụ hướng dẫn cụ thể thao tác đăng ký trên hệ thống như sau:

                    <br><strong>1. Thời gian, thao tác thực hiên:</strong>
                    <br>-  Từ 8h ngày 22/03 đến 17h ngày 26/03/2021

                    <br>-  Sinh viên đăng nhập hệ thống -> mục ĐĂNG KÝ MÔN HỌC  -> kéo xuống cuối trang màn hình, tại ô Mã CHUYÊN NGÀNH, sinh viên nhập Mã chuyên ngành muốn đăng ký  (danh mục mã chuyên ngành xem tại mục 2)

                    <br><strong>2. Danh mục mã chuyên ngành:</strong>
                    <br>-  Ngành Công nghệ thông tin: chuyên ngành Công nghệ phần mềm (mã: CNPM), chuyên ngành Hệ thống thông tin (mã: HTTT)

                    <br>-  Ngành Quản trị kinh doanh: chuyên ngành Quản trị doanh nghiệp (mã: QTDN), chuyên ngành Thương mại điện tử (mã: TMDT)

                    <br>-  Ngành Marketing: chuyên ngành Internet Marketing (mã: IMR), chuyên ngành Phân tích dữ liệu marketing số (mã: PMR)

                    <br><strong>3. Lưu ý:</strong>
                    <br>-  Sinh viên chỉ được đăng ký một chuyên ngành duy nhât.

                    <br>-  Sinh viên muốn đổi đăng ký sang chuyên ngành khác phải thực hiện việc xóa chuyên ngành đã đăng ký trước đó trên hệ thống (Sinh viên vào mục XEM ĐĂNG KÝ tại phần ĐĂNG KÝ NGUYỆN VỌNG để thực hiện thao tác XÓA)

                    <br>-  Các trường hợp sinh viên không đăng ký chuyên ngành, đăng ký cả 2 chuyên ngành hoặc đăng ký sai chuyên ngành học đều phải học chuyên ngành theo sự sắp xếp của Học viện.

                    <br><strong>Trân trọng thông báo!</strong>
                </div>
            </div>
        </div>
        
        <p id="myText" style=" display: none;text-align: center;color: red;font-size: 400px;">${checkDangNhap}</p>
        
        <script>
            var x = document.getElementById("myText").innerHTML;
            if(x == "")
            {
                window.location.href = 'dangnhap.jsp';
            }
        </script>
    </body>
</html>