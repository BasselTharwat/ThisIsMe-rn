package com.example.thisismern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thisismern.ui.theme.ThisIsMernTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThisIsMernTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MyCard(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Name(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.android_logo)
    Column (modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Image(painter = image, contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xff073042)))
        Text(text = "Bassel Tharwat",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.W300,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.padding(10.dp))
        Text(text = "Android-developer-to-be",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            color = Color(0xff006c3a))
    }
}

@Composable
fun Handles(modifier: Modifier){
    Column (modifier,
        verticalArrangement = Arrangement.Top){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
            ){
            Spacer(modifier = Modifier.weight(0.45f))
            Icon(imageVector = Icons.Default.Email,
                contentDescription = "email",
                tint = Color(0xff006c3a),
                modifier = Modifier
                    .height(15.dp)
                    .width(36.dp)
            )
            Text(text = "bassel.tharwat01@gmail.com",
                textAlign = TextAlign.Right,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier)
            Spacer(modifier = Modifier.weight(0.45f))

        }
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.weight(0.45f))
            Icon(imageVector = Icons.Default.Phone,
                contentDescription = "number",
                tint = Color(0xff006c3a),
                modifier = Modifier
                    .height(15.dp)
                    .width(36.dp)
            )
            Text(text = "+02 01111211665",
                textAlign = TextAlign.Right,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.weight(0.45f))

        }
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            val image = painterResource(id = R.drawable.work_24dp_000000)
            Spacer(modifier = Modifier.weight(0.45f))
            Image(painter = image,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xff006c3a)),
                modifier = Modifier
                    .height(15.dp)
                    .width(36.dp)
            )
            Text(text = "github.com/BasselTharwat",
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.weight(0.45f))
        }
    }
}

@Composable
fun MyCard(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffd2e8d4)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Name(
            modifier = Modifier.weight(2.5f)
        )
        Handles(
            modifier = Modifier.weight(1f)
        )
    }


}


@Preview(showBackground = true, widthDp = 320)
@Composable
fun ThisIsMernPreview() {
    ThisIsMernTheme {
        MyCard(modifier = Modifier)

    }
}