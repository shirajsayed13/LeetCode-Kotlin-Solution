package easy

class GenerateDocument {

    fun generateDocument(characters: String, document: String): Boolean {
        for (character in document) {
            val documentFrequency = countCharacterFrequency(character, document)
            val charactersFrequency = countCharacterFrequency(character, characters)

            if (documentFrequency > charactersFrequency) return false
        }
        return true
    }

    private fun countCharacterFrequency(character: Char, target: String): Int {
        var frequency = 0
        for (char in target) {
            if (char == character) frequency += 1
        }
        return frequency
    }

}

fun main() {
    val gd = GenerateDocument()
    val generateDocument = gd.generateDocument("eolcodoc", "coolcode")
    println("Results $generateDocument")
}