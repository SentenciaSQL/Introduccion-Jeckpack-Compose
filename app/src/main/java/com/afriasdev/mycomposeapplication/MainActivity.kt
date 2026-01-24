package com.afriasdev.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.afriasdev.mycomposeapplication.components.MyAdvanceList
import com.afriasdev.mycomposeapplication.components.MyBadge
import com.afriasdev.mycomposeapplication.components.MyBadgeBox
import com.afriasdev.mycomposeapplication.components.MyBasicList
import com.afriasdev.mycomposeapplication.components.MyButtons
import com.afriasdev.mycomposeapplication.components.MyCard
import com.afriasdev.mycomposeapplication.components.MyCheckBox
import com.afriasdev.mycomposeapplication.components.MyCustomDialog
import com.afriasdev.mycomposeapplication.components.MyDateDialog
import com.afriasdev.mycomposeapplication.components.MyDialog
import com.afriasdev.mycomposeapplication.components.MyDivider
import com.afriasdev.mycomposeapplication.components.MyDrawer
import com.afriasdev.mycomposeapplication.components.MyDropDownItem
import com.afriasdev.mycomposeapplication.components.MyDropDownMenu
import com.afriasdev.mycomposeapplication.components.MyElevateCard
import com.afriasdev.mycomposeapplication.components.MyExposeDropDownMenu
import com.afriasdev.mycomposeapplication.components.MyFab
import com.afriasdev.mycomposeapplication.components.MyIcon
import com.afriasdev.mycomposeapplication.components.MyImage
import com.afriasdev.mycomposeapplication.components.MyListGrid
import com.afriasdev.mycomposeapplication.components.MyNavigationBar
import com.afriasdev.mycomposeapplication.components.MyNetWorkImage
import com.afriasdev.mycomposeapplication.components.MyOutlinedCard
import com.afriasdev.mycomposeapplication.components.MyRadioButton
import com.afriasdev.mycomposeapplication.components.MyRadioButtonList
import com.afriasdev.mycomposeapplication.components.MyRangeSlider
import com.afriasdev.mycomposeapplication.components.MySlider
import com.afriasdev.mycomposeapplication.components.MySliderAdvance
import com.afriasdev.mycomposeapplication.components.MySwitch
import com.afriasdev.mycomposeapplication.components.MyTexFieldParent
import com.afriasdev.mycomposeapplication.components.MyText
import com.afriasdev.mycomposeapplication.components.MyTextField
import com.afriasdev.mycomposeapplication.components.MyTimePicker
import com.afriasdev.mycomposeapplication.components.MyTopAppBar
import com.afriasdev.mycomposeapplication.components.ParentCheckBoxes
import com.afriasdev.mycomposeapplication.components.ScrollList
import com.afriasdev.mycomposeapplication.components.TriStateCheckBox
import com.afriasdev.mycomposeapplication.components.advance.InteractionSourceExample
import com.afriasdev.mycomposeapplication.components.advance.MyDerivedState
import com.afriasdev.mycomposeapplication.components.advance.MyLaunchEffect
import com.afriasdev.mycomposeapplication.components.animations.FullAnimateAsState
import com.afriasdev.mycomposeapplication.components.animations.MyAnimateContent
import com.afriasdev.mycomposeapplication.components.animations.MyAnimatedVisibility
import com.afriasdev.mycomposeapplication.components.animations.MyContentSize
import com.afriasdev.mycomposeapplication.components.animations.MyInfiniteTransition
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
import com.afriasdev.mycomposeapplication.components.model.PokemonCombat
import com.afriasdev.mycomposeapplication.components.navigation.NavigationWrapper
import com.afriasdev.mycomposeapplication.login.Greeting
import com.afriasdev.mycomposeapplication.state.MyState
import com.afriasdev.mycomposeapplication.ui.theme.MyComposeApplicationTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComposeApplicationTheme {
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val snackBarHostState = remember { SnackbarHostState() }
                val scope = rememberCoroutineScope()
                var showDialog by remember { mutableStateOf(false) }
                val pokemonCombat = PokemonCombat(pokemonA = "Pikachu", polemonB = "Gengar")

//                MyDialog()
//                MyDateDialog()
//                MyTimePicker()
                MyCustomDialog(
                    showDialog = showDialog,
                    pokemonCombat = pokemonCombat,
                    onStartCombat = {
                        showDialog = false
                    },
                    onDismissDialog = {showDialog = false})

//                NavigationWrapper()

//                MyAnimatedVisibility()
//                FullAnimateAsState()
//                MyAnimateContent()
//                MyContentSize()
                MyInfiniteTransition()

//                MyDrawer(drawerState) {
//                    Scaffold(
//                        modifier = Modifier.fillMaxSize(),
//                        topBar = { MyTopAppBar { scope.launch { drawerState.open() } } },
//                        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
//                        floatingActionButton = { MyFab { showDialog = true } },
//                        floatingActionButtonPosition = FabPosition.End,
//                        bottomBar = { MyNavigationBar() }
//                    ) { innerPadding ->
////                        MyCard(Modifier.padding(innerPadding))
////                        MyElevateCard(Modifier.padding(innerPadding))
////                        MyOutlinedCard(Modifier.padding(innerPadding))
////                        MyBadge(Modifier.padding(innerPadding))
////                        MyBadgeBox(Modifier.padding(innerPadding))
////                        MyDivider(Modifier.padding(innerPadding))
//
////                        Box(
////                            modifier = Modifier
////                                .fillMaxSize()
////                                .padding(innerPadding)
////                                .background(Color.LightGray),
////                            contentAlignment = Alignment.Center
////                        ) {
////                            Text("Esta es mi screen", modifier = Modifier.clickable {
////                                scope.launch {
////                                    val result = snackBarHostState.showSnackbar(
////                                        "Ejemplo",
////                                        actionLabel = "Deshacer"
////                                    )
////
////                                    if (result == SnackbarResult.ActionPerformed) {
////
////                                    } else {
////
////                                    }
////                                }
////                            })
//
////                            InteractionSourceExample()
////                            MyLaunchEffect {}
////                            MyDerivedState()
////                            MyBasicList() {}
////                            MyAdvanceList()
////                            ScrollList()
////                            MyListGrid()
////                        }
//
//
//                    }
//                }

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


//                    MyColumn(Modifier.padding(innerPadding))
//                    MyRow(Modifier.padding(innerPadding))
//                    MyComplexLayout(Modifier.padding(innerPadding))
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
//                    MyCheckBox(Modifier.padding(innerPadding))
//                    ParentCheckBoxes(Modifier.padding(innerPadding))
//                    TriStateCheckBox(Modifier.padding(innerPadding))
//                    MyRadioButton(Modifier.padding(innerPadding))
//                    MyRadioButtonList(Modifier.padding(innerPadding))
//                    MySlider(Modifier.padding(innerPadding))
//                    MySliderAdvance(Modifier.padding(innerPadding))
//                    MyRangeSlider(Modifier.padding(innerPadding))
//                    MyDropDownItem(Modifier.padding(innerPadding))
//                    MyDropDownMenu(Modifier.padding(innerPadding))
//                    MyExposeDropDownMenu(Modifier.padding(innerPadding))