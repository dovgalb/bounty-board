package part6

const val HERO_NAME = "Madrigal"
var playerLevel = 0


fun main() {
    println("$HERO_NAME объявляет миру о своем присутствии.")
    println("Какой уровень у $HERO_NAME?\nВведите уровень:")
//    playerLevel = readLine()!!.toInt()
    val playerLevelInput = readLine()!!
    playerLevel = if
            (playerLevelInput.matches("""\d+""".toRegex())) {
                playerLevelInput.toInt()
    } else {
        1
    }
    println("У $HERO_NAME: $playerLevel уровень")
    readBountyBoard()
    println("Время проходит...")
    println("$HERO_NAME возвращается со своих поисков.")

    playerLevel += 1
    println(playerLevel)
    readBountyBoard()
}

fun shouldReturnsAString(): String {
    TODO("implement the string building functionality here to return a string")
    println("sd")
}

private fun readBountyBoard() {
    println(
        """
            $HERO_NAME приближается к доске наград. Он читает:
               "${obtainQuest(playerLevel).replace("[Nn]ogartse".toRegex(), "XXXX")}"
        """.trimIndent()
    )
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

