package org.pursuit.kotlindiceapp

interface ComponentContract {

    interface BaseView<T> {
        fun setPresenter(presenter : T)
    }

    interface View : BaseView<Presenter> {
        fun showDice(diceOne : Int, diceTwo : Int)
    }

    interface Presenter {
        fun rollDie()
        fun rollResult(): Int
    }

    interface DependencyInjector {
        fun diceModel() : DiceModel
    }
}

