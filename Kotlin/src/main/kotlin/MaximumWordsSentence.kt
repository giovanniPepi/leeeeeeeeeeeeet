// 2114 https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class MaximumWordsSentence {
  fun mostWords(sentences: Array<String>): Int {
	var maximum = 0

	sentences.forEach {
	  val length = it.split(" ").count()
	  if(length > maximum) maximum = length
	}

	return maximum
  }
}