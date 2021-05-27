package easy

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        val carry = 1
        val n = digits.size
        for (i in n - 1 downTo 0) {
            val temp = digits[i] + carry
            if (temp <= 9) {
                digits[i] = temp
                return digits
            }
            digits[i] = temp % 10
        }
        val newDigits = IntArray(n + 1)
        newDigits[0] = 1
        for (i in 1 until n + 1) {
            newDigits[i] = digits[i - 1]
        }
        return newDigits
    }
}

fun main() {
    val pl = PlusOne()
    val dig = intArrayOf(2, 4, 5, 6, 7)
    pl.plusOne(dig)
}