动态规划

DP的核心思想 ，类似于高中学习的数学归纳法；

1. 把一个大问题（size==n) 的解决方案用比他小的问题（问题们）来解决，也就是思考从问题size = n-1 增加到 size = n 的时候，如何用小问题的solution 构建大问题的solution。

2. 与 recursion的关系：

	2.1 Recursion 从大到小来解决问题，不记录任何sub-solution,只要考虑
	
		2.1.1 base case

		2.1.2 recursive rule

	2.2 DP 从小到大来解决问题，记录sub-solution

		2.2.1 由 size(<n) 的subsolution(s) ->size(n)的solution
		2.2.2 base case
		2.2.3 induction rule