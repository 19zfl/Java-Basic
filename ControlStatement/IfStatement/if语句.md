# 关于Java语言中的if语句，属于选择语句，if语句又称为分支语句/条件控制语句：

### if语句的语法结构：四种编写方式

- 第一种：

  `if(布尔表达式) {`

  ​		`java语句;`

  ​		`java语句;`

  ​		`java语句;`

  ​		……

  `}`

- 第二种：

  ​		`if(布尔表达式) {`

  ​				`java语句;`

  ​				`java语句;`

  ​				……

  ​		`}else {`

  ​				`java语句;`

  ​				`java语句;`	

  ​				……

  `}`

- 第三种：

  ​			`if(布尔表达式) {`

  ​					`java语句;`

  ​					`java语句;`

  ​					……	

  ​			`}else if(布尔表达式) {`

  ​					`java语句;`

  ​					`java语句;`

  ​					……	

  ​			`}else if(布尔表达式) {`

  ​					`java语句;`

  ​					`java语句;`

  ​					……

  ​			`}`

- 第四种：

​					`if(布尔表达式) {`

​							`java语句;`

​							`java语句;`

​							……	

​					`}else if(布尔表达式) {`

​							`java语句;`

​							`java语句;`

​							……	

​					`}else if(布尔表达式) {`

​							`java语句;`

​							`java语句;`

​							……

​					`}else {`

​							`java语句;`

​							`java语句;`

​							……

​					`}`

````tips
重点：对于Java中的if语句来说，只要有一个分支执行，整个if语句全部结束。
注意：以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以100%保证会有分支执行。
所有的控制语句都是可以嵌套使用的，只要合理嵌套就行。
if语句的分支只有一条Java语句的话，大括号可以省略不写。(不建议)
````

 练习题：*src-javalesson-april17th2022-ifTest01.java/ifTest02.java/ifTest03.java*

​				*src-javalesson-april18th2022-ifTest04.java*