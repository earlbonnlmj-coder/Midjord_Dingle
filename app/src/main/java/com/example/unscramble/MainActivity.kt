package com.example.unscramble

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.unscramble.ui.theme.UnscrambleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnscrambleTheme {
                GameScreen()
            }
        }
    }
}

@Composable
fun GameScreen() {
<<<<<<< HEAD
=======
    var userAnswer by remember {
        mutableStateOf("")
    }

    val words = listOf(
        "CAT",
        "DOG",
        "BOOK"
    )

    var currentWordIndex by remember {
        mutableStateOf(0)
    }

    val correctAnswer = words[currentWordIndex]

    var scrambledWord by remember {
        mutableStateOf(
            words[0].shuffled().joinToString("")
        )
    }

    var score by remember {
        mutableStateOf(0)
    }

>>>>>>> 2a8ad9c31e63d69c91b444e2c2f87c717f0a67bd
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "UNSCRAMBLE",
            fontSize = 30.sp
        )

        Text(
<<<<<<< HEAD
            text = "TAC",
=======
            text = scrambledWord,
>>>>>>> 2a8ad9c31e63d69c91b444e2c2f87c717f0a67bd
            fontSize = 40.sp
        )

        Text(
            text = "Unscramble the word!"
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = {
                Text("Enter your answer")
            }
        )

        Button(
<<<<<<< HEAD
            onClick = { }
=======
            onClick = {
                if (userAnswer == correctAnswer) {
                    score++

                    if (currentWordIndex < words.size - 1) {
                        currentWordIndex++
                        userAnswer = ""
                        scrambledWord = words[currentWordIndex]
                            .shuffled()
                            .joinToString("")
                    }
                }
            }
>>>>>>> 2a8ad9c31e63d69c91b444e2c2f87c717f0a67bd
        ) {
            Text("SUBMIT")
        }

        Text(
            text = "Score: 0"
        )
    }
}