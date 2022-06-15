# 控制语句

##### switch语句也属于选择结构，也是分支语句

##### switch语句的语法结构：

- 一个比较完整的switch语句应该这样编写：

  > ​	switch(*int*或*string*类型的字面值或变量) {
  >
  > ​			case *int*或*string*类型的字面值或变量：
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					break；
  >
  > ​			case *int*或*string*类型的字面值或变量：
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					break；
  >
  > ​			case *int*或*string*类型的字面值或变量：
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					Java语句；
  >
  > ​					break；
  >
  > ​					……
  >
  > ​			default：
  >
  > ​					Java语句；
  >
  > ​					……
  >
  > }

##### switch语句的执行原理：

​	switch后面的小括号当中的“数据”和case后面的“数据”进行逐一匹配，匹配成功的分支执行。按照自上而下的顺序依次匹配。

##### 匹配成功的分支执行：

- 分支当中最后有“break;”语句的话，整个switch语句终止。
- 分支当中没有“break;”语句的话，直接进入下一个分支执行（不进行匹配），这种现象被称为case穿透现象。【提供”break;“语句可避免穿透】

````注意
所有分支都没有匹配成功，当有default语句的话，会执行default分支当中的程序
````

##### switch后面和case后面只能是int或string类型的数据，不能是探测其他类型。

- 当然byte，short，char也可以直接写到switch和case后，因为它们可以进行自动类型转换。

  byte，short，char可以自动类型转换成int类型。

- JDK6的，switch和case后面和只能探测int类型。

- JDK7之后包括7版本在内，引入新特性，switch关键字和case关键字后面可以探测int或string类型的数据。

##### case可以给合并：

`int i = 10;`

`switch(i) {`

​	`case 1: case 2: case 3: case 10:` 

​	`System.out.println("Test Code!!!");`

`}`
