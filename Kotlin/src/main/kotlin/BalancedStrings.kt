// 1221 https://leetcode.com/problems/split-a-string-in-balanced-strings/

class BalancedStrings {
	fun balancedStringSplits (s: String): Int {
		var isBalanced = 0
		var balanceCount = 0

		s.forEach {
			if (it == 'L') isBalanced++
			else if (it == 'R') isBalanced--

			if (isBalanced == 0) balanceCount++
		}

		return balanceCount
	}
}