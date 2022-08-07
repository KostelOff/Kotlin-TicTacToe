val X = mutableListOf('_', '_', '_', '_', '_', '_', '_', '_', '_')
var Z = '_'
var player = "X"
var OVER = ""

fun main() {

    val rulesClass = RulesClass()
    rulesClass.rulesFun()

    rulesClass.pictureFun()

    while (OVER != "Game over =)") {
        RulesClass().motion(player)
        val z = readln()
        firstActions(z)
    }
    println(OVER)
}

fun firstActions(y: String) {
    try {
        if (
            y[0].toString().toInt() in 1..3 &&
            y[2].toString().toInt() in 1..3
        ) {
            actions(y)

        } else if (
            y[0].toString().toInt() !in 1..3 ||
            y[2].toString().toInt() !in 1..3
        ) {
            println("Coordinates should be from 1 to 3!")

            firstActions(readln())
        }
    } catch (e: Exception) {
        println("You should enter numbers!")

        firstActions(readln())
    }
}

fun actions(y: String) {

    if (Z == '_' || Z == 'O') {
        Z = 'X'
        when (y) {
            "1 1" -> {
                if (X[0] == '_') {
                    X[0] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"
                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "1 2" -> {
                if (X[1] == '_') {
                    X[1] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"
                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "1 3" -> {
                if (X[2] == '_') {
                    X[2] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 1" -> {
                if (X[3] == '_') {
                    X[3] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 2" -> {
                if (X[4] == '_') {
                    X[4] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 3" -> {
                if (X[5] == '_') {
                    X[5] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 1" -> {
                if (X[6] == '_') {
                    X[6] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 2" -> {
                if (X[7] == '_') {
                    X[7] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 3" -> {
                if (X[8] == '_') {
                    X[8] = 'X'
                    RulesClass().pictureFun()
                    check()
                    player = "O"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
        }


    } else if (Z == 'X') {
        Z = 'O'
        when (y) {
            "1 1" -> {
                if (X[0] == '_') {
                    X[0] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "1 2" -> {
                if (X[1] == '_') {
                    X[1] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "1 3" -> {
                if (X[2] == '_') {
                    X[2] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 1" -> {
                if (X[3] == '_') {
                    X[3] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 2" -> {
                if (X[4] == '_') {
                    X[4] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "2 3" -> {
                if (X[5] == '_') {
                    X[5] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 1" -> {
                if (X[6] == '_') {
                    X[6] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 2" -> {
                if (X[7] == '_') {
                    X[7] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
            "3 3" -> {
                if (X[8] == '_') {
                    X[8] = 'O'
                    RulesClass().pictureFun()
                    check()
                    player = "X"

                } else {
                    println("This cell is occupied! Choose another one!")
                }
            }
        }
    }
}

fun check() {
    if (
        X[0] != '_' && X[1] != '_' && X[2] != '_' && X[0] == X[1] && X[0] == X[2] && X[1] == X[2] ||
        X[0] != '_' && X[3] != '_' && X[6] != '_' && X[0] == X[3] && X[0] == X[6] && X[3] == X[6] ||
        X[0] != '_' && X[4] != '_' && X[8] != '_' && X[0] == X[4] && X[0] == X[8] && X[4] == X[8]
    ) {
        println("${X[0]} wins!!!")
        OVER = "Game over =)"
    } else if (
        X[3] != '_' && X[4] != '_' && X[5] != '_' && X[3] == X[4] && X[3] == X[5] && X[4] == X[5] ||
        X[1] != '_' && X[4] != '_' && X[7] != '_' && X[1] == X[4] && X[1] == X[7] && X[4] == X[7] ||
        X[6] != '_' && X[4] != '_' && X[2] != '_' && X[6] == X[4] && X[6] == X[2] && X[4] == X[2]
    ) {
        println("${X[4]} wins!!!")
        OVER = "Game over =)"
    } else if (
        X[6] != '_' && X[7] != '_' && X[8] != '_' && X[6] == X[7] && X[6] == X[8] && X[7] == X[8] ||
        X[2] != '_' && X[5] != '_' && X[8] != '_' && X[2] == X[5] && X[2] == X[8] && X[5] == X[8]
    ) {
        println("${X[8]} wins!!!")
        OVER = "Game over"
    } else if (X.contains('X') && X.contains('O') && !(X.contains('_'))) {
        println("Draw!!!")
        OVER = "Game over =)"
    }
}