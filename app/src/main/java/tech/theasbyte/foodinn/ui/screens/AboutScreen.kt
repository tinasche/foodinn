package tech.theasbyte.foodinn.ui.screens

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import tech.theasbyte.foodinn.R

@Preview(showSystemUi = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(horizontal = 20.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.dsc00466),
            contentDescription = "Author Pic",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(2.dp, shape = CircleShape, color = Color(parseColor("#0d3b66")))
        )
        Spacer(modifier = modifier.height(18.dp))
        Text(text = "About Me", style = MaterialTheme.typography.displayMedium)
        Spacer(modifier = modifier.height(18.dp))
        Text(text = buildAnnotatedString {
            append("This app is built with love by Tinashe Chitakunye, a ")
            withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)) {
                append("Solo Mobile App Developer")
            }
            append(" based in Harare, Zimbabwe")
        }, textAlign = TextAlign.Center)
    }

}
