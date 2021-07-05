package org.pursuit.kotlindiceapp

class DependencyInjectorImpl : ComponentContract.DependencyInjector {
    override fun diceModel(): DiceModel {
        return DiceModel()
    }
}