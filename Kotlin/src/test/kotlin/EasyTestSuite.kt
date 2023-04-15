import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test
import kotlin.test.assertEquals

class EasyTestSuite {

	@Test
	fun `Returns defang IP`(){
		val DefangIP = DefangIP()
		assertEquals("1[.]1[.]1[.]1", DefangIP.defangIPaddr("1.1.1.1"))
		assertEquals("255[.]100[.]50[.]0", DefangIP.defangIPaddr("255.100.50.0"))
	}

	@Test
	fun `Returns operation values 2011`(){
		val operations = FourOperations()
		assertEquals(1, operations.finalValue(arrayOf("--X","X++","X++")))
		assertEquals( 3,operations.finalValue(arrayOf("++X","++X","X++")))
		assertEquals(0, operations.finalValue(arrayOf("X++","++X","--X", "X--")))
	}

	@Test
	fun `Returns jewels in stones`(){
		val jewelsStones = JewelsStones()
		assertEquals(3, jewelsStones.numJewelsInStones("aA", "aAAbbbb"))
		assertEquals(0, jewelsStones.numJewelsInStones("z", "ZZ"))
	}

	@Test
	fun `Returns maximum words`(){
		val maximumWordsClass = MaximumWordsSentence()
		assertEquals(6, maximumWordsClass.mostWords(arrayOf("alice and bob love leetcode","i think so too","this is great thanks very much")))
		assertEquals(3, maximumWordsClass.mostWords(arrayOf("please wait","continue to fight","continue to win")))
	}

	@Test
	fun `Should parse goal string`(){
		val GoalParser = GoalParser()
		assertEquals("Goal", GoalParser.interpret("G()(al)"))
		assertEquals("Gooooal", GoalParser.interpret("G()()()()(al)"))
		assertEquals("alGalooG", GoalParser.interpret("(al)G(al)()()G" ))
	}

	@Test
	fun `Should shuffle strings`(){
		val ShuffleString = ShuffleString()
		assertEquals("leetcode", ShuffleString.restoreString("codeleet", intArrayOf(4, 5, 6,7,0,2,1,3)))
		assertEquals("abc", ShuffleString.restoreString("abc", intArrayOf(0,1,2)))
	}

	@Test
	fun `Should return balanced strings`(){
		val BalancedStrings = BalancedStrings()
		assertEquals(4, BalancedStrings.balancedStringSplits("RLRRLLRLRL"))
		assertEquals(2, BalancedStrings.balancedStringSplits("RLRRRLLRLL"))
		assertEquals(1, BalancedStrings.balancedStringSplits("LLLLRRRR"))
	}

	@Test
	fun `Should correctly convert temperatures`(){
		val convertTemperature = ConvertTemperature()
		assertArrayEquals(doubleArrayOf(309.65, 97.7), convertTemperature.convertTemperature(36.50))
		assertArrayEquals(doubleArrayOf(395.26, 251.798), convertTemperature.convertTemperature(122.11))
	}

}