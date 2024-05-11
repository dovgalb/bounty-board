var playerLevel = 2
const val HERO_NAME = "Madrigal"
const val TAVERN_NAME = "Рог единорога"
var stable: Boolean = false
var money = 50
val innKeeper: String = ""
val tavernMenu: List<String> = listOf("Мед", "Вино", "пиво")

var hasSteed = false


fun main() {
    checkLevel(HERO_NAME)
    playerLevel = levelUp(HERO_NAME ,playerLevel, 4)
    playerLevel = levelUp(HERO_NAME, playerLevel, 2)
    checkLevel(HERO_NAME)
    checkSteed()
    getSteed()
    checkSteed()
    println(useMagicMirror(HERO_NAME))
}

fun levelUp(hero: String, playerLevel: Int, score: Int = 1): Int {
    val newLevel = playerLevel + score
    println("Уровень $hero повышен: $newLevel(+$score)")
    return newLevel
}

fun checkLevel(hero: String) {
    println("Уровень $hero: $playerLevel")
}

fun getSteed(): Boolean {
    hasSteed = true
    println("$HERO_NAME получил коня")
    return hasSteed
}

fun checkSteed() {
    if (hasSteed) {
        println("У $HERO_NAME есть конь!")
    } else {
        println("У $HERO_NAME нет коня!")
    }
}

fun useMagicMirror(character: String): String {
    return character.reversed()
}
