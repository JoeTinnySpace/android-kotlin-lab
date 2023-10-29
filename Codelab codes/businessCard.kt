
@Composable
private fun TitleInfo(photo: Painter, title: String, role : String){
    Image(
        painter = photo,
        contentDescription = null,
        modifier = Modifier
            .clip(CircleShape)
            .size(200.dp)
    )
    Text(
        text = title,
        fontWeight = FontWeight.SemiBold,
        fontSize = 36.sp,
        style = TextStyle(
            textAlign = TextAlign.Center
        )
    )
    Text(
        text = role,
        fontSize = 16.sp,
        style = TextStyle(
            textAlign = TextAlign.Center
        )
    )
}

@Composable
private fun FooterInfo(phone: String, social: String, email: String){
    Column (
        Modifier.padding(top = 80.dp)
    ) {

        IconCard(info = phone, icon = painterResource(id = R.drawable.baseline_call_24))
        IconCard(info = social, icon = painterResource(id = R.drawable.baseline_people_24))
        IconCard(info = email, icon = painterResource(id = R.drawable.baseline_people_24))
    }
}

@Composable
private fun IconCard(icon : Painter, info: String){
    Row(Modifier.padding(2.dp)){
        Icon(painter = icon, contentDescription = null)
        Text(text = info, color = Color(0xFF3ddc84))
    }
}


@Composable
fun BusinessCard(
    photo: Painter, title: String, role: String, phone: Int, social: String, email: String){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        TitleInfo(photo = photo, title = title, role = role)
        FooterInfo(phone = phone.toString(), social = social, email = email)
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(
            photo = painterResource(id = R.drawable.avatar) ,
            title = "Joe" ,
            role = "Android Dev",
            phone = 1234567890,
            social = "linkedin",
            email = "joe@gmail.com")
    }
}