package com.example.codelabcompose1.screen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codelabcompose1.ui.theme.CodelabCompose1Theme

@Composable
fun OnBoardingScreen(clickAction: () -> Unit) {
    // TODO: 31/10/2021 AD Use hosted
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to the basics Codelab!")
            Button(
                onClick = clickAction,
                modifier = Modifier.padding(top = 24.dp)
            ) {
                Text(text = "Continue")
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    name = "Dark mode"
)
@Composable
fun PreviewOnBoardingScreen() {
    CodelabCompose1Theme {
        OnBoardingScreen { }
    }
}
