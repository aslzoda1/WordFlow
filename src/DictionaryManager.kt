class DictionaryManager {
    private val vocabulary = mutableMapOf<String, Word>()

    fun addWord(term: String, definition: String, example: String) {
        vocabulary[term.lowercase()] = Word(term, definition, example)
        println("✅ '$term' lug'atga muvaffaqiyatli qo'shildi!")
    }

     fun findWord(term: String) {
        val word = vocabulary[term.lowercase()]
        if (word != null) {
            println("\n📖 Topildi:")
            println("🔹 So'z: ${word.term}")
            println("📝 Ma'nosi: ${word.definition}")
            println("💡 Misol: ${word.example}")
        } else {
            println("❌ Kechirasiz, '$term' lug'atda mavjud emas.")
        }
    }

     fun startQuiz() {
        if (vocabulary.size < 3) {
            println("⚠️ Quiz uchun kamida 3 ta so'z bo'lishi kerak!")
            return
        }
        val randomWord = vocabulary.values.random()
        println("\n🤔 DIQQAT SAVOL:")
        println("Ushbu ma'no qaysi so'zga tegishli: '${randomWord.definition}'?")
        print("Javobingiz: ")

        val answer = readLine()
        if (answer?.lowercase() == randomWord.term.lowercase()) {
            println("🎉 To'g'ri! Siz haqiqiy poliglotsiz!")
        } else {
            println("😔 Noto'g'ri. Bu '$randomWord.term' so'zi edi.")
        }
    }
}