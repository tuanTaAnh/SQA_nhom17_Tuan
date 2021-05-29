<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="controller.login" %>
<!DOCTYPE html>
<html>
    <head>
        <!--     <link rel="stylesheet" href="css/qlbh.css" /> -->
        <title>Tranng chủ</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    </head>
    <body>
        <div>
            <style type="text/css">
                * {
                    margin: 0;
                    padding: 0;
                }
                
                body{
                    font-family: calibri;
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

                .profile-main{
                  width: 750px;
                  margin: 0 auto;
                  border: 1px solid #aed5e2;
                  padding-bottom: 10px;
                }
                .profile-header{
                  height: 300px;
                  width: 100%;
                  background-color: #EBF6FA;
                  border-bottom: 2px solid #E2F3FB;
                }
                .user-detail{
                  position: relative;
                  width: 75%;
                  margin: 0 auto;
                  height: 100%;
                }
                .user-image{
                  padding: 50px 0;
                  float: left;
                  position: relative;
                  width: 23%;
                  height: 135px;
                }
                .user-image img{
                  width: 100%;
                  height: 100%;
                  border-radius: 50%;
                  margin-top: 35px;
                }
                .prof-label{
                  position: absolute;
                  background: #8C13A0;
                  color: #fff;
                  padding: 9px 4px;
                  border-radius: 50%;
                  top: 155px;
                  left: 42px;
                  font-size: 12px;
                }
                .user-data{
                  padding: 50px 0;
                  float: left;
                  width: 70%;
                  padding-left: 27px;
                  margin-bottom: 20px;
                }
                .user-data h2{ 
                  margin-bottom: 0px;
                  margin-top: 35px;
                  font-size: 20px;
                  font-weight: 600;
                }
                .user-data .post-label{
                  font-size: 10px;
                  border: 1px solid #C3CECB;
                  padding: 0px 4px;
                  border-radius: 4px;
                  background: #F3F5F5;
                  margin-right: 5px;
                }
                .user-data .post-label:hover{
                  background-color: #F8EDE7;
                  border-color: #F2D4BA;
                }
                .user-data p{
                  font-size: 12px;
                  color: #404040;
                }
                .social-icons{
                  padding: 50px 0;
                  float: right;
                  width: 25%;
                  text-align: right;
                }
                .social-icons i{
                  margin-top: 35px;
                  margin-bottom: 15px;
                  color: #fff;
                  padding: 5px 5px 1px 0px;
                  border-radius: 50%;
                  font-size: 11px;
                  margin-right: 2px;
                  height: 14px;
                  width: 14px;
                }
                .social-icons .fa-facebook{
                  background-color: #365597;
                }
                .social-icons .fa-twitter{
                  background-color: #01B0F4;
                }
                .social-icons .fa-linkedin{
                  background-color: #0F80BB;
                }
                .social-icons .fa-google{
                  background-color: #D53B1F;
                }
                .social-icons .fa-instagram{
                  background-color: #CF3594;
                }
                .msg-btn{ 
                  background: #fff;
                  padding: 5px 11px;
                  color: black;
                  text-decoration: none;
                  font-size: 13px;
                }
                .msg-btn i{ 
                  padding: 0;
                  color: black;
                  margin-right: 7px;
                }


                ul.tabs{
                  margin: 0px;
                  padding: 0px;
                  list-style: none;
                  display: flex;
                  position: absolute;
                  top: 207px;
                  right: 400px;
                }
                ul.tabs li{
                  color: #222;
                  display: inline-block;
                  padding: 10px 15px;
                  border-right: 1px solid #E2F3FB;
                  border-top: 2px solid #E2F3FB;
                  cursor: pointer;
                  background: #FAFBFB;
                }
                ul.tabs li:last-child{
                  border-right: 2px solid #E2F3FB;
                }
                ul.tabs li:first-child{
                  border-left: 2px solid #E2F3FB;
                }
                ul.tabs li.current{
                  background: #10A3FF;
                  color: #fff;
                  font-weight: 600;
                }
                .tab-content{
                  display: none;
                  padding: 15px 5px;
                }
                .tab-content.current{
                  display: inherit;
                }
                
                #footer {
                    background: orange;
                    bottom: 0px;
                    width:100vw;
                    margin-bottom:0;

                }

                @media (min-width: 320px) and (max-width: 640px){
                  .profile-main{
                    width: 100%;
                  }
                  .user-detail{
                    width: 95%;
                  }
                  .user-image {
                    width: 50%;
                    height: 100px;
                  }
                  .user-data{
                    width: 70%;
                    margin-bottom: 27px;
                  }
                  .social-icons{
                    width: 90%;
                    float: left;
                  }
                  .social-icons i{
                    margin-top: 0px;
                  }
                  .msg-btn{
                    float: left;
                    height: 18px;
                    margin-right: 10px;
                  }
                  ul.tabs{
                    width: 97%;
                    font-size: 13.5px;
                    right: 0px;
                    top: 261px;
                    left: 7px;
                  }
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
        
        <div style="margin-top: 100px; margin-bottom: 100px;" class="profile-main">
		<div style="margin-top: 50px; margin-bottom: 50px;" class="profile-header">
			<div class="user-detail">
				<div class="user-image">
					<img src="http://nicesnippets.com/demo/up-profile.jpg">
				</div> 
				<div class="user-data">
					<h2><i class="fas fa-user-circle" aria-hidden="true" style='font-size:24px'></i>  ${user}</h2>
					<p style="margin-top: 8px;font-size: 15px;">
                                            <i class="fas fa-school" aria-hidden="true"></i>  ${university}
					</p>
                                        <p style="margin-top: 8px;font-size: 15px;">
                                            <i class="fa fa-map-marker" aria-hidden="true"></i>  ${address}
                                        </p>
                                        <p style="margin-top: 8px; font-size: 15px;">
                                            <i class="fas fa-graduation-cap" aria-hidden="true"></i>  ${major}
                                        </p>
				</div> 
			</div>
				
		</div>
                                        
		<div style="clear: both;"></div>
	</div>

    </body>
</html>