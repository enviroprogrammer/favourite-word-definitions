package com.sqisland.word

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  fun goToMeaning(v: View) {
    val word = (v as Button).text // get button text from XML.
    val intent = Intent(this@MainActivity, MeaningActivity::class.java)
    intent.putExtra(MeaningActivity.KEY_WORD, word)
    startActivity(intent)
  }
}