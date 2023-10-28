class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyChristmasTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TutorialHome(
                        title = stringResource(R.string.all_task_completed),
                        desc = stringResource(R.string.nice_work)
                    )
                }
            }
        }
    }
}


@Composable
fun TutorialText(title : String, desc : String, modifier: Modifier = Modifier){

    Text(
        text = title,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(top = 16.dp, bottom = 8.dp)

    )
    Text(
        text = desc,
        fontSize = 16.sp
    )


}


@Composable
fun TutorialHome(title : String, desc : String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
        painter = image,
        contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        TutorialText(
            title = title,
            desc = desc

        )

    }

}


@Preview(showBackground = true)
@Composable
fun HappyChristmasPreview() {
    HappyChristmasTheme {
        TutorialHome(
            title = stringResource(R.string.all_task_completed),
            desc = stringResource(R.string.nice_work)
        )
    }
}