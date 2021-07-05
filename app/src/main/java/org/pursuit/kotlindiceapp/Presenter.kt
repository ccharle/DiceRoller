package org.pursuit.kotlindiceapp

import java.util.*

class Presenter(view : ComponentContract.View,
    dependencyInjector : ComponentContract.DependencyInjector
    ) : ComponentContract.Presenter {

    private val diceModel = dependencyInjector.diceModel()
    private var view : ComponentContract.View = view

    override fun rollDie() {
        val dieOne = diceModel.getDie(rollResult())
        val dieTwo = diceModel.getDie(rollResult())
        view.showDice(dieOne, dieTwo)
    }

    override fun rollResult() : Int {
        return Random().nextInt(6) + 1
    }
}