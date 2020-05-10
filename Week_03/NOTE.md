## 递归代码模板

### Java 范式递归模板

```java
public void recur(int level, int param) { 
  // recursion terminator 
  // 递归终结条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process logic in current level
  // 处理当前层逻辑
  process(level, param); 
  // drill down 
  // 下探到下一层
  recur( level: level + 1, newParam); 
  // reverse the current level status if needed 
  // 清理当前层
 
}
```

### 分治模板

```java
def divide_conquer(problem, param1, param2, ...): 
  # recursion terminator 
  if problem is None: 
	print_result 
	return 

  # prepare data 
  data = prepare_data(problem) 
  subproblems = split_problem(problem, data) 

  # conquer subproblems 
  subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
  subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
  subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
  …

  # process and generate the final result 
  result = process_result(subresult1, subresult2, subresult3, …)
	
  # revert the current level states
```





### 递归代码模板

```py
def recursion(level, param1, param2, ...): 
    # recursion terminator 
    if level > MAX_LEVEL: 
	   process_result 
	   return 
    # process logic in current level 
    process(level, data...) 
    # drill down 
    self.recursion(level + 1, p1, ...) 
    # reverse the current level status if needed
```



## 实战题目

### [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/solution/er-cha-shu-de-zui-da-shen-du-by-leetcode/)

官方题解