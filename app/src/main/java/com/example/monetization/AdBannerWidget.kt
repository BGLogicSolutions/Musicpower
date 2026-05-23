package com.example.monetization

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.SpotifyGreen

@Composable
fun AdBannerWidget() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFF121212))
            .border(1.dp, Color.White.copy(alpha = 0.05f), RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color(0xFF282828)),
                contentAlignment = Alignment.Center
            ) {
                Text("AD", color = SpotifyGreen, fontSize = 10.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    "MUSICPOWER PREMIUM",
                    color = Color.White,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Text(
                    "Unlock 20-band EQ without ads.",
                    color = Color(0xFFB3B3B3),
                    fontSize = 10.sp
                )
            }
        }
        
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .background(Color.White)
                .clickable { /* TODO: Upgrade */ }
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                "UPGRADE",
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = (-0.2).sp
            )
        }
    }
}
