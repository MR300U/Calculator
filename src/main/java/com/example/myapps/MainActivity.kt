package com.example.myapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapps.ui.theme.MyAppSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppSTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    val colorLight = colorResource(id = R.color.gradiant_front_light_blue)
    val colorBlue = colorResource(id = R.color.gradiant_front_blue)

    val configuration = LocalConfiguration.current
    val screenWidth1 = configuration.screenWidthDp.toFloat()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))

    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.6f)
                    .blur(2.dp)
                    .background(
                        brush = Brush.horizontalGradient
                            (
                            listOf(
                                colorResource(id = R.color.gradiant_back_blue),
                                colorResource(id = R.color.gradiant_back_green)
                            )
                        ), shape = RoundedCornerShape(0.dp, 0.dp, 40.dp, 40.dp)
                    )

            ) {

                Canvas(modifier = Modifier
                    .fillMaxSize()
                    .offset(x = (-120).dp, y = (-120).dp),
                    onDraw = {
                        drawCircle(
                            radius = screenWidth1 * 2f, brush = Brush.horizontalGradient(
                                listOf(
                                    colorLight, colorBlue
                                )
                            )
                        )
                    }
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.4f)
            )

        }


        Column(modifier = Modifier.fillMaxSize()) {


            Spacer(modifier = Modifier.size(40.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.20f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Welcome",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )


                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "My Application",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Mehdi Rezaei",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.80f),
                contentAlignment = Alignment.TopStart
            ) {

                SignInBox()

            }

        }


    }

}

@Composable
fun SignInBox() {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(intrinsicSize = IntrinsicSize.Min)
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(20.dp)
                .alpha(0.6f)
                .blur(50.dp, BlurredEdgeTreatment.Unbounded),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.box_sign_in)
            )

        ) {


        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(20.dp)
                .border(
                    BorderStroke(
                        2.dp, Brush.horizontalGradient(
                            listOf(
                                colorResource(id = R.color.box_sign_in), Color.White
                            )
                        )
                    ), shape = RoundedCornerShape(20.dp)
                )
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            colorResource(id = R.color.box_sign_in),
                            colorResource(id = R.color.box_sign_in)
                        )
                    ), shape = RoundedCornerShape(20.dp),
                    alpha = 0.4f
                )
                .padding(20.dp)

        ) {

            Text(
                text = "Sign In", fontSize = 20.sp, color = Color.White
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "New User ?",
                    fontSize = 15.sp,
                    color = Color.White
                )


                TextButton(onClick = {}) {
                    Text(
                        text = "create an account",
                        fontSize = 16.sp,
                        color = colorResource(id = R.color.text_green)
                    )
                }


            }


            var newValue by remember {
                mutableStateOf(TextFieldValue())
            }

//            textField email
            TextField(value = newValue, onValueChange = { newValue = it },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(30.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ), placeholder = {
                    Text(
                        text = "Email Address",
                    )
                }

            )


            Spacer(modifier = Modifier.size(10.dp))

            //textField password
            TextField(
                value = newValue, onValueChange = { newValue = it },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(30.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ), placeholder = {
                    Text(
                        text = "password",
                    )
                }, visualTransformation = PasswordVisualTransformation()


            )

            Spacer(modifier = Modifier.size(10.dp))


            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(

                        containerColor = colorResource(id = R.color.button_blue),
                        contentColor = Color.White
                    )
                ) {

                            Text(text = "Continue")
                }

            }

            Spacer(modifier = Modifier.size(10.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                Text(
                    text = "Or",
                    fontSize = 18.sp,
                    color = colorResource(id = R.color.hint)
                )

            }

            Spacer(modifier = Modifier.size(10.dp))


            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = colorResource(R.color.hint)
                )

            ) {
                Text(text = "Continue With Google")

            }

            Spacer(modifier = Modifier.size(10.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.button_blue),
                    contentColor = Color.White
                )

            ) {
                Text(text = "Continue With FaceBook")

            }


        }

    }


}


@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_7
)
@Composable
fun GreetingPreview() {
    Greeting()
    //  SignInBox()
}