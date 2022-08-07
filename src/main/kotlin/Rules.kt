class RulesClass {

    fun motion(x: String) {
        println()
        println("Motion $x:")
        println()
    }

    fun rulesFun() {

        println(
            """
        Rules of the game: 
        The first player goes "X", the second player goes "Y".
        The winner is the player who places three consecutive signs vertically, 
        horizontally or diagonally.

        To place the sign at the corresponding position, 
        numerical coordinates are used with respect to the row and column (through the gap), 
        where the initial position is "1 1", the final position is "3 3".
        For example:
       
        > 2 3 
      
        _ _ _
        _ _ X
        _ _ _
        
        > 1 2 
        
        _ O _
        _ _ X
        _ _ _
        
        May the force come with you!
        
    """.trimIndent()
        )

        println("Loading the game...")
        for (i in 0..90 step 10) {
            print("$i%...")
            Thread.sleep(500L)
        }
        print("100%")
        println()
        println("Let's go!")
        println()
    }

    fun pictureFun() {
        println(
            """
        ---------
        | ${X[0]} ${X[1]} ${X[2]} |
        | ${X[3]} ${X[4]} ${X[5]} |
        | ${X[6]} ${X[7]} ${X[8]} |
        ---------
    """.trimIndent()
        )
    }
}

