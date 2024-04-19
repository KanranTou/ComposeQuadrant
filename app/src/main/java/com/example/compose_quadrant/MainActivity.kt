package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantInfoCard(
                title = stringResource(R.string.text_composable_title_text),
                body = stringResource(R.string.text_composable_body_text),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)
            )
            QuadrantInfoCard(
                title = stringResource(R.string.image_composable_title_text),
                body = stringResource(R.string.image_composable_body_text),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantInfoCard(
                title = stringResource(R.string.row_composable_title_text),
                body = stringResource(R.string.row_composable_body_text),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
            )
            QuadrantInfoCard(
                title = stringResource(R.string.column_composable_title_text),
                body = stringResource(R.string.column_composable_body_text),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantInfoCard(
    title: String,
    body: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp),
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Compose_quadrantTheme {
        Quadrant()
    }
}