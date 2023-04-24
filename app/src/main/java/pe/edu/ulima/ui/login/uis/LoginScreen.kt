package pe.edu.ulima.ui.login.uis

import android.widget.ImageView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import pe.edu.ulima.R
import pe.edu.ulima.ui.theme.Gray200
import pe.edu.ulima.ui.theme.Orange200


@Preview
@Composable
public fun LoginScreenPreview(){
    LoginScreen()
}

@Composable
public fun LoginScreen(){
    // Se crea una caja
    Box(
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),

    ){
        //Se crea una columna
        Column(
            //La columna tiene el ancho maximo
            modifier = Modifier.fillMaxWidth(),
        ){
        //Se crea una fila
        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .fillMaxWidth()
        ){
            //comando para obtener un boton con bordes
            OutlinedButton(onClick = { /*TODO*/ },
                modifier= Modifier
                    .padding(horizontal = 10.dp, vertical = 10.dp)
                    .size(50.dp),  //se pone este tamaño para que no sea ovalado
                //forma de circulo para el boton
                shape = CircleShape,
                contentPadding = PaddingValues(0.dp),
                // Se define el color del icono dentro del boton
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.Black)
            ) {
                // Se obtiene el simbolo de persona usando Icons
                Icon(Icons.Default.Person, contentDescription = "content description", modifier = Modifier.size(40.dp))
            }
            Column(
            ){
                Box(modifier = Modifier
                    .size(width = 100.dp, height = 40.dp)
                    .padding(horizontal = 35.dp, vertical = 8.dp),){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "52",color = MaterialTheme.colors.primary, fontSize = 19.sp)
                }
                Box(modifier = Modifier.padding(horizontal = 10.dp)){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "Publicaciones",color = MaterialTheme.colors.primary, fontSize = 11.sp)
                }
            }
            Column(
            ) {
                Box(modifier = Modifier
                    .size(width = 90.dp, height = 40.dp)
                    .padding(horizontal = 28.dp, vertical = 8.dp),){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "52",color = MaterialTheme.colors.primary, fontSize = 19.sp)
                }
                Box(modifier = Modifier.padding(horizontal = 13.dp)){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "Seguidos",color = MaterialTheme.colors.primary, fontSize = 11.sp)
                }
            }
            Column(
            ) {
                Box(modifier = Modifier
                    .size(width = 90.dp, height = 40.dp)
                    .padding(horizontal = 17.dp, vertical = 8.dp),){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "52",color = MaterialTheme.colors.primary, fontSize = 19.sp)
                }
                Box(modifier = Modifier.padding(horizontal = 0.dp)){
                    //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                    Text(text = "Seguidores",color = MaterialTheme.colors.primary, fontSize = 11.sp)
                }
            }

        }
        Row(
            modifier = Modifier
                .padding(horizontal = 25.dp, vertical = 5.dp)
                .fillMaxWidth()
        ){
            //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
            Text(text = "Jerson Calderon",color = MaterialTheme.colors.primary, fontSize = 12.sp)
        }
        Row(
            modifier = Modifier
                .padding(vertical = 5.dp)
                .fillMaxWidth()
        ){
            Button(onClick = {
                //your onclick code
            },
                //reduciendo el porcentaje de equinas para que el boton sea cuadrado
                shape = CutCornerShape(0),
                modifier = Modifier.padding(horizontal = 10.dp),
                //color de los botones de acuerdo al icono, en este caso azul oscuro
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23395D)))
            {
                //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                Text(text = "Editar Perfil",color = MaterialTheme.colors.primary)
            }
            Button(onClick = {
                //your onclick code
            },
                //reduciendo el porcentaje de equinas para que el boton sea cuadrado
                shape = CutCornerShape(0),
                modifier = Modifier.padding(horizontal = 10.dp),
                //color de los botones de acuerdo al icono, en este caso azul oscuro
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23395D)))
            {
                //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                Text(text = "Compartir Perfil",color = MaterialTheme.colors.primary)

            }

            Button(onClick = {
                //your onclick code
            },
                //reduciendo el porcentaje de equinas para que el boton sea cuadrado
                shape = CutCornerShape(0),
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp)
                    .size(width = 60.dp, height = 37.dp),
                //color de los botones de acuerdo al icono, en este caso azul oscuro
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF23395D))) {
                Icon(
                    //cargando el drawable svg para el logo del boton
                    painter = painterResource(id = R.drawable.ic_usuario),
                    contentDescription = "Logo Usuario",
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Box(modifier = Modifier.padding(horizontal = 10.dp, vertical = 7.dp)){
                //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                //fontWeight para cambiar las letras a negrita
                Text(text = "Historias Destacadas",color = MaterialTheme.colors.primary, fontWeight = FontWeight.Bold)
            }
        }
        Row(
            modifier = Modifier
            .fillMaxWidth()
        ){
            Box(modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp)){
                //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                Text(text = "Guarda tus historias favoritas en el perfil",color = MaterialTheme.colors.primary, fontSize = 14.sp)
            }
        }
        Row(
            modifier = Modifier
            .fillMaxWidth()
        ){
            //comando para obtener un boton con bordes
            OutlinedButton(onClick = { /*TODO*/ },
                modifier= Modifier
                    .padding(horizontal = 10.dp, vertical = 8.dp)
                    .size(50.dp),  //se pone este tamaño para que no sea ovalado
                //forma de circulo para el boton
                shape = CircleShape,
                //grosor y color del contorno del boton
                border= BorderStroke(2.dp, Color.Black),
                contentPadding = PaddingValues(0.dp),
                //Color del icono dentro del boton
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.Black)
            ) {
                // Se obtiene el simbolo de + usando Icons
                Icon(Icons.Default.Add, contentDescription = "content description", modifier = Modifier.size(40.dp))
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Box(modifier = Modifier.padding(horizontal = 17.dp)){
                //Se usa MaterialTheme para que el colo cambie segun el modo ocuro or claro
                Text(text = "Nueva",color = MaterialTheme.colors.primary, fontSize = 12.sp)
            }
        }
        Row( modifier = Modifier
            .padding(vertical = 10.dp)
            .fillMaxWidth()){
            Column(modifier = Modifier
                // La columna tiene altura maxima
                .fillMaxHeight()) {
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(horizontal = 20.dp, vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
            }
            Column(modifier = Modifier
                .fillMaxHeight()) {
                Box(modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
            }
            Column(modifier = Modifier
                .fillMaxHeight()) {
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
                Box(modifier = Modifier
                    .size(width = 140.dp, height = 120.dp)
                    .padding(vertical = 10.dp),){
                    Image(painter = painterResource(id = R.drawable.dog), contentDescription = "A dog")
                }
            }
        }
    }
    }
}