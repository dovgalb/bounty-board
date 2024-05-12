package part3

const val HERO_NAME = "Madrigal"

fun main() {
    println("Герой объявляет миру о своем присутствии.")
    println(HERO_NAME)
    var playerLevel = 1
    println(playerLevel)

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest: String = when (playerLevel) {
        1 -> "Познакомьтесь с мистером Бабблсом в стране мягких вещей."
        in 2..5 -> {
            val canTolkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTolkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            }
            else {
                "Save the town from the barbarianinvasions."
            }
        }
        6 -> "Найдите зачарованный меч."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }
    println(quest)

    println("Время проходит...")
    println("Герой возвращается со своих поисков.")

    playerLevel += 1
    println(playerLevel)
}
