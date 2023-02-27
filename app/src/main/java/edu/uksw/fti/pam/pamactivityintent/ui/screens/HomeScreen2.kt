package edu.uksw.fti.pam.pamactivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme


data class Popular(
    var painter: Painter,
    var title: String,
    var desc: String,
    var author: String
)

@Composable
fun HomeScreen2(){
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    ){
        Column (modifier = Modifier
            .verticalScroll(state = scrollState)
            .background(Color.White)){
            val popList = listOf(
                Popular(
                    painterResource(R.drawable.jjknol),
                    "Jujutsu Kaisen Zero",
                    stringResource(R.string.text_jjk_desc),
                    "Akutami Gege",
                ),
                Popular(
                    painterResource(R.drawable.bleach),
                    "Bleach",
                    stringResource(R.string.text_bleach_desc),
                    "Kubo Tite"
                ),
                Popular(
                    painterResource(R.drawable.bsdog),
                    "Bungou Stray Dog",
                    stringResource(R.string.text_bsd_desc),
                    "Asagiri Kafka, Harukawa35"
                ),
            )
            Text(
                text = stringResource(R.string.text_popular),
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 5.dp)
            )
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(popList.size) { index ->
                    ListCardPop(popList[index])
                }
            }
            LatestList()
        }
    }
}

@Composable
fun ListCardPop(data:Popular) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(5.dp),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White
        ) {
            Row() {
                Image(
                    painter = data.painter,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                )
                Box(modifier = Modifier
                    .width(200.dp)
                    .height(150.dp)
                    .padding(1.dp)){
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(
                            text = data.title,
//                        fontFamily = Poppins,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 13.sp,
                            modifier = Modifier
                                .requiredHeight(35.dp)
                        )
                        Text(
                            text = data.desc,
//                        fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .requiredHeight(75.dp)

                        )
                        Text(
                            text = data.author,
//                        fontFamily = Poppins,
                            fontSize = 13.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                        )
                    }

                }
            }
        }
    }
}

data class Latest(
    var painter: Painter,
    var title: String,
    var desc: String,
    var author: String
)

@Composable
fun LatestList(){
    Column {
        val lateList = listOf(
            Latest(
                painterResource(R.drawable.swordduel),
                "The Slow Second Life of Sword Soldier",
                stringResource(R.string.text_swodduel_desc),
                "Saekisan, Suzu Yuuki"
            ),
            Latest(
                painterResource(R.drawable.magicrev),
                "The Magical Revolution",
                stringResource(R.string.text_magicrev_desc),
                "by developing 'magicology', which based on memories"
            ),
            Latest(
                painterResource(R.drawable.civil),
                "My Civil Servant Life As a Reincarnated Battle Race",
                stringResource(R.string.text_civilservant_desc),
                "Gi So-Ryeong, il.k"
            ),
        )
        Text(
            text = stringResource(R.string.text_latestrelease),
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 5.dp)
        )
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(lateList.size) { index ->
                ListCardLate(lateList[index])
            }
        }
        SeasonList()
    }
}

@Composable
fun ListCardLate(data:Latest) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(5.dp),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White
        ) {
            Row() {
                Image(
                    painter = data.painter,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                )
                Box(modifier = Modifier
                    .width(200.dp)
                    .height(150.dp)
                    .padding(1.dp)) {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(
                            text = data.title,
//                        fontFamily = Poppins,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 13.sp,
                            modifier = Modifier
                                .requiredHeight(35.dp)
                        )
                        Text(
                            text = data.desc,
//                        fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .requiredHeight(75.dp)

                        )
                        Text(
                            text = data.author,
//                        fontFamily = Poppins,
                            fontSize = 13.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                        )
                    }
                }
            }
        }
    }
}

data class Season(
    var painter: Painter,
    var title: String,
    var desc: String,
    var author: String
)

@Composable
fun SeasonList(){
    Column (){
        val seasList = listOf(
            Season(
                painterResource(R.drawable.demonmisfit),
                "The Misfit of Demon King",
                stringResource(R.string.text_misfitdemon_desc),
                "Shuu, Kaya Haruka"
            ),
            Season(
                painterResource(R.drawable.serialkiller),
                "Serial Killer Reincarnated in Another World",
                stringResource(R.string.text_serialkiller_desc),
                "Hitotsubu Ichigo, Hiro"
            ),
            Season(
                painterResource(R.drawable.angelnd),
                "The Angel Next Door",
                stringResource(R.string.text_angelnd_desc),
                "Saekisan, Suzu Yuuki"
            ),
        )
        Text(
            text = stringResource(R.string.text_seasonal),
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 5.dp)
        )
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(seasList.size) { index ->
                ListCardSeas(seasList[index])
            }
        }
    }
    RecentList()
}

@Composable
fun ListCardSeas(data:Season) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(5.dp),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White
        ) {
            Row {
                Image(
                    painter = data.painter,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                )
                Box(modifier = Modifier
                    .width(200.dp)
                    .height(150.dp)
                    .padding(1.dp)) {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(
                            text = data.title,
//                        fontFamily = Poppins,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 13.sp,
                            modifier = Modifier
                                .requiredHeight(35.dp)
                        )
                        Text(
                            text = data.desc,
//                        fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .requiredHeight(75.dp)

                        )
                        Text(
                            text = data.author,
//                        fontFamily = Poppins,
                            fontSize = 13.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                        )
                    }
                }
            }
        }
    }
}

data class Recent(
    var painter: Painter
)

@Composable
fun RecentList(){
    Column (){
        val receList = listOf(
            Recent(painterResource(R.drawable.im_ra_1)),
            Recent(painterResource(R.drawable.im_ra_2)),
            Recent(painterResource(R.drawable.im_ra_3)),
            Recent(painterResource(R.drawable.im_ra_4)),
        )
        Text(
            text = stringResource(R.string.text_recentlyadd),
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 5.dp)
        )
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(receList.size) { index ->
                ListCardRece(receList[index])
            }
        }
    }
}

@Composable
fun ListCardRece(data:Recent) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(5.dp),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White
        ) {
            Row() {
                Image(
                    painter = data.painter,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen2Preview() {
    PAMActivityIntentTheme {
        HomeScreen2()
    }
}