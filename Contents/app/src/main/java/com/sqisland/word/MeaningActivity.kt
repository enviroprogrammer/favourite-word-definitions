package com.sqisland.word

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_meaning.*

class MeaningActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_meaning)

    // extract extra from intent
    val word = intent.getStringExtra(KEY_WORD)
    title = word

    meaning.text = when(word) {
      getString(R.string.agile_word) -> getString(R.string.agile_meaning)
      getString(R.string.delirium_word) -> getString(R.string.delirium_meaning)
      else -> getString(R.string.unknown_word) // error handling
    }
  }

  companion object {
    const val KEY_WORD = "word"
  }
}