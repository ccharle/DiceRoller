package org.pursuit.kotlindiceapp

class DiceModel {
    private val dieMap = HashMap<Int, Int>()
    init {
        addDieImageToMap()
    }

    private fun addDieImageToMap() {
        dieMap[1] = R.drawable.dice1
        dieMap[2] = R.drawable.dice2
        dieMap[3] = R.drawable.dice3
        dieMap[4] = R.drawable.dice4
        dieMap[5] = R.drawable.dice5
        dieMap[6] = R.drawable.dice6
    }

    fun getDie(die : Int) : Int {
        return dieMap[die]!!
    }
}
