package org.pursuit.kotlindiceapp

class Presenter(private var viewRef: MainContract.view , private var diceModel :DiceModel) :
    MainContract.presenter, MainContract.Model.onDieFinishedListener {
    override fun rollDie() {
        diceModel.dieRolled(this)
    }

    override fun onDieRollFinished(dice1: Int, dieTwo: Int) {
        viewRef.showDice(dice1, dieTwo)
    }



}