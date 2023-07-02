// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
class SumOddLengthSubarrays {
    fun  sumOdd(arr: IntArray): Int{
        var left = 0
        var sum = 0
        val size = arr.size

        while (left < size) {
            var currSum = arr[left]
            val right = left + 1
            sum += arr[left]

            loop@ for(index in right until size) {

                currSum += arr[index]
                //  checks if the length of the current subarray (index - left) is odd
                if((index - left) % 2 != 0) continue@loop
                sum += currSum

            }
            left++
        }

        return sum
    }
}