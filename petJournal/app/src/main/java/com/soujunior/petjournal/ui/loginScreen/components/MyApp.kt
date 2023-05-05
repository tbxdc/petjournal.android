package com.soujunior.petjournal.ui.loginScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.soujunior.petjournal.ui.registerScreen.components.ImageLogo

@Composable
fun MyApp(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(modifier = Modifier.fillMaxSize().padding(), contentAlignment = Alignment.TopCenter) {

            ImageLogo(modifier = Modifier.size(200.dp))
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.80f)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .padding(30.dp)
                .background(MaterialTheme.colors.background),
            content = {
                Text(
                    text = "Acessar conta",
                    style = MaterialTheme.typography.h2,
                )
                Spacer(modifier = Modifier.padding(top = 50.dp))
                Form(navController)
                Spacer(modifier = Modifier.padding(top = 70.dp))
                Footer(navController)
            }
        )
    }
}