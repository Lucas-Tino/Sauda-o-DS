package com.example.novotecds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.novotecds.ui.theme.NovotecdsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NovotecdsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Novotec()
                }
            }
        }
    }
}

@Composable
fun Novotec(modifier: Modifier = Modifier) {
    // Imagem de fundo
    Image(
        painter = painterResource(R.drawable.backgroundtech),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

    // Coluna para organização sequencial vertical
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = stringResource(R.string.saudacao_ds),
            fontSize = 25.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.pam_e_nome),
            fontSize = 17.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp)
        )

        //Imagem tecnologia
        Image(
            painter = painterResource(R.drawable.technology),
            contentDescription = null,
            modifier = Modifier
                .padding(40.dp)
                .align(Alignment.CenterHorizontally)
                .scale(1.6F)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun NovotecPreview() {
    NovotecdsTheme {
        Novotec()
    }
}