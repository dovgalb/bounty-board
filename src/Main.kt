var playerLevel = 2
const val HERO_NAME = "Madrigal"


fun main() {
    checkLevel(HERO_NAME)
    playerLevel = levelUp(HERO_NAME ,playerLevel, 4)
    playerLevel = levelUp(HERO_NAME, playerLevel, 2)
    checkLevel(HERO_NAME)

}

fun levelUp(hero: String, playerLevel: Int, score: Int = 1): Int {
    val newLevel = playerLevel + score
    println("Уровень $hero повышен: $newLevel(+$score)")
    return newLevel
}

fun checkLevel(hero: String) {
    println("Уровень $hero: $playerLevel")
}
