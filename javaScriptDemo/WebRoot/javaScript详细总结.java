一、简介
	输出方式：
		alert("dsdsfd");
		console.log("sads");
		
	判断当前变量是什么数据类型
		alert(typeof a);
	
	a标签
		<a href="#">dianji</a>:点击时会跳转，只不过是跳转到本页
		<a href="javascript:void(0);">dianji</a>：点击时没有任何反映
	
	1、javascript是什么
		简称js
		是基于对象模型和事件驱动的脚本语言。可以嵌入大html中
	
	2、特点
		(1) 交互性
		(2) 安全性：js不能访问本地磁盘(如果可以访问磁盘的本地的资料会泄漏)
		(3) 跨平台性：所有的浏览器都内置js解析器
	
	3、js作用？
		(1) js可以动态的修改（增删）html及css的代码
		(2) js可以动态的校验数据
	
	4、js的历史及组成？
		是王鼎公司的
		组成：
			ECMAScript(是当时的一个标准)  
			
			BOM(浏览器对象模型) 
			
			DOM(文档对象模型)
	
	5、js的引入方式(产生关系)
		5.1、内嵌脚本
			<input type="button" value="button" onclick="alert('xxx')"/>
		
		5.2、内部脚本
			<input id="btn" type="button" value="button"/>
			
			注意：要在head标签或body标签下面写
			<script type="text/javascript">
				document.getElementById("btn").onclick=function(){
					alert("xxxxx");
				};
			</script>
		
		5.3、外部脚本
			(1) 创建一个.js外部文件
				 window.onload = function(){
					 document.getElementById("btn").onclick=function(){
						alert("xxxxx");
					 };
				 };
			
			(2) 在页面的head标签中引入外部js文件
				<script type="text/javascript" src="my.js"></script>
			
			(3) 页面内容
				<input id="btn" type="button" value="button"/>
		
		5.4、js代码写在社么位置？
			js代码写在哪都可以，但是在不影响html功能情况下 越晚加载越好

二、基本语法
	1、变量
		java中: 
			int x = 5;  String str = "xxx" 
			
		js中: 
			var x = 5； var str = "xxx"
		
		直接写变量等于也行：			
			x = "nihao";
			x=boolean;
			x = 5;
	
	2、原始类型
		number：数字类型
		
		boolean：布尔类型
		
		string：字符串类型

		undefined：未定义
		
		null：空；类型
		
		例如：
			<script type="text/javascript">
				var a = 5;/* number */
				a="4";/* string */
				a=true;/* boolean */
				a=null;/* object */
				
				/* typeof判断当前是什么类型 */
				alert(typeof a);
			</script>
	
	3、数据类型转换
		注意：
			原始类型都是伪对象(也可叫方法) 所以是可以调用方法的
		3.1、number和boolean转成string
			方法：
				toString();
			例如：
				var a = 3；
				alert(typeof a.toString());
		
		3.2、string转成number
			方法：
				parseInt()
				parseFloat()
			例如：
				var a = "6";
				alert(typeof parseInt(a));
		3.3、强制转换
			方法：
				Boolean(value):强转成boolean
			例如：
				var a = 1;
				alert(typeof Boolean(a));	
			注意：
				强制转换时非零是true，否则false(包括正负数)

	4、引用类型
		java中： 
			Object obj = new Object();
		js中:
			var obj = new Object();
			alert(obj);//结果是object类型
	
	5、运算符
		5.1、赋值运算符
			 var x = 5;
		
		5.2、判断运算符 
			> 、 <  、  >=   、 <=  、 !=(在js中是<>)、   ==   
			===(也叫全等，代表值与类型都一致)
				例如：
					var a = "2";
					var b = 2;
					alert(a==b);//true
					alert(a===b);//flase
		
		5.3、算数运算符 
			+ - × / %  
		                        加号元算时：
		                                    如果一个加数是字符串的话 就进行字符串连接
		     	 其他元算时：
		     	 	如果是字符串数字在进行类似减法的运算的时候 先把字符串转换成数字然后在运算
		
		5.4、逻辑运算符
			&&(js中没有单的)  ||  ！
		
		5.4、void运算符
			<a href="javascript:void(0);">dianji</a>
			
		5.6、类型运算符
			typeof:判断数据类型
		
			instanceof ： 预测数据类型
				例如：
					var obj = new Object();
					alert(obj instanceof Object);//true
					alert(obj instanceof number);//flase
				
	6、逻辑语句
		 6.1、if else语句
			例如：
				<script type="text/javascript">
					var a = 8;
					var b = 5;
					var c= "hello";
					/* if(a>b){ //dayu*/
					/* if(c){ //dayu*/
					/* if(""){//xiaoyu */
					if("    "){//dayu
						alert("dayu");
					}else{
						alert("xiaoyu");
					}
				</script>
		
		6.2、switch语句
			例如：
				<script type="text/javascript">
					var a = "java";
					switch(a){
						case "html":
							alert("html");
							break;
						case "java":
							alert("java");
							break;
						case "php":
							alert("php");
							break;
						default:
							alert("xxxx");
					}
				</script>

		6.3、for循环
			例如：
				<script type="text/javascript">
					var a = 5;
					for(var i=0;i<a;i++){
						alert(i);
					}
				</script>

		6.4、forin循环
			例如：
				<script type="text/javascript">
					var a = [1,2,3,'java'];
					for(v in a){
						/* alert(v);//输出索引 */
						alert(a[v]);//输出索引对应的内容
					}
				</script>

三、js内置对象
	1、Number对象
		创建方式：
			var myNum=new Number(value);
			var myNum=Number(value);
			
		常用方法：
			toString():把数字转换为字符串，使用指定的基数。
			valueOf():返回一个 Number 对象的基本数字值。
		
		例如：
			var boolean = new Boolean(true);
			
			alert(typeof boolean);//Object
			alert(typeof boolean.toString());//string
			alert(typeof boolean.valueOf());//boolean
		
	2、Boolean对象
		创建方式：
			var bool = new Boolean(value); 
			var bool = Boolean(value);
		
		常用方法：
			toString():把逻辑值转换为字符串，并返回结果。
			valueOf():返回 Boolean 对象的原始值。

		例如：
			var number = new Number(10);
			
			alert(typeof number);//Object
			alert(typeof number.toString());//string
			alert(typeof number.valueOf());//number 

	3、String对象
		创建方式：
			var str = new String(s);
			var str = String(s);
		
		属性：
			length:字符串的长度
			
		常用方法：
			indexOf("s"):查找指定字符第一次出现的索引位置
			
			lastIndexOf("s"):查找指定字符最后一次出现的索引位置
			
			split("."):按指定字符把字符串分割为字符串数组。
			
			substring(1,3):截取字符串中两个指定的索引号之间的字符。包括头不包括尾
			
			substr(1,3):从起始索引号截取字符串中指定数目的字符。
			
			toUpperCase():把字符串转换为大写。
			
		例如：
			<script type="text/javascript">
				var string = new String("HelloJava");
				alert(string.length);//9
				alert(string.indexOf("H"));//0/查找指定字符第一次出现的索引位置
				alert(string.lastIndexOf("v"));//7/查找指定字符最后一次出现的索引位置
				alert(string.split("o"));//hell,java/按指定字符把字符串分割为字符串数组。
				alert(string.substring(1, 3));//el/截取字符串中两个指定的索引号之间的字符。包括头不包括尾
				alert(string.substr(2,5));//lloja/从起始索引号截取字符串中指定数目的字符。
				alert(string.toUpperCase());//HELLOJAVA/将字符串转成大写
			</script>
			
	4、Date对象
		创建方式：
			var myDate=new Date();
				Date 对象会自动把当前日期和时间保存为其初始值。
			
			var myDate=new Date(毫秒值);     
				1970年1月1日到先目前的时间点的毫秒
		
		常见方法：
			getFullYear():从 Date 对象以四位数字返回年份。
			
			getMonth():从 Date 对象返回月份 (0 ~ 11)(注意：需要加一)
			
			getDate():从 Date 对象返回一个月中的某一天 (1 ~ 31)。
			
			getDay():从 Date 对象返回一周中的某一天 (0 ~ 6)。
			
			getTime():返回 1970 年 1 月 1 日至今的毫秒数。
			
			toString():把 Date 对象转换为字符串。
			
			toLocaleString():根据本地时间格式，把 Date 对象转换为字符串。
	
		例如：
			<script type="text/javascript">
				var date = new Date();
				alert(date.toString());//中国标准时间(看不懂)
				alert(date.toLocaleString());//本地格式的时间
				alert("年："+date.getFullYear()+"  月："+(date.getMonth()+1)+"日："+date.getDate()+	" 星期："+date.getDay());
				var time = date.getTime();//从1970、1、1开始到现在的毫秒值
				alert(time);
			</script>
	
	5、Math对象
		是对数字进行操作的		
	
		Math 对象并不像 Date 和 String 那样是对象的类，
		
		因此没有构造函数 Math()，
		
		像 Math.sin() 这样的函数只是函数，不是某个对象的方法。
		
		您无需创建它，通过把 Math 作为对象使用就可以调用其所有属性和方法。
		
		常用的方法：
			abs(x):绝对值
			
			ceil(x):对数进行上舍入。
			
			floor(x):对数进行下舍入。
			
			round(x):把数四舍五入为最接近的整数。
			
			random():返回 0 ~ 1 之间的随机数。
		
		例如：
			<script type="text/javascript">
				var num=3.14;
				alert(Math.abs(num));//4
				alert(Math.ceil(num));//4
				alert(Math.floor(num));//3
				alert(Math.round(num));//3
				alert(Math.random());//随机小数(0~1之间)
			</script>
		
	6、RegExp正则表达式对象
		对象的方式：
			var reg = new RegExp(pattern);
		
		直接量语法(直接写字符串)：
			var reg = /pattern/;
			
		注意：
			正则规则一般是^开始 以$结束
			
		正则规则：
			[0-9]:代表0-9的数字
			
			[A-Z]:代表大写字母
			
			[a-z]:代表小写
			
			[A-z]:大小写都行
			
			\d：代表数字       
			
			\D:非数字
			
			\w:代表单词         
			
			\W:非单词
			
			{n}:n个      
			
			{n,m}:n到m个
			
			n+:1次或多次(最少一个)
			
			n?:0次或一次(最多一个)
			
			n*:0次或多次
		
		常用方法：
			test(待校验的字符串)
		
		需求：
			校验一个邮箱：haohao_827@163.com
		例如：
			<script type="text/javascript">
				/* 校验邮箱 */
				var email = "haohao_827@163.com";
				var reg = /^[A-z]+[A-z0-9-_]*\@[A-z0-9]+\.[a-z]+$/
				var a = reg.test(email);
				alert(a);//正确：true、错误：flase
			</script>
	
	7、Array对象
		创建方式：
			var arr = new Array();//空数字
			var arr = new Array(size);//多大空间的数组
			var arr = new Array(element0, element1, ..., elementn);//直接将元素放进去(任意类型)
			var arr = [element0, element1, ..., elementn];
		例如：
			<script type="text/javascript">
				var array = [1,2,3,5];
				/* 可以给指定索引位置赋值 */
				array[1] = "java";
				
				/* 
				java中如果超过数组本身长度，会报索引越界，
				但是在js中不会，他会把中间没有的用undefined部填充表示 
				*/
				array[5] = "php";
				
				for(var i=0;i<array.length;i++){
					alert(array[i]);
				}
			</script>
		
		属性：
			length:数组的长度
		
		常用方法：
			join("-");把数组的所有元素以指定字符拼接成一个字符串
			
			pop():删除并返回数组的最后一个元素
			
			reverse():颠倒数组中元素的顺序。
			
			sort():对数组的元素进行排序   按照字典顺序排序
		
		例如：
			<script type="text/javascript">
				var array = [1,2,3,5,"java"];
				alert(array.join("-"));//"1-2-3-5-java"
				alert(array.pop("-"));//删除最后一个元素，并把删除的元素返回
				alert(array.reverse());//颠倒顺序
				alert(array.sort());//按字典顺序排序
			</script>
			
四、js函数
	1、js的自定义函数
		第一种方式：普通函数
			语法：
				function 函数名称(参数列表){函数体(方法体)}
			
			例如：
				<script type="text/javascript">
					/* 定义函数 */
					function test(str){
						alert(str);
					}
					/* 函数的调用 */
					test("java");
				</script>
		
		第二种方式：匿名函数
			语法：
				var a = function(参数列表){函数体}
			注意：
				匿名函数没有名字，如果调用 需要声明一个变量接收
			例如：
				<script type="text/javascript">
					/* 定义函数 */
					var a = function (str){
						alert(str);
					}
					/* 函数的调用 */
					a("java");
				</script>
		
		第三种方式:对象函数(几乎不用)
			语法：
				new Function("参数1"，"参数2"，..."参数n"，"函数体");
				
			注意：
				函数体必须写在最后，参数和函数体需要字符串的形式传递
				
				类似与java中的可变参数
				
				与第二种的区别就是可以这样写：add("a",1,function(){});
				
			例如：
				<script type="text/javascript">
					/* 定义函数 */
					var a = new Function("str","alert(str)");
					/* 函数的调用 */
					a("java");
				</script>
		
		注意：
			1、自定义函数的参数列表
				1.1、调用是加括号表示调用函数，不佳括号表示对象
				1.2、参数传递不需要使用var
				1.3、NaN:not a number不是一个数字
				1.4、arguments：数组对象，负责收集实参
				1.5、注意一个小知识点
					<script type="text/javascript">
						function method(a,b){
							alert(a+b);
							/* 想要使用第三种情况获取所有值，可以这样写 */
							for(var i=0;i<arguments.length;i++){
								alert(arguments[i]);
							}
						}
						/* 第一种情况 */
						method(2,4);//6/正常结果
						/* 第二种情况 */
						method(2);//NaN：not a number不是一个数字(2和undefied相加)
						/* 第三种情况 */
						method(2,4,8);//6/8会自动舍去
					</script>
		
			2、返回值
				返回值不需要在定义函数的时候声明
				
				函数需要返回值只需在函数体中使用return进行返回，
				
				return后的代码不执行
				
				例如：
					<script type="text/javascript">
						function method(a,b){
							return a+b;
						}
						var num = method(2,4);
						alert(num);
					</script>
				
	2、js的全局函数(内置的)
		在w3cSchool的 JS Function中
		
		2.1、编码和解码
			*encodeURI():把字符串编码为 URI。更适合http请求提交
			
			decodeURI():解码某个编码的 URI。
			
			encodeURIcomponent():把为 URI 组件进行编码。适合编码提交的参数部分
			
			decodeURIcomponent()：把为 URI 组件进行解码。
			
			escape():编码字符串。适合编码单独的字符串
			
			unescape():解码字符串
			
			区别：
				对一些特殊字符编码的范围不同
				
			需求：
				对url进行编码 http://www.baidu.com?name=张&pass=123
			
			例如：
				<script type="text/javascript">
					var url = "http://www.baidu.com?name=张&pass=123";
					
					alert(encodeURI(url));
						/*  
							结果：http://www.baidu.com?name=%E5%BC%A0&pass=123
							更适合http请求提交
						*/
					alert(encodeURIComponent(url));
						/*  
							结果：http%3A%2F%2Fwww.baidu.com%3Fname%3D%E5%BC%A0%26pass%3D123
							适合编码提交的参数部分
						*/
					alert(escape(url));
						/*  
							结果：http%3A//www.baidu.com%3Fname%3D%u5F20%26pass%3D123
							适合编码单独的字符串
						*/
					
				</script>
		
		2.2、强制转换(不常用)
			Boolean()
			
			String()
			
			Number()
		
		2.3、转成数字
			parseFloat():解析一个字符串并返回一个浮点数。
			
			parseInt():解析一个字符串并返回一个整数。
		
		2.4、eval()函数
			把字符串作为脚本代码来执行。
			
			例如：
				<script type="text/javascript">
					var x = "var a=2;var b=3;alert(a+b);";
					eval(x);//5
				</script>
	
五、js事件
	1、了解什么叫事件、事件源、响应行为
	见图1

	2、js的事件绑定方式
		2.1、 事件与响应行为与事件源绑定
			例如：
				<input type="button" value="button" onclick="alert('xxx')"/>
		
		2.2、事件与事件源绑定 响应行为使用函数封装
			例如：
				<body>
					<input type="button" value="button" onclick="method('java')"/>
				</body>
				<script type="text/javascript">
					function method(str){
						alert(str);
					}
				</script>
		
			补充：
				this关键字：代表本事件源对象
				例如：
					<body>
						<!-- 方法而补充  此时的this代表整个input标签对象 -->
						<input type="button" value="button" onclick="method(this)"/>
					</body>
					<script type="text/javascript">
						function method(str){
							<!-- 此时的str代表整个input标签对象,用对象.属性就可以获取到对应的值 -->
							alert(str.value);
						}
					</script>
					
		2.3、 事件、响应行为  与事件源完全分离
			例如：
				<body>
					<input type="button" value="button"id="myInput"/>
				</body>
				<script type="text/javascript">
					var inputobj = document.getElementById("myInput");
					inputobj.onclick = function(){
						alert("xxxssss");
					};
				</script>
	3、常用事件
		3.1、onchange事件
			例如：二级联动
				<body>
					<select id="city">
						<option value="bj">北京</option>
						<option value="tj">天津</option>
						<option value="sh">上海</option>
					</select>
					<select id="area">
						<option>海淀区</option>
						<option>昌平区</option>
						<option>朝阳区</option>
					</select>
				</body>
				
				<script type="text/javascript">
					var city = document.getElementById("city");
				
					/* 添加改变事件 */
					city.onchange = function() {
						var options = city.getElementsByTagName("option");
						for ( var i = 0; i < options.length; i++) {
							var option = options[i];
							if (option.selected) {
								var value = option.value;
								/* 判断是那一个城市 */
								switch (value) {
								case "bj":
									/* 获取对应区域的信息 */
									var area = document.getElementById("area");
									area.innerHTML = "<option>海淀区</option><option>昌平区</option><option>朝阳区</option>";
									break;
								case "tj":
									var area = document.getElementById("area");
									area.innerHTML = "<option>南开区</option><option>西青区</option><option>河西区</option>";
									break;
								case "sh":
									var area = document.getElementById("area");
									area.innerHTML = "<option>浦东新区</option><option>虹桥区</option><option>闵行区</option>";
									break;
								}
							}
						}
					}
				</script>
		
		3.2、onfocus()事件和onblur()事件
			例如：
				<body>
					用户名：<input type="text" id="tel" value="请输入电话号码"/><br/>
				</body>
				<script type="text/javascript">
					var tel = document.getElementById("tel");
					tel.onfocus = function(){
						if(this.value == this.defaultValue){
							this.value="";
						}
					};
					tel.onblur = function(){
						if(this.value.trim() == ""){
							//this.value = "请输入电话号码"; 
							this.value = this.defaultValue;
						}
					};
				</script>
		
		3.3、onmouseover事件和onmouseout事件
			例如：
				<head>
					<style type="text/css">
						div{
							width: 100px;
							height: 100px;
							background-color: red;
						}
					</style>
				</head>
				<body>
					<div id="div">我是红色div</div>
				</body>
				<script type="text/javascript">
					var div = document.getElementById("div");
					div.onmouseover = function(){
						this.style.backgroundColor = "green";
					};
					div.onmouseout = function(){
						this.style.backgroundColor = "red";
					};
				</script>
		
		3.4、onload事件
			<script type="text/javascript">
				<!-- 页面加载完成之后再执行这里的代码-->
				window.onload = function(){
					var div = document.getElementById("div");
					div.onmouseover = function(){
						this.style.backgroundColor = "green";
					};
					div.onmouseout = function(){
						this.style.backgroundColor = "red";
					};
				};
			</script>
	
	4、组织阻止事件的默认行为
		a标签默认点击事件
		W3C的标准：e.preventDefault()
		IE标准：window.event.returnValue = false;
		
		例如：
			方法一：
				<body>
					<!-- 此时的event指定是当前的点击事件-->
					<a href="http://www.baidu.com" onclick="prevent(event)">跳转</a>
				</body>
				<script type="text/javascript">
					function prevent(e){
						//是火狐
						if(e && e.preventDefault){
							alert("w3c");
							e.preventDefault();
						}else{
						//IE
							alert("IE");
							window.event.returnDefault = false;
						}
					
					}
				</script>
			方法二：
				<a href="http://www.baidu.com" onclick="return false">跳转</a>
	
	5、阻止事件传播行为
		W3C的标准：e.stopPropagation();
		IE标准：window.event.cancelBubble = true;
		
		例如：
			<head>
				<style type="text/css">
					#d1{
						width: 300px;
						height: 300px;
						background-color: red;
					}
					#d2{
						width: 150px;
						height: 150px;
						background-color: green;
					}
				</style>
			</head>
			<body>
				<div id="d1" onclick="alert('div1')">
					<div id="d2"  onclick="div2('event')"></div>
				</div>
			</body>
			<script type="text/javascript">
				function div2(e){
					alert(e);
					if(e && e.stopPropagation){
						e.stopPropagation();
					}else{
						window.event.cancelBubble = true;
					}
				}
			</script>
		
六、js的BOM
	1、window对象
		注意：
			window是顶级对象，使用其中的方法时不需要写window，直接写方法就行
			
		1.1、弹框的方法
			提示框：alert(确认信息);
			确认框：confirm(确认信息);
				存在返回值：
					点击确认：true
					点击取消：false
			输入框：prompt(提示信息);
				存在返回值：
					点击确认：获取输入的内容
					点击取消：null
			例如：
				<script type="text/javascript">
					/* 第一种 */
					alert("xxxx");
					/* 第二种 */
					var con = confirm("您确定删除这条信息吗？");
					if(con){
						alert("删除成功");
					} 
					/* 第三种 */
					var pro = prompt("请输入密码");
					if(pro != null){
						alert("登录成功");
					}
				</script>	
		
		1.2、open("有参数")方法
			作用:
				是在js中使用此方法打开新页面 参数是url地址
				可以在代开网页时的小广告
			例如：
				<script type="text/javascript">
					/* open方法的使用 */
					open("http://www.baidu.com");
				</script>
	
		1.3、定时器方法
			指定的延时时间后执行一定行为
			
			第一种定时器：
				setTimeout(函数对象，毫秒值)//创建定时器
				
				注意：
					只执行一次
					
				例如：
					<script type="text/javascript">
						/* 第一种定时器 */
						setTimeout(function(){
							/* 三秒钟后打开指定网页 */
							open("http://www.baidu.com");
						},3000);
					</script>	
			
			第二种定时器()：
				var timer = setInterval(函数对象，毫秒值)//创建定时器
				clearInterval(timer);//关闭定时器
				
				注意：
					指定时间内循环执行
					
				例如：
					<head>
						<script type="text/javascript">
							/* 第二种定时器 (为了能够手动关闭可以给他一个返回值)*/
							var timer = setInterval(function(){
								/* 三秒钟后打开指定网页 */
								open("http://www.baidu.com");
							},3000);
							function closer(){
								clearInterval(timer);
							}
						</script>	
					</head>
					<body>
						<input type="button" value="close" onclick="closer()"/>
					</body>
	
	2、location对象
		location.href="url路径";
		location.href = "http://www.baidu.com";
		
		注意：
			需要对象.方法名来使用
	
		需求：
			这出成功后5秒钟跳转到首页的案例
			
			<head>
				<style type="text/css">
					#second{
						color: red;
					}
				</style>
			</head>
			<body>
				恭喜您注册成功，<span id="second">5</span>秒后跳转到首页，如果不跳请<a href="http://www.baidu.com">点击这里</a>
			</body>
			<script type="text/javascript">
				var num = 5;
				
				setInterval(function(){
					num = num-1;
					if(num <= 0){
						location.href="http://www.baidu.com";
					}else{
						var second = document.getElementById("second");
						second.innerHTML = num;
					}
				},1000);
			</script>
	
	3、history对象
		history.back();返回上一页
		
		history.forward():进入下一页
		
		history.go();跳转到指定的页
		
		例如;
			<body>
				第二页
				<a href="BOM5.html">next</a>
				<br/>
				<input id="pre" type="button" value="上一页"/>
				<input id="nex" type="button" value="下一页"/>
			</body>
			
			<script type="text/javascript">
				document.getElementById("pre").onclick = function(){
					//history.back();
					history.go(-1);
				};
				document.getElementById("nex").onclick = function(){
					//history.forward();
			 		//history.go(1);
				};
			</script>				
	
七、js的DOM(一般使用jQuery)
	1、document.getElementById("id属性值");
		<body>
		   <form name="form1" action="test.html" method="post" >
			  <input type="text" name="username" value="IT精英培训"  id="tid"  onchange="" >
			  <input type="button" name="ok" value="保存1"/>
		   </form>
		</body>
		<script type="text/javascript">
			//输出 <input type="text" name="username" value="IT精英培训"  id="tid" >标签value属性的值
			var val = document.getElementById("tid").value;
			alert(val);
			
			//输出 <input type="text" name="username" value="IT精英培训"  id="tid" >标签type属性的值
			var inputEle = document.getElementById("tid");
			alert(inputEle.type);
		</script>
	
	2、document.getElementsByTagName("标签名称");
		<body>
		   <form name="form1" action="test.html" method="post" >
			  <input type="text" name="tname" value="传智播客5周年_1"  id="tid_1"  ><br>
			  <input type="text" name="tname" value="传智播客5周年_2"  id="tid_2"  ><br>
			  <input type="text" name="tname" value="传智播客5周年_3"  id="tid_3"  ><br>
			  <input type="button" name="ok" value="保存1"/>
		   </form>
		   <select name="edu" id="edu">
			  <option value="博士">博士^^^^^</option>
			  <option value="硕士" selected="selected">硕士^^^^^</option>
			  <option value="本科"  >本科^^^^^</option>
			  <option value="幼儿园">幼儿园^^^^^</option>
		   </select>
		   <select name="job" id="job" >
			  <option value="美容">美容^^^^^</option>
			  <option value="IT">IT^^^^^</option>
			  <option value="程序员">程序员^^^^^</option>
			  <option value="建筑师">建筑师^^^^^</option>
		   </select>
		   <br/>
		   <input id="btn" type="button" value="输出select被选中的值" />
		</body>
		<script type="text/javascript">
			//获取所有的input元素,返回值是数组
			var inputs = document.getElementsByTagName("input");
			//测试长度
			alert(inputs.length);
			
			//遍历value的值
			for(var i=0;i<inputs.length;i++){
				alert(inputs[i].value);
			}
			
			//输出type="text"中 value属性的值 不包含按钮(button)
			for(var i=0;i<inputs.length;i++){
				var typex = inputs[i].type;
				if(typex!="button"){
					alert(inputs[i].value);
				}
			}
			
			//输出所有下拉选select的option标签中value的值
			var options = document.getElementsByTagName("option");
			 for(var i=0;i<options.length;i++){
				alert(options[i].value);
			}
			
			//输出所有下拉选 id="edu"中option标签中 value属性的值
			var edu = document.getElementById("edu");
			var optionss = edu.getElementsByTagName("option");
			for(var i=0;i<optionss.length;i++){
				alert(optionss[i].value);
			}
			   
			//点击按钮输出下拉框中被选中的值
			
			document.getElementById("btn").onclick = function(){
				var options = document.getElementsByTagName("option");
				 for(var i=0;i<options.length;i++){
					if(options[i].selected){
						alert(options[i].innerHTML);
				 }
			   }
			}; 
		</script>
	
	3、document.getElementsByName("name属性值");
		<body>
		   <form name="form1" action="test.html" method="post" >
			  <input type="text" name="tname" value="IT精英培训_1"  id="tid_1"  ><br>
			  <input type="text" name="tname" value="IT精英培训_2"  id="tid_2"  ><br>
			  <input type="text" name="tname" value="IT精英培训_3"  id="tid_3"  ><br>
			  <input type="button" name="ok" value="保存1"/>
		   </form>
		</body>
		<script type="text/javascript">
			//通过元素的name属性获取所有元素的引用  name="tname"
			var names = document.getElementsByName("tname");
			//测试该数据的长度
			alert(names.length);
			
			//遍历元素,输出所有value属性的值
			for(var i=0;i<names.length;i++){
				var namex = names[i];
				//alert(name);
				alert(namex.value);
			}
			
			//为每个文本框(<input type="text">)增加chanage事件,当值改变时,输出改变的值
			for(var i=0;i<names.length;i++){
				var namex = names[i];
				namex.onchange = function(){
					alert(this.value);
				};
			} 
		</script>
	
	4、innerHTML：获取某个元素中的html代码
		<body>
		  <div id="city">jquery</div>
		</body>
		<script language="JavaScript">
			//使用innerHTML读出id=city中的文本内容
			alert(document.getElementById("city").innerHTML);
			
			//将<h1>今天</h1>写到div的层中
			document.getElementById("city").innerHTML = "<h1>今天</h1>";
		</script>
				
























