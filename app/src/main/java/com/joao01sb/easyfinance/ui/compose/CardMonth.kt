package com.joao01sb.easyfinance.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CardMonth(modifier: Modifier = Modifier, textValue: String = "") {
    Card(
        modifier = modifier
            .padding(2.dp),
        onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, Color.White),
        colors = CardDefaults.cardColors(containerColor = Color.Black)
    ) {
        Text(
            text = "December",
            modifier = Modifier.padding(10.dp),
            fontSize = 16.sp,
            color = Color.White
        )
    }
}
