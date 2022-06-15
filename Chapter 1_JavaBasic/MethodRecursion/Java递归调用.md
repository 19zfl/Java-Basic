# Java递归调用

### 1.什么是递归？

> 方法自身调用自身。

### 2.递归是很耗费栈内存的，递归算法可以不用的时候尽量别用。

### 3. 当控制台出现<mark>java.lang.StackOverflowError</mark>时，这不是异常，是错误，<mark>栈内存溢出错误</mark>。错误发生无法挽回，只有一个结果，就是JVM停止工作。

### 4.递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误。

### 5.递归调用即使有了结束条件，即使结束条件是正确的，也可能会发生栈内存溢出错误，因为递归太深了。

 

<mark>Code</mark>

````java
public class RecursionTest01 {

    public static void main(String[] args) {

        System.out.println("main begin");
        m();
        System.out.println("main over");

    }
//以下的代码片段虽然只有一份
    //但是可以重复被调用，并且只要调用m()方法就会在栈内存中新分配一块所属的内存空间。
    public static void m() {
        System.out.println("m() begin");
        m();
        System.out.println("m() over");
    }

}
````

##### 案例题：

不使用递归，计算1-N的和：

> RecursionTest02.java

使用递归，计算1-N的和：

> RecursionTest03.java

### 栈/Stack中的递归图：

![StackRecursion](D:\Repository\Code\Obsidian\Java Basic\Chapter 1\images\StackRecursion.png)