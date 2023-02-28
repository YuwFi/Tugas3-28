package edu.uksw.fti.pam.pamactivityintent.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.screens.SignUp
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme


val Poppins = FontFamily(
    Font(R.font.poppinsbold, FontWeight.Bold),
    Font(R.font.poppinssemibold, FontWeight.SemiBold),
    Font(R.font.poppinsmedium, FontWeight.Medium)
)

@Composable
fun SearchScreen() {val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = scrollState)
            .background(Color.White)
    ) {

        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                shape = RoundedCornerShape(7.dp),
            ) {
                Text(
                    text = stringResource(R.string.text_advancedsearch),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = Color.Black,
                )
                Icon(
                    Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.im_profile_screen_kucing),
                contentDescription = "Profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
        }

        var expanded by remember { mutableStateOf(false) }
        val suggestions = listOf(stringResource(R.string.text_sort_latestupdate), stringResource(R.string.text_sort_highestranking), stringResource(R.string.text_sort_mostfollows), stringResource(R.string.text_completed))
        var selectedText by remember { mutableStateOf("") }
        var textfieldSize by remember { mutableStateOf(Size.Zero)}
        val icon = if (expanded)
            Icons.Filled.KeyboardArrowUp
        else
            Icons.Filled.KeyboardArrowDown

        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            OutlinedTextField(
                value = selectedText,
                onValueChange = { selectedText = it },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color.White)
                    .onGloballyPositioned { coordinates ->
                        textfieldSize = coordinates.size.toSize()
                    },
                label = {
                    Text (
                        text = stringResource(R.string.text_sortby),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = Color.Black,
                    )
                },
                trailingIcon = {
                    Icon(icon,"sortlist",
                        Modifier.clickable { expanded = !expanded },
                        tint = Color.Black
                    )
                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(with(LocalDensity.current){textfieldSize.width.toDp()})
            ) {
                suggestions.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedText = label
                        expanded = false
                    }) {
                        Text(text = label,
                            color = Color.Black)
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {
            val genrelist = listOf(
                stringResource(R.string.text_genre_action),
                stringResource(R.string.text_genre_curse),
                stringResource(R.string.text_genre_fantasy),
                stringResource(R.string.text_genre_horror),
                stringResource(R.string.text_genre_isekai),
                stringResource(R.string.text_genre_magic),
                stringResource(R.string.text_genre_emperror)
            )
            LazyRow(){
                items(genrelist){item ->
                    cardGenre(genreName = "$item")
                }
            }
        }
        Text(
            text = stringResource(R.string.text_browse),
            fontFamily = Poppins,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(start = 10.dp),
            color = Color.Black
        )

        Row(modifier = Modifier
            .padding(start = 10.dp, end=10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White
            ){
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.imtalented),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                    Column(modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)) {
                        Text(
                            text = "I'm Not That Kind of Talent",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black)
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.Star,
                                        contentDescription = "Rate",
                                        tint = Color.Black,
                                        modifier = Modifier.size(14.dp)

                                    )
                                    Text(text = "4.6/5.0",
                                        fontFamily = Poppins,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black)
                                }
                            }
                            Image(
                                painter = painterResource(id = R.drawable.southkr),
                                contentDescription = "Country",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(26.dp)
                            )
                            Card(
                                modifier = Modifier
                                    .padding(2.dp)
                                    .height(15.dp)
                                    .width(72.dp),
                                backgroundColor = Color(0xffF0F1F2)
                            ) {
                                Row() {
                                    Icon(
                                        Icons.Default.CheckCircle,
                                        contentDescription = "Status",
                                        tint = Color.Red,
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = stringResource(R.string.text_ongoing),
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.ThumbUp,
                                        contentDescription = "Rate",
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = "47k",
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(text = stringResource(R.string.text_nottalent_desc),
                            fontSize = 10.sp,
                            color = Color.Black)
                    }
                }
            }
        }

        Row(modifier = Modifier
            .padding(start = 10.dp, end=10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White
            ){
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.trashcount),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                    Column(modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)) {
                        Text(
                            text = "Lout of Count's Family",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black)
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.Star,
                                        contentDescription = "Rate",
                                        tint = Color.Black,
                                        modifier = Modifier.size(14.dp)

                                    )
                                    Text(text = "4.8/5.0",
                                        fontFamily = Poppins,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black)
                                }
                            }
                            Image(
                                painter = painterResource(id = R.drawable.southkr),
                                contentDescription = "Country",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(26.dp)
                            )
                            Card(
                                modifier = Modifier
                                    .padding(2.dp)
                                    .height(15.dp)
                                    .width(72.dp),
                                backgroundColor = Color(0xffF0F1F2)
                            ) {
                                Row() {
                                    Icon(
                                        Icons.Default.CheckCircle,
                                        contentDescription = "Status",
                                        tint = Color(0xFF45ba45),
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = stringResource(R.string.text_completed),
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.ThumbUp,
                                        contentDescription = "Rate",
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = "87k",
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(text = stringResource(R.string.text_countfam_desc),
                            fontSize = 10.sp,

                            color = Color.Black)
                    }
                }
            }
        }
        Row(modifier = Modifier
            .padding(start = 10.dp, end=10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White
            ){
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.novelextra),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                    Column(modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)) {
                        Text(
                            text = "The Novel's Extra",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black)
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.Star,
                                        contentDescription = "Rate",
                                        tint = Color.Black,
                                        modifier = Modifier.size(14.dp)

                                    )
                                    Text(text = "4.7/5.0",
                                        fontFamily = Poppins,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black)
                                }
                            }
                            Image(
                                painter = painterResource(id = R.drawable.southkr),
                                contentDescription = "Country",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(26.dp)
                            )
                            Card(
                                modifier = Modifier
                                    .padding(2.dp)
                                    .height(15.dp)
                                    .width(72.dp),
                                backgroundColor = Color(0xffF0F1F2)
                            ) {
                                Row() {
                                    Icon(
                                        Icons.Default.CheckCircle,
                                        contentDescription = "Status",
                                        tint = Color(0xFF45ba45),
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = stringResource(R.string.text_completed),
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.ThumbUp,
                                        contentDescription = "Rate",
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = "33k",
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(text = stringResource(R.string.text_novelextra_desc),

                            fontSize = 10.sp,

                            color = Color.Black)
                    }
                }
            }
        }
        Row(modifier = Modifier
            .padding(start = 10.dp, end=10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White
            ){
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.magicacademy),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                    Column(modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)) {
                        Text(
                            text = "Life of Magic Academy Mage",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black)
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.Star,
                                        contentDescription = "Rate",
                                        tint = Color.Black,
                                        modifier = Modifier.size(14.dp)

                                    )
                                    Text(text = "4.5/5.0",
                                        fontFamily = Poppins,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black)
                                }
                            }
                            Image(
                                painter = painterResource(id = R.drawable.southkr),
                                contentDescription = "Country",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(26.dp)
                            )
                            Card(
                                modifier = Modifier
                                    .padding(2.dp)
                                    .height(15.dp)
                                    .width(72.dp),
                                backgroundColor = Color(0xffF0F1F2)
                            ) {
                                Row() {
                                    Icon(
                                        Icons.Default.CheckCircle,
                                        contentDescription = "Status",
                                        tint = Color.Red,
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = stringResource(R.string.text_ongoing),
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.ThumbUp,
                                        contentDescription = "Rate",
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = "10k",
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(text = stringResource(R.string.text_magicacademy_desc),
                            fontSize = 10.sp,
                            color = Color.Black)
                    }
                }
            }
        }
        Row(modifier = Modifier
            .padding(start = 10.dp, end=10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.White
            ){
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.frozenplayer),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                    Column(modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)) {
                        Text(
                            text = "The Frozen Player Returns",
                            fontFamily = Poppins,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black)
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.Star,
                                        contentDescription = "Rate",
                                        tint = Color.Black,
                                        modifier = Modifier.size(14.dp)

                                    )
                                    Text(text = "4.3/5.0",
                                        fontFamily = Poppins,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black)
                                }
                            }
                            Image(
                                painter = painterResource(id = R.drawable.southkr),
                                contentDescription = "Country",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(26.dp)
                            )
                            Card(
                                modifier = Modifier
                                    .padding(2.dp)
                                    .height(15.dp)
                                    .width(72.dp),
                                backgroundColor = Color(0xffF0F1F2)
                            ) {
                                Row() {
                                    Icon(
                                        Icons.Default.CheckCircle,
                                        contentDescription = "Status",
                                        tint = Color(0xFF45ba45),
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = stringResource(R.string.text_completed),
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                            Box(){
                                Row() {
                                    Icon(
                                        Icons.Default.ThumbUp,
                                        contentDescription = "Rate",
                                        modifier = Modifier.size(13.dp)

                                    )
                                    Text(
                                        text = "12k",
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = Poppins,
                                        fontSize = 10.sp,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                        Text(text = stringResource(R.string.text_frozenplayer_desc),

                            fontSize = 10.sp,

                            color = Color.Black)
                    }
                }
            }
        }
    }
}

@Composable
fun cardGenre(genreName: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .height(26.dp)
            .width(66.dp),
        shape = RoundedCornerShape(7.dp) ,
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = genreName, fontSize = 12.sp, fontFamily = Poppins,
                color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable

fun SearchScreenPreview(){
    PAMActivityIntentTheme {
        SearchScreen()
    }
}