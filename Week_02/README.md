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
