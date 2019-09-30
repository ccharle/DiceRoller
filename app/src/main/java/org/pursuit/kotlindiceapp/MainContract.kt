package org.pursuit.kotlindiceapp

interface MainContract {
    interface view {
        fun showDice(diceOne: Int, diceTwo: Int) {

        }

    }

    interface presenter{

    fun rollDie()

    interface onDieFinishedListener {
        fun onDieRollFinished(dice1: Int, dieTwo: Int)
    }

    fun dieRolled(onDieFinished: onDieFinishedListener)


}


}

