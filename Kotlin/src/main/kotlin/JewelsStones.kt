// 771 https://leetcode.com/problems/jewels-and-stones/

class JewelsStones {
	fun numJewelsInStones(jewels: String, stones: String): Int {
		var count = 0
		for (element in stones){
			if(element in jewels) count++
		}
		return count
	}
}