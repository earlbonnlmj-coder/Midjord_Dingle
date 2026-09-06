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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var userAnswer by remember {
        mutableStateOf("")
    }
    // Phase 3: Added the expected answer (val - does not change)
    val correctAnswer = "CAT"

    // Phase 3: Added score state (var - changes dynamically)
    var score by remember {
        mutableStateOf(0)
    }

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
            text = "TAC",
            fontSize = 40.sp
        )
        Text(
            text = "Unscramble the word!"
        )
        OutlinedTextField(
            value = userAnswer,
            onValueChange = {
                userAnswer = it
            },
            label = {
                Text("Enter your answer")
            }
        )
        // Phase 3: Check if userAnswer matches correctAnswer upon click
        Button(
            onClick = {
                if (userAnswer == correctAnswer) {
                    score++
                }
            }
        ) {
            Text("SUBMIT")
        }
        // Phase 3: Bind score state dynamically using String template
        Text(
            text = "Score: $score"
        )
    }
}