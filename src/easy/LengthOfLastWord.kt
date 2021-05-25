package easy;

class LengthOfLastWord {
    fun lengthOfLastWord(str: String): Int {
        var count = 0
        var idx = str.length - 1
        while (idx >= 0 && str[idx] == ' ') {
            idx--
        }
        while (idx >= 0 && str[idx] != ' ') {
            idx--
            count++
        }
        return count
    }
}

fun main() {
    val lw = LengthOfLastWord()
    val str = lw.lengthOfLastWord("Hell Is Empty")
    println(str)
}