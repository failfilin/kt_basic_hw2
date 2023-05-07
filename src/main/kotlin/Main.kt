fun main() {
    val likes = 1212
    if (likes % 100 != 11 && likes % 10 == 1) println("Понравилось $likes человеку") else println("Понравилось $likes людям")
}