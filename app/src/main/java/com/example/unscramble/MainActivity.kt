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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
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
    // Phase 6: Obtain instance of GameViewModel
    val viewModel: GameViewModel = viewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "UNSCRAMBLE",
            fontSize = 30.sp
        )
        // Phase 6: Read word directly from ViewModel
        Text(
            text = viewModel.words[viewModel.currentWordIndex],
            fontSize = 40.sp
        )
        Text(
            text = "Unscramble the word!"
        )
        OutlinedTextField(
            value = viewModel.userAnswer,
            onValueChange = { },
            label = {
                Text("Enter your answer")
            }
        )
        Button(
            onClick = { }
        ) {
            Text("SUBMIT")
        }
        // Phase 6: Read score directly from ViewModel
        Text(
            text = "Score: ${viewModel.score}"
        )
    }
}