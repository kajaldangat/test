<html>
<head>

<script
src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js">
</script>
<script type="text/javascript">
var app = angular.module('postserviceApp', []);
app.controller('postserviceCtrl', function($scope, $http) {
	
//alert(1);
$scope.a="asasas";
$scope.IsHidden = true;
$scope.IsHidden1 = true;
$scope.textbox1='';
$scope.textbox2='';
$scope.textbox3='';
$scope.textbox4='';
$scope.textbox5='';
$scope.textbox6='';
$scope.textbox7='';
$scope.textbox8='';
$scope.textbox9='';
$scope.textbox10='';
$scope.textbox11='';
$scope.textbox12='';
$scope.textbox13='';
$scope.textbox14='';


$scope.getUser = function()
{
// var data = {}; 
//Call the services
$http({
method:'GET',
url:'http://localhost:8080/OvallayProject/Customer'
//data:data
}).then(function(successResponse) {
//alert("1234");
//alert(angular.toJson(successResponse.data));

if (successResponse.data)
$scope.msg = "Post Data Submitted Successfully!";
//console.log(successResponse);
$scope.list=successResponse.data.ulist;
console.log($scope.list);
}, function(errorResponse) {
alert(errorResponse);

$scope.msg = errorResponse.message;
$scope.statusval = errorResponse.status;
/* $scope.statustext = response.statusText;
$scope.headers = response.headers(); */
});

}
/* -------------------------------------------- */
 
 
 $scope.send = function(fName,lName,cust_address,zone,active,custType,email,street,state,shopType,city,deliveyBoy,contact)
{    console.log("in function");
// var data = {}; 
//Call the services
var data = {
				'fname':fName,
				 'lName':lName,
				 'custType':custType,
				 'email':email,
				 'street':street,
				 'state':state,
				 'shopType':shopType,
				 'city':city,
				 'deliveyBoy':deliveyBoy,
				'addreas':cust_address,
				'zone':zone,
				'active':active,
				'contact':contact,
			};
			
console.log(data);
		$http({
		method:'POST',
		url:'http://localhost:8080/OvallayProject/insertcustomer',
		data:data
		}).then(function(successResponse) {
		
		$scope.getUser();
		
		if (successResponse.data)
		
		$scope.list=successResponse.data.ulist;
		
		}, function(errorResponse) {
		alert(errorResponse);
		
		$scope.msg = errorResponse.message;
		$scope.statusval = errorResponse.status;
		/* $scope.statustext = response.statusText;
		$scope.headers = response.headers(); */
		});
		}

/* ----------------------------------------- */
 
 
 $scope.delete1 = function(data)
{
 var data =
	data.cust_id;
 console.log(data);
//Call the services
console.log(data);
$http({
method:'POST',
url:'http://localhost:8080/OvallayProject/deleteCustomer',
data:data
}).then(function(successResponse) {
//alert("1234");
$scope.getUser();
}, function(errorResponse) {
alert(errorResponse);
});

}
/* ------------------------------------------------ */
 
 
 
 $scope.update = function(data)
{
	 $scope.textbox13=data.cust_id;
	 $scope.textbox1=data.fName;
	 $scope.textbox2=data.lName;
	 $scope.textbox3=data.cust_address;
	 $scope.textbox4=data.zone;
	 $scope.textbox5=data.active;
	 $scope.textbox6=data.custType;

	 $scope.textbox7=data.email;

	 $scope.textbox8=data.state;

	 $scope.textbox9=data.shopType;
	 $scope.textbox10=data.city;
	 $scope.textbox11=data.deliveyBoy;
	 $scope.textbox12=data.contact;
	 $scope.textbox14=data.street;





	
}

 /* ------------------------------------------------ */
 
 
$scope.update1 = function(textbox1,textbox2,textbox3,textbox4,textbox5,textbox6,textbox7,textbox8,textbox9,textbox10,textbox11,textbox12,textbox14)
{
 var data ={
		  'id':$scope.textbox13, 
		 'fname':textbox1,
		 'lName':textbox2,
		 'cust_address':textbox3,
		  'zone':textbox4,
		  'active':textbox5,
		  'custType':textbox6,
		  'email':textbox7,
		  'state':textbox8,
		  'shopType':textbox9,
		  'city':textbox10,
		'deliveyBoy':textbox11,
		  'contact' : textbox12,
		  'street':textbox14	  
 };
 

//Call the services
console.log(data); 
$http({
method:'POST',
url:'http://localhost:8080/OvallayProject/updateCustomer',
data:data
}).then(function(successResponse) {
//alert("1234");
$scope.getUser();	
}, function(errorResponse) {
alert(errorResponse);
});
}
 
 /* -------------------------------------------------------------- */ 
  $scope.ShowHide = function () {
	                //If DIV is hidden it will be visible and vice versa.
	                $scope.IsHidden = $scope.IsHidden ? false : true;
}

 
 /* ------------------------ */  
 $scope.ShowHide1 = function (data) {
	                //If DIV is hidden it will be visible and vice versa.
	                $scope.IsHidden1 = $scope.IsHidden1 ? false : true;
	             $scope.textbox13=data.cust_id;
	           	 $scope.textbox1=data.fName;
	           	 $scope.textbox2=data.lName;
	           	 $scope.textbox3=data.cust_address;
	           	 $scope.textbox4=data.zone;
	           	 $scope.textbox5=data.active;
	           	 $scope.textbox6=data.custType;
				 $scope.textbox7=data.email;
                 $scope.textbox8=data.state;
                 $scope.textbox9=data.shopType;
	           	 $scope.textbox10=data.city;
	           	 $scope.textbox11=data.deliveyBoy;
	           	 $scope.textbox12=data.contact;
	           	 $scope.textbox14=data.street;
console.log($scope.textbox14);
	           	 

}
});
</script>
</head>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
<body>
<h2>Hello World!</h2>

<div ng-app="postserviceApp" ng-controller="postserviceCtrl">
<input type="button" ng-click="getUser()" value="Display User">
<input type="button" ng-click="ShowHide()" value="New User">




<table border="1">
			<tr><td>customer id</td><td>fName</td><td>lName</td><td>address</td><td>zone</td><td>is active</td><td>customer type</td><td>email</td><td>state</td>
			<td>shop type</td><td>city</td><td>delivery boy</td><td>contact</td><td>street</td><td>edit</td><td>delete</td></tr>
			
				<tr ng-repeat="data in list">
					<td><button ng-click="a()">{{data.cust_id}}</button></td>
					<td>{{data.fName}}</td>
					<td>{{data.lName}}</td>
					<td>{{data.cust_address}}</td>
					<td>{{data.zone}}</td>
					<td>{{data.active}}</td>
					
					<td>{{data.custType}}</td>
					
					<td>{{data.email}}</td>
					
					<td>{{data.state}}</td>
					
					<td>{{data.shopType}}</td>
					
					<td>{{data.city}}</td>
					
					<td>{{data.deliveyBoy}}</td>
					
					<td>{{data.contact}}</td>
					
						<td>{{data.street}}</td>
					
					
					 
					
					<td><input type="button" value="update"
					ng-click="ShowHide1(data)" /></td>
					<td><input type="button" value="delete"
					ng-click="delete1(data)" /></td>
			
				</tr>
			</table>
			<br>
			<br>
			<br>
			<br>
			
			<div>
			Enter first name:<input type="text" ng-model="fName"><br>
		    Enter last name:<input type="text" ng-model="lName"><br>
			Enter address:<input type="text" ng-model="cust_address"><br>
			Enter zone:<input type="text" ng-model="zone"><br>
			Enter isActive:<input type="text" ng-model="active"><br>
			Enter customer type:<input type="text" ng-model="custType"><br>
			Enter email:<input type="text" ng-model="email"><br>
			Enter street:<input type="text" ng-model="street"><br>
			Enter state:<input type="text" ng-model="state"><br>
			Enter shop type:<input type="text" ng-model="shopType"><br>
			Enter city:<input type="text" ng-model="city"><br>
			Enter deliveyBoy:<input type="text" ng-model="deliveyBoy"><br>
			Enter contact:<input type="text" ng-model="contact"><br>
			<input type="button" ng-click="send(fName,lName,cust_address,zone,active,custType,email,street,state,shopType,city,deliveyBoy,contact)" value="submittttt"> <br>
			</div>
			<br><br><br><br>
			
			
			<div ng-hide = "IsHidden1">
			
			first name:<input type="text" ng-model='textbox1' name='textbox1'/><br>
			last name:<input type="text" ng-model='textbox2' name='textbox2'/><br>
			address:<input type="text" ng-model='textbox3' name='textbox3'/><br>
			zone:<input type="text" ng-model='textbox4' name='textbox4'/><br>
			isActive:<input type="text" ng-model='textbox5' name='textbox5'/><br>
			customer type:<input type="text" ng-model='textbox6' name='textbox6'/><br>
			email:<input type="text" ng-model='textbox7' name='textbox7'/><br>
			state:<input type="text" ng-model='textbox8' name='textbox8'/><br>
			shop type:<input type="text" ng-model='textbox9' name='textbox9'/><br>
			city:<input type="text" ng-model='textbox10' name='textbox10'/><br>
			deliveyBoy:<input type="text" ng-model='textbox11' name='textbox11'/><br>
			contact:<input type="text" ng-model='textbox12' name='textbox12'/><br>
			street:<input type="text" ng-model='textbox14' name='textbox14'/><br>
			
			
		
			<input type="button" ng-click="update1(textbox1,textbox2,textbox3,textbox4,textbox5,textbox6,textbox7,textbox8,textbox9,textbox10,textbox11,textbox12,textbox14)" value="submiyyyy"> <br>
			</div>
			
			<!-- <div>
				street:<input type="text" ng
				
			</div> -->
			
			
			
			
			
			
</div>
</body>

</html>
