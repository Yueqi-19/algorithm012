# HashMap Summary

Links: https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

1.HashMap is a part of Java’s collection 

2.It provides the basic implementation of the Map interface of Java. 

3.It stores the data in (Key, Value) pairs.

## Internal Structure of HashMap
Internally HashMap contains an array of Node and a node is represented as a class which contains 4 fields:

1. int hash
2. K key
3. V value
4. Node next


It can be seen that node is containing a reference of its own object. So it’s a linked list.


# 两数之和

由于哈希查找的时间复杂度为 O(1)，所以可以利用哈希容器 map 降低时间复杂度
遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
如果最终都没有结果则抛出异常
时间复杂度：O(n)

