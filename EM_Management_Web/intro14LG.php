	<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="UTF-8">
	<title>Embedded Management</title>
	
	<link rel="stylesheet" type="text/css" href="styleanhdong.css">
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<link rel="stylesheet" type="text/css" href="stylethanhvien.css">
	<link rel="stylesheet" type="text/css" href="stylemuon.css">
	<link rel="stylesheet" type="text/css" href="stylelogin.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		.tim{
		margin-left: 400px;
		margin-top: 10px;
			
		}
		.but{
			float: right;
			width: 100px;
			height: 100px;
			margin-right: 43%;
		}
	</style>
	<style>
	.dropbtn1 {
    background-color: #014590;
    color: white;
    padding: 3px;
    font-size: 14px;
    border: 0;
    cursor: pointer;
	margin-top: 49px;
	margin-right: -5px;
}
	</style>
</head>
<body>
	<?php
	include('connection.php');
	
	?>
	<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>
	<script>
	function myFunction() {
		document.getElementById("myDropdown").classList.toggle("show");
	}
	window.onclick = function(event) {
	  if (!event.target.matches('.dropbtn')) {

		var dropdowns = document.getElementsByClassName("dropdown-content");
		var i;
		for (i = 0; i < dropdowns.length; i++) {
		  var openDropdown = dropdowns[i];
		  if (openDropdown.classList.contains('show')) {
			openDropdown.classList.remove('show');
		  }
		}
	  }
	}
	</script>
	<div class="main">
		
		<div class="head1">
		<?php echo '<img src='.$local.'/image/Logo.png width="199" height="110"/>';?>
		</div>
		<div class="head2">
		
			<div class="tim">
			<div class="container" >			  
			  <form method="post"><div class="input-group">
			 <input type="text" size="45"  placeholder="Search">
			  		
				
				  </div>
			  </form>
			</div>	
			
			</div>
			
			<div class="dangnhap">
			
			<div class="dropdown"  ><form method="post"  >
			<button  name="dangxuat" >Đăng xuất [<?php
					if(isset($_REQUEST['User_ID']))
				$name=$_REQUEST['User_ID'];
				echo ''.$name;
				?>]</button>
				<?php if(isset($_REQUEST['dangxuat'])){
					header('location:index.php');}?>	
					</form>				
			</div> 
			</div>
			
	
		</div>
		<div class="abc">
		<div class="congcu">
			<div class="maunen">
			<div class="dropdown"  ><form method="post" >
				<button class="dropbtn" name="trangchu" >Trang chủ</button>
				<?php if(isset($_REQUEST['trangchu'])){
					header('location: indexLG.php?User_ID='.$name.'');}?>	
					</form>				
			</div> 
			
			</div>
			<div class="ABCDE">
			<div class="chuchay">
					<td><marquee width="100%">N8Plus sẽ nghỉ Lễ vào 3 ngày 30/4, 1/5 và 2/5, kính chúc Quý Khách 1 kỳ nghỉ Lễ vui vẻ !!! >>>>></marquee></td>	
			</div>	</div>
			</div>	
				
					
		<div class="body">
			
		<div class="ABCD"><h4>&emsp;Chi tiết sản phẩm</h4></div>
		
			<table>
				<tr>
					<td><div class="hinhlon"><?php
									
					include('connection.php');		
					$imgID = 14;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="280" height="280"/>';
					} 
					
					?></div></td>
					<td colspan="2"><div class="hinhlon1">
						<center><h2><?php
					
					
					
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						
						while ($row=mysqli_fetch_array($result)){
							echo"<table><tr>
								
								<td>".$row['Device_Name']."</td>
								
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?></h2></center>
						<hr>
						<div class="table1">
						<left>
						<?php					
						include('connection.php');
						$sql="select * from device where Device_ID='".$imgID."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Nhà sản xuất:</b></td>
									<td> &emsp;".$row['Manufacturer']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
						?>	
						
						<?php					
						include('connection.php');
						$sql="select * from device where Device_ID='".$imgID."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Tình trạng:</b></td>
									<td> &emsp;&emsp;".$row['State']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
						?>	
						<?php					
						include('connection.php');
						$sql="select * from device where Device_ID='".$imgID."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Loại thiết bị:</b></td>
									<td> &emsp;".$row['Category']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
						?>
								
						
  							<div class="but"><button onclick="document.getElementById('id01').style.display='block' "  name="muon" >Mượn</button></div>
					</div></td>
				</tr>
				<tr>
					<td colspan="3"><div class="hinhlon2">
					
					<?php					
					include('connection.php');
						
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						echo"<hr><table>
						<tr>						
							<td><h2>Mô tả tổng quan</h2></td>
						</tr>";
						while ($row=mysqli_fetch_array($result)){
							echo"<tr>							
								<td>".$row['Details_Decribe']."</td>		
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?>	
					<?php					
					include('connection.php');
					$sql="select * from device where Device_ID='".$imgID."'";
					$result =$conn->query($sql);
					if($result->num_rows>0){
						echo"<hr><table>
						<tr>						
							<td><h2>Thông số kĩ thuật</h2></td>
						</tr>";
						while ($row=mysqli_fetch_array($result)){
							echo"<tr>							
								<td>".$row['Specification']."</td>		
							</tr>";
						}echo"</table>";
					}else{
						echo "0 result";
					}
					mysqli_close($conn);
			
					?>							
					</div>
				</tr>
			</table>
			<div id="id01" class="modal">
			  <form class="modal-content animate" method="post"   action="<?php echo"dkmuonthietbi.php?User_ID=".$name."&STT=".$imgID." "; ?>">
				<div class="container12">
				  <?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<h4><b>Xác nhận thông tin</b></h4><table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Họ và Tên:</b></td>
									<td> &emsp;".$row['User_Name']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
						 
						<?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Ngày sinh:</b></td>
									<td> &emsp;".$row['Birthday']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
						<?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Giới tính:</b></td>
									<td> &emsp;".$row['Sex']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
						<?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Số chứng minh nhân dân:</b></td>
									<td> &emsp;".$row['IDCard']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
						<?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Số điện thoại:</b></td>
									<td> &emsp;".$row['Phone']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
						<?php
						if(isset($_REQUEST['User_ID'])){
						$user = $_REQUEST['User_ID'];
						include('connection.php');
						$sql="select * from user_info where User_ID ='".$user."'";
						$result =$conn->query($sql);
						if($result->num_rows>0){
							echo"<table>
							";
							while ($row=mysqli_fetch_array($result)){
								echo"<tr>		
									<td><b>Email:</b></td>
									<td> &emsp;".$row['Email']."</td>		
								</tr>";
							}echo"</table>";
						}else{
							echo "0 result";
						}
						mysqli_close($conn);
							}
						?>	
				  		<table><tr><td><b>Ngày Trả: &emsp;</b></td><td><input type="date" name="ngaytra" min="<?php echo ''.date("Y-m-d");?>"></td></tr></table>
							<br/>
						<table><tr><td><b>Tên dự án: &emsp;</b></td><td>
							<?php
							
								include('connection.php');
								$sql = 'select * from project where User_ID="'.$name.'"';
								$result = $conn->query($sql);
								if($result->num_rows>0){
									echo'<select name="duan">';
									while ($row=mysqli_fetch_array($result)){
										echo" <option value=".$row['Project_Name'].">".$row['Project_Name']."</option>";
									}echo"		</select>";
								}
								mysqli_close($conn);
							?>
						</td></tr></table>
						</left>	</div>	
						<table><tr><td colspan="2"><input type="number" name="points" min="1" max="10" placeholder="Số Lượng"></td></tr></table>	<br/><br/>
				  		<button type="submit" name="submit1" >Submit</button>

				<br/><br/>
			 <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			 </div>
			  </form>
			
			<br/>
			<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><hr>
			<h2>&emsp;Thiết bị phổ biến</h2>
			<center><table>
				<tr>
					<td><div class="hinhnhonho"><a href="intro1.php"><?php
									
					include('connection.php');		
					$imgID = 1;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro2.php"><?php
									
					include('connection.php');		
					$imgID = 2;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro4.php"><?php
									
					include('connection.php');		
					$imgID = 4;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro10.php"><?php
									
					include('connection.php');		
					$imgID = 10;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
					<td><div class="hinhnhonho"><a href="intro11.php"><?php
									
					include('connection.php');		
					$imgID = 11;
					$sql = "SELECT * FROM device_image WHERE Device_ID=" . $imgID;
					$result = $conn->query($sql);
					if ( $result->num_rows  < 1 ) {
					} else {
						$row = mysqli_fetch_assoc($result);
						$imgData ="".$local."".$row['Image_Url']."";
						
						echo '<img src='.$imgData.' width="190" height="190"/>';
					} 
					mysqli_close($conn);
					?></a></div></td>
				</tr>
			</table>	</center>	
		
		
		</div>
		</div>
		<div class="ass">
			
			<center>
			<br/>
			© Copyright - N8+<br/>
			<a href="https://www.facebook.com/groups/n8plus/">https://www.facebook.com/groups/n8plus/</a>
			</center>
			
		</div>

</body>
</html>
			
		
	
