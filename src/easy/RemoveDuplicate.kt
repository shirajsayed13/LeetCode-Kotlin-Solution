package easy

class RemoveDuplicate {
    fun removeDuplicates(nums: IntArray): Int {
        var start = 0
        var end = 0
        val num = nums.size
        while (end < num) {
            val curr = nums[end]
            while (end < num && nums[end] == curr) {
                end++
            }
            nums[start++] = curr
        }
        return start
    }
}