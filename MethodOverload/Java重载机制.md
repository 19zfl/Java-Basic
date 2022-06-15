# 方法的重载机制overload

#### 分析不使用<mark>overload</mark>的代码：

````java
public class OverloadTest01 {
	
    //入口
    public static void main(String[] args) {

        //调用方法
        int result1 = sumInt(1,2);
        System.out.println(result1);

        double result2 = sumDouble(1.0,2.0);
        System.out.println(result2);

        long result3 = sumLong(1L,2L);
        System.out.println(result3);

    }

//    定义一个方法计算两个int类型的和
    public static int sumInt(int a,int b) {

        return a + b;

    }
//    定义一个方法计算两个double类型的和
    public static double sumDouble(double a,double b) {

        return a + b;

    }

//    定义一个方法计算两个long类型的和
    public static long sumLong(long a,long b) {

        return a + b;

    }

}
````

#### 分析<mark>缺点</mark>：

> 1. 三个方法不相同，却十分相似，都是求两个参数的和。代码中三个方法起了不同的名字，对于我们来说，调用方法的时候十分不方便。
> 2. 代码不美观

有没有这样的一种机制：

​			*功能虽然不同，但功能相似的时候，可以让我们使用这些方法的时候就像在用同一个方法一样，也让我们编写代码比较方便，也不需要记太多的方法名，代码也很美观。*

这种机制叫：**方法重载机制/Overload**

#### 应用<mark>overload</mark>机制的代码：

````java
public class OverloadTest02 {

    //体验卡
    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1L,2L));
        System.out.println(sum(1.0,2.0));

    }

    public static int sum(int a,int b) {
        return a + b;
    }
    public static long sum(long a,long b) {
        return a + b;
    }
    public static double sum(double a,double b) {
        return a + b;
    }

}
````

:ideograph_advantage: 此时区分方法不再需要依靠方法名了，依靠的是参数类型。

---

## 方法重载：

1. 方法重载又被称为：overload
2. 什么时候考虑使用方法重载？
   - 功能相似的时候，尽可能让方法名相同
   - 但是：功能不同，不相似的时候，尽可能让方法名不同。
3. 什么条件满足之后构成了方法重载？
   - 在同一个类当中
   - 方法名相同
   - 参数列表不同
     - 数量不同
     - 顺序不同
     - 类型不同
4. 方法重载和什么有关系，和什么没有关系？
   - 方法重载和方法名+参数列表有关
   - 方法重载和返回值类型无关
   - 方法重载和修饰符列表无关  