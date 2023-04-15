// 2011. https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class FourOperations {
	fun finalValue(operations: Array<String>): Int {
		return operations.fold(0) {result, operation ->
			if (operation[1] == '+') result+1
			else result -1
		}
	}
}