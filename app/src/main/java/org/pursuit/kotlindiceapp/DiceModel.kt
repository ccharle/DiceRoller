package org.pursuit.kotlindiceapp

import java.util.*

class DiceModel : MainContract.Model {
  private var dieOne: Int = 0
  private var dieTwo: Int = 0


  private val oneSidedDie:
          Int get() = R.drawable.dice1
  private val twoSidedDie:
          Int get() = R.drawable.dice2
  private val threeSidedDie:
          Int get() = R.drawable.dice3
  private val fourSidedDie:
          Int get() = R.drawable.dice4
  private val fiveSidedDie:
          Int get() = R.drawable.dice5
  private val sixSidedDie:
          Int get() = R.drawable.dice6


    override fun dieRolled(onDieFinished: MainContract.Model.onDieFinishedListener) {
        val diceRoll = Random().nextInt(6) + 1
        val diceRoll2 = Random().nextInt(6) + 1

        when (diceRoll) {
            1 -> dieOne = oneSidedDie
            2 -> dieOne = twoSidedDie
            3 -> dieOne = threeSidedDie
            4 -> dieOne = fourSidedDie
            5 -> dieOne = fiveSidedDie
            6 -> dieOne = sixSidedDie

        }
        when (diceRoll2) {
            1 -> dieTwo = oneSidedDie
            2 -> dieTwo = twoSidedDie
            3 -> dieTwo = threeSidedDie
            4 -> dieTwo = fourSidedDie
            5 -> dieTwo = fiveSidedDie
            6 -> dieTwo = sixSidedDie

        }
        onDieFinished.onDieRollFinished(dieOne,dieTwo)

    }


}




