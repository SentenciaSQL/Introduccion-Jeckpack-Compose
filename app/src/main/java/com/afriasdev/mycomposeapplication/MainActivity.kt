package com.afriasdev.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.afriasdev.mycomposeapplication.components.MyButtons
import com.afriasdev.mycomposeapplication.components.MyCheckBox
import com.afriasdev.mycomposeapplication.components.MyIcon
import com.afriasdev.mycomposeapplication.components.MyImage
import com.afriasdev.mycomposeapplication.components.MyNetWorkImage
import com.afriasdev.mycomposeapplication.components.MySwitch
import com.afriasdev.mycomposeapplication.components.MyTexFieldParent
import com.afriasdev.mycomposeapplication.components.MyText
import com.afriasdev.mycomposeapplication.components.MyTextField
import com.afriasdev.mycomposeapplication.components.layout.ConstrainChain
import com.afriasdev.mycomposeapplication.components.layout.ConstraintBarrier
import com.afriasdev.mycomposeapplication.components.layout.ConstraintExampleGuide
import com.afriasdev.mycomposeapplication.components.layout.MyBasicConstraintLayout
import com.afriasdev.mycomposeapplication.components.layout.MyBox
import com.afriasdev.mycomposeapplication.components.layout.MyColumn
import com.afriasdev.mycomposeapplication.components.layout.MyComplexLayout
import com.afriasdev.mycomposeapplication.components.layout.MyConstraintExercise
import com.afriasdev.mycomposeapplication.components.layout.MyCustomLayout
import com.afriasdev.mycomposeapplication.components.layout.MyProgressBar
import com.afriasdev.mycomposeapplication.components.layout.MyProgressBarAdvance
import com.afriasdev.mycomposeapplication.components.layout.MyRow
import com.afriasdev.mycomposeapplication.components.layout.ProgressAnimation
import com.afriasdev.mycomposeapplication.login.Greeting
import com.afriasdev.mycomposeapplication.state.MyState
import com.afriasdev.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComposeApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    MyColumn(Modifier.padding(innerPadding))
//                    MyRow(Modifier.padding(innerPadding))
                    //MyComplexLayout(Modifier.padding(innerPadding))
//                    MyCustomLayout(Modifier.padding(innerPadding))
//                    MyBasicConstraintLayout(Modifier.padding(innerPadding))
//                    MyConstraintExercise(Modifier.padding(innerPadding))
//                    ConstraintExampleGuide(Modifier.padding(innerPadding))
//                    ConstraintBarrier(Modifier.padding(innerPadding))
//                    ConstrainChain(Modifier.padding(innerPadding))
//                    MyState(Modifier.padding(innerPadding))
//                    MyText(Modifier.padding(innerPadding))
//                    MyButtons(Modifier.padding(innerPadding))
//                    MyImage(Modifier.padding(innerPadding))
//                    MyNetWorkImage(Modifier.padding(innerPadding))
//                    MyIcon(Modifier.padding(innerPadding))
//                    MyProgressBar(Modifier.padding(innerPadding))
//                    MyProgressBarAdvance(Modifier.padding(innerPadding))
//                    ProgressAnimation(Modifier.padding(innerPadding))
//                    MySwitch(Modifier.padding(innerPadding))
                    MyCheckBox(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeApplicationTheme {
        Greeting("Android")
    }
}