class ConvertTemperature {
	fun convertTemperature(celsius: Double): DoubleArray {
		val kelvin = celsius + 273.15
		val fahrenheit = celsius * 1.8 + 32
		return doubleArrayOf(kelvin, fahrenheit)
	}
}