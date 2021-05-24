package easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var minLength = Int.MAX_VALUE
        var idx = -1
        for (i in strs.indices) {
            if(strs[i].length < minLength) {
                minLength = strs[i].length
                idx = i
            }
        }
        val sb = StringBuilder()
        for (i in 0 until strs[idx].length) {
            var flag = true
            for (str in strs) {
                if(str[i] != strs[idx][i]) {
                    flag = false
                    break
                }
            }
            if(!flag) {
                break
            }
            sb.append(strs[idx][i])
        }
        return sb.toString()
    }
}