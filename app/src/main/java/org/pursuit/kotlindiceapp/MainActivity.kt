package org.pursuit.kotlindiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.main_layout.*


class MainActivity : AppCompatActivity(), MainContract.view {
    private lateinit var mPresenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        mPresenter = Presenter(this, DiceModel())


        roll_bttn.setOnClickListener {
            (mPresenter.rollDie())


        }



    }

    override fun showDice(diceOne: Int, diceTwo: Int) {
        super.showDice(diceOne, diceTwo)
        dice_one.setBackgroundResource(diceOne)
        dice_two.setBackgroundResource(diceTwo)
    }
}
