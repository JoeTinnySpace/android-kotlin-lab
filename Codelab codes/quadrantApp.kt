class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyChristmasTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(){
    Column(
        Modifier.fillMaxWidth()
    ){
        Row(Modifier.weight(1f)){
            QuadrantCard(
                title = stringResource(id = R.string.title1),
                desc = stringResource(id = R.string.desc1),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)

            )
            QuadrantCard(
                title = stringResource(id = R.string.title2),
                desc = stringResource(id = R.string.desc2),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)

            )
        }
        Row(Modifier.weight(1f)){
            QuadrantCard(
                title = stringResource(id = R.string.title3),
                desc = stringResource(id = R.string.desc3),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)

            )
            QuadrantCard(
                title = stringResource(id = R.string.title4),
                desc = stringResource(id = R.string.desc4),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)

            )

        }
    }
}

@Composable
private fun QuadrantCard(title: String, desc: String, color: Color, modifier : Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}




@Preview(showBackground = true)
@Composable
fun HappyChristmasPreview() {
    HappyChristmasTheme {
        QuadrantApp()
    }
}