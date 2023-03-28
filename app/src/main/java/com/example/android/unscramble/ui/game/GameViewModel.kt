package com.example.android.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    private var score = 0
    private var _currentWordCount = 0
    val currentWordCount: Int
        get() = _currentWordCount
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord
}