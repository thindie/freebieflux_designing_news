package com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thindie.freebiefluxnewsappuikitimpl.R

val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(600),
        color = Color(0xFF333647),

        ),
    titleMedium = TextStyle(
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(700),
        color = Color(0xFF333647),

        ),
    titleSmall = TextStyle(
        fontSize = 16.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),

        color = Color(0xFF555A77),

        ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(600),
        color = Color(0xFFFFFFfF),
    ),
    bodyMedium = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(500),
        color = Color(0xFF7C82A1),
    ),
    bodySmall = TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7C82A1),
    ),
    labelLarge = TextStyle(
        fontSize = 14.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7C82A1)
    ),
    labelMedium = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7C82A1),
    ),
    labelSmall = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily(Font(R.font.sf_pro)),
        fontWeight = FontWeight(600),
        color = Color(0xFFFFFFFF),
    )
)


