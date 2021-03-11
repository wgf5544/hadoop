MapReduce
Hive：SQL on Hadoop
    SQL ==> MapReduce/Spark  explain
    join


    select a.*, b.* from a join b on a.id=b.id

Interview: 描述如何使用MapReduce来实现join的功能
考察点：
    1）MapReduce执行流程
    2）JOIN的底层执行过程
    3）JOIN的多种实现方式：ReduceJoin(shuffle)、MapJoin(没有reduce，换句话说就是没有Shuffle)

resume：
    1）最新的项目是写在最前面的
    2）写的东西一定要真正会的（区分）
    3）从你写的东西开始面起，然后逐步扩展==>你的技能/技术的一个功能链条


ReduceJoin
    数据通过Mapper加载过来，然后经过shuffle阶段，在Reduce端完成真正的join操作


dept：dname、deptno
emp：empno、ename、sal、deptno


Q1: Mapper的泛型里面有几个参数，各是什么意思
Q2: map方法有几个参数，各是什么意思
Q3: 为什么字符串拼接不要使用+
Q4: Mapper或者Reducer的生命周期方法有哪些

有些数据比较小，是否真的有必要全部进行shuffle呢？
shuffle是整个大数据处理过程中非常耗时、非常损耗性能的地方
能规避shuffle的地方就不要使用shuffle

MapJoin







