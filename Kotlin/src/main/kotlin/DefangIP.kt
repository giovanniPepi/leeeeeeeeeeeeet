// 1108 https://leetcode.com/problems/defanging-an-ip-address/

class DefangIP {
	fun defangIPaddr(address: String): String {
		val defanged = StringBuilder()

		for (ch in address) {
			if (ch == '.') {
				defanged.append("[.]")
			}
			else {
				defanged.append(ch)
			}
		}
		return defanged.toString()
	}
}