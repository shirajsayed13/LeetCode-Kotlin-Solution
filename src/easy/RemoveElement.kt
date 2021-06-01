package easy

class RemoveElement {
    fun removeElement(intArray: IntArray, value: Int): Int {
        var start = 0
        var end = 0
        val num = intArray.size
        while (end < num) {
            if (intArray[end] != value) {
                intArray[start++] = intArray[end]
            }
            end++
        }
        return start
    }
}