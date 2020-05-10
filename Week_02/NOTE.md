### PriorityQueue

`PriorityQueue<E>`实现了一个优先级队列

==从队首获取元素==时，总是获取优先级最高的元素

默认按元素比较的顺序排序 （元素本身必须实现`Comparable`接口）

可以通过Comparable自定义排序算法 (元素本身不必实现`Comparable`接口)



`PriorityQueue<E>` 具有 `Queue<E>`接口：

添加元素到队尾：`boolean add(E e)` / `boolean offer(E e)`

获取队列头部元素并删除：`E remove()` /  `E poll()`

获取队列头部元素但不删除：`E element()` /  `E peek()`





> ```
> // 删除指定元素number
> priorityQueue.remove(number);
> ```