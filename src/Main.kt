import java.util.Scanner
fun main() {
    val dict = DictionaryManager()
    val scanner = Scanner(System.`in`)

    println("🌟 WordFlow: Aqlli Lug'at Tizimi")

    dict.addWord("Immutable", "O'zgarmas", "In Kotlin, 'val' creates an immutable variable.")
    dict.addWord("Algorithm", "Mantiqiy ketma-ketlik", "The sorting algorithm is very fast.")

    while (true) {
        println("\n1. So'z qo'shish | 2. Qidirish | 3. Quiz | 0. Chiqish")
        print("Tanlov: ")

        when (scanner.next()) {
            "1" -> {
                print("So'z: ")
                val term = scanner.next()
                scanner.nextLine()
                print("Ma'nosi: ")
                val def = scanner.nextLine()
                print("Misol: ")
                val ex = scanner.nextLine()
                dict.addWord(term, def, ex)
            }
            "2" -> {
                print("Qidirilayotgan so'z: ")
                dict.findWord(scanner.next())
            }
            "3" -> dict.startQuiz()
            "0" -> {
                println("Bilim olishdan to'xtamang! Xayr! 📚")
                return
            }
            else -> println("⚠️ Noto'g'ri buyruq!")
        }
    }
}