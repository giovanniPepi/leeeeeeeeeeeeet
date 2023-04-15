// 1528 https://leetcode.com/problems/shuffle-string/

class ShuffleString {
	fun restoreString(s: String, indices: IntArray): String {
		val result = CharArray(s.length)
		s.forEachIndexed { i, char ->
			result[indices[i]] = char
		}
		return String(result)
	}
}