package easy

internal class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            val mid = (low + high) / 2
            when {
                nums[mid] == target -> {
                    return mid
                }
                nums[mid] > target -> {
                    high = mid - 1
                }
                else -> {
                    low = mid + 1
                }
            }
        }
        return low
    }
}

fun main() {
    val sip = SearchInsertPosition()
    val searchInsert = sip.searchInsert(intArrayOf(1, 3, 5, 6), 5)
    println("Search Insert Position = $searchInsert")
}