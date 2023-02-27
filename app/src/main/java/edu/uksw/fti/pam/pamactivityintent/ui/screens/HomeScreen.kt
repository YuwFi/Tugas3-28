package edu.uksw.fti.pam.pamactivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivityintent.R
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .padding(top = 10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        /*Text(text = "Body Content", color = Color(0xFF0F9D58))*/

        Column (
            modifier = Modifier
            /*.fillMaxSize()*/
        ){
            Text(
                text = "Popular New Titles",
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Card(
                modifier = Modifier
                    .padding(top = 5.dp),
                elevation = 4.dp,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.im_back_kota),
                    contentDescription = null,
                )
                Column(
                    modifier = Modifier
                        .padding(10.dp),
                    horizontalAlignment = Alignment.Start


                ) {
                    Text(
                        text = "No.09",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_pop_title2),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredHeight(150.dp)
                            /*.requiredWidth(100.dp)*/,
                            alignment = Alignment.TopStart
                        )
                        Column (
                            modifier = Modifier
                                .requiredWidth(240.dp)
                                .padding(start = 10.dp),
                        ) {
                            Text(
                                text = "Amarimono Isekaijin no Jiyuu Seikatsu: Yuusha ja Nai node...  ",
                                fontWeight = FontWeight.SemiBold
                            )
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Card (
                                    backgroundColor = Color(0xffF0F1F2)
                                ) {
                                    Text(
                                        text = "ACTION",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(1.dp)
                                    )
                                }
                                Card (
                                    backgroundColor = Color(0xffF0F1F2)
                                ){
                                    Text(
                                        text = "ADNVETURE",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(1.dp)
                                    )
                                }
                                Card (
                                    backgroundColor = Color(0xffF0F1F2)
                                ){
                                    Text(
                                        text = "FANTASY",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(1.dp)
                                    )
                                }
                                Card (
                                    backgroundColor = Color(0xffF0F1F2)
                                ){
                                    Text(
                                        text = "ISEKAI",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(1.dp)
                                    )
                                }
                            }
                            Text(
                                text = "Shinichi Sagara, a black corporate warrior. After overcoming a nightmare of consecutive workdays, he finally got on a bus to return home, but... ",
                                fontSize = 10.sp)
                            Text(
                                text = "Fujimori Fukuro, Muramatsu Mayu",
                                fontSize = 13.sp,
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier.padding(top = 25.dp)
                            )


                        }

                    }

                }

            }

        }

        Column(
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement  =  Arrangement.SpaceBetween
            )
            {
                Text(
                    text = "Latest Updates",
                    fontFamily = FontFamily.Monospace,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_round_arrow_forward_24),
                    contentDescription = null,
                )

            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp)

            ) {
                Card(
                    backgroundColor = Color(0xffF0F1F2),
                    modifier = Modifier.requiredWidth(180.dp)

                ) {
                    Row(
                        modifier = Modifier.padding(5.dp),
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_late_1),
                            contentDescription = null,
                            modifier = Modifier.requiredHeight(100.dp)

                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "Kimi no Iru Machi",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .requiredHeight(25.dp)


                            )
                            Row(
                                modifier = Modifier.padding(top = 5.dp),
                                horizontalArrangement = Arrangement.spacedBy(1.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.im_flag_1),
                                    contentDescription = null,
                                )
                                Text(
                                    text = "Vol. 7 Ch.61",
                                    fontSize = 9.sp,

                                    )
                            }
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(1.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_users_1),
                                    contentDescription = null,
                                )
                                Text(
                                    text = "Hayate",
                                    fontSize = 9.sp,

                                    )
                            }
                            Text(
                                text = "18 secs",
                                fontSize = 9.sp,

                                )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_chat_1),
                                contentDescription = null
                            )

                        }

                    }


                }

                Card(
                    backgroundColor = Color(0xffF0F1F2),
                    modifier = Modifier.requiredWidth(180.dp)

                ) {
                    Row(
                        modifier = Modifier.padding(5.dp),
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_late_2),
                            contentDescription = null,
                            modifier = Modifier.requiredHeight(100.dp)
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "Sword Art Online: Progressive - Ku...",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .requiredHeight(25.dp)

                            )
                            Row(
                                modifier = Modifier.padding(top = 5.dp) ,
                                horizontalArrangement = Arrangement.spacedBy(1.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.im_flag_2),
                                    contentDescription = null,
                                )
                                Text(
                                    text = "Vol. 3 Ch.16 - 016",
                                    fontSize = 9.sp,

                                    )
                            }
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(1.dp)) {

                                Image(
                                    painter = painterResource(id = R.drawable.ic_users_1),
                                    contentDescription = null,
                                )
                                Text(
                                    text = "Dreadful Decoding",
                                    fontSize = 9.sp,

                                    )
                            }
                            Text(
                                text = "2 mins",
                                fontSize = 9.sp,

                                )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_chat_1),
                                contentDescription = null
                            )

                        }

                    }


                }



            }
        }
        Column(
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement  =  Arrangement.SpaceBetween
            ){
                Text(
                    text = "Seasonal",
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 20.sp,

                    )
                Icon(
                    painter = painterResource(id = R.drawable.ic_round_arrow_forward_24),
                    contentDescription = null,
                )

            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ){
                Card(
                    backgroundColor = Color(0xffF0F1F2),
                    modifier = Modifier
                        .requiredWidth(180.dp)
                        .requiredHeight(120.dp)

                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_se_1),
                            contentDescription = null,
                            modifier = Modifier.requiredHeight(120.dp)

                        )
                        Column(
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .padding(start = 5.dp)
                                .requiredWidth(120.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "Uzaki-chan Wants to Hang Out!",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .requiredHeight(25.dp)

                            )
                            Text(
                                text = "Annoying! Cute! But Annoying! Shinichi Sakurai is a grumpy-faced, athletic and quiet college student who just wants to be left alone,  ",
                                fontSize = 9.sp,

                                )

                        }

                    }


                }
                Card(
                    backgroundColor = Color(0xffF0F1F2),
                    modifier = Modifier
                        .requiredWidth(180.dp)
                        .requiredHeight(120.dp)

                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_se_2),
                            contentDescription = null,
                            modifier = Modifier.requiredHeight(120.dp)

                        )
                        Column(
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .padding(start = 5.dp)
                                .requiredWidth(120.dp),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "Blue Lock",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .requiredHeight(25.dp)

                            )
                            Text(
                                text = "oichi Isagi lost the opportunity to go to the national high school championships because he passed to his teammate... ",
                                fontSize = 9.sp,

                                )

                        }

                    }


                }
            }


        }
        Column(
            modifier = Modifier.padding(top = 20.dp)
        ){
            Text(
                text = "Recently Added",
                fontFamily = FontFamily.Monospace,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold

            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.im_ra_1),
                        contentDescription = null,
                        modifier = Modifier.requiredHeight(120.dp)

                    )

                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.im_ra_2),
                        contentDescription = null,
                        modifier = Modifier.requiredHeight(120.dp)

                    )

                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.im_ra_3),
                        contentDescription = null,
                        modifier = Modifier.requiredHeight(120.dp)

                    )

                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.im_ra_4),
                        contentDescription = null,
                        modifier = Modifier.requiredHeight(120.dp)

                    )

                }


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMActivityIntentTheme {
        HomeScreen()
    }
}