package part4

const val HERO_NAME = "Madrigal"
var playerLevel = 5


fun main() {
    println("Герой объявляет миру о своем присутствии.")
    println(HERO_NAME)
    println(playerLevel)
    readBountyBoard()
    println("Время проходит...")
    println("Герой возвращается со своих поисков.")

    playerLevel += 1
    println(playerLevel)
    readBountyBoard()
}

fun shouldReturnsAString(): String {
    TODO("implement the string building functionality here to return a string")
    println("sd")
}

private fun readBountyBoard() {
    println("The hero approaches the bounty board. It reads:")
    println(obtainQuest(playerLevel, "paladin", true))
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = true,
    hasAngeredBarbarians: Boolean = false,
): String = when (playerLevel) {
        1 -> "Познакомьтесь с мистером Бабблсом в стране мягких вещей."
        in 2..5 -> {
            val canTolkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTolkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarianinvasions."
            }
        }

        6 -> "Найдите зачарованный меч."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }

