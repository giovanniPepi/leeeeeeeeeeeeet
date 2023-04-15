class GoalParser {
  fun interpret(command: String): String{
	var sb = StringBuilder()
	var flag = false

	command.forEach { c ->
	  flag = if (c == '(') true
	  else if (c == ')' && flag) {
		sb.append('o')
		false
	  } else if (c == ')') return@forEach
	  else {
		sb.append(c)
		false
	  }
	}
	return sb.toString()
  }
}