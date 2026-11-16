package com.example.jetpacktutorial

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import com.example.jetpacktutorial.ui.theme.JetpackTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingImage(stringResource(R.string.jetpack_title_text),
                        stringResource(R.string.jetpack_body1_text), stringResource(R.string.jetpack_body2_text)
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingText(title: String, body1: String, body2: String, modifier: Modifier = Modifier){
    Column(modifier){
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                //.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = body1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp, 0.dp, 16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = body2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun GreetingImage(title: String, body1: String, body2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null,

        )
        GreetingText(
            title = title,
            body1 = body1,
            body2 = body2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTutorialTheme {
        GreetingText(stringResource(R.string.jetpack_title_text),
            stringResource(R.string.jetpack_body1_text), stringResource(R.string.jetpack_body2_text)
        )
    }
}