package org.pursuit.kotlindiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity(), ComponentContract.View {

    private lateinit var presenter : ComponentContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        setPresenter(Presenter(this, DependencyInjectorImpl()))

        roll_bttn.setOnClickListener {
            (presenter.rollDie())
        }
    }

    override fun setPresenter(presenter: ComponentContract.Presenter) {
        this.presenter = presenter
    }

    override fun showDice(diceOne: Int, diceTwo: Int) {
        dice_one.setBackgroundResource(diceOne)
        dice_two.setBackgroundResource(diceTwo)
    }
}
