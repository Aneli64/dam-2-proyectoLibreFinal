package com.example.proyectolibrefinal.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.R
import com.example.proyectolibrefinal.ViewModel
import com.example.proyectolibrefinal.apartadoinicio1.ApartadoInicio1
import com.example.proyectolibrefinal.apartadoinicio2.ApartadoInicio2
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.framecartacompleta.Image3
import com.example.proyectolibrefinal.framecartacompleta.Image4
import com.example.proyectolibrefinal.framecartacompleta.Image7
import com.example.proyectolibrefinal.framecartacompleta.Line10
import com.example.proyectolibrefinal.framecartacompleta.Line11
import com.example.proyectolibrefinal.framecartacompleta.Line13
import com.example.proyectolibrefinal.framecartacompleta.Menu1
import com.example.proyectolibrefinal.framecartacompleta.Menu2
import com.example.proyectolibrefinal.framecartacompleta.Menu3
import com.example.proyectolibrefinal.framecartacompleta.Precio1
import com.example.proyectolibrefinal.framecartacompleta.Precio2
import com.example.proyectolibrefinal.framecartacompleta.Precio3
import com.example.proyectolibrefinal.framecartacompleta.Text1
import com.example.proyectolibrefinal.framecartacompleta.Text2
import com.example.proyectolibrefinal.framecartacompleta.Text3
import com.example.proyectolibrefinal.vistainicio.VistaInicio

@Composable
fun encabezado() {
    val encabezado: Painter = painterResource(id = R.drawable.frame_encabezado_preview)
    Column {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 600.dp)
                .padding(start = 5.dp)
        ) {
            Image(
                painter = encabezado,
                contentDescription = "imagen encabezado",
                Modifier.size(400.dp)
            )
        }
    }
}

@Composable
fun lineaDiv() {
    val linea: Painter = painterResource(id = R.drawable.apartado_inicio_1_line_9)

    Image(
        painter = linea,
        contentDescription = "linea",
        Modifier.size(400.dp)
    )
}


@Composable
fun inicio_screen(viewModel: ViewModel, navController: NavHostController) {
    //Fondo de pantalla y encabezado
    VistaInicio()
    encabezado()

    Column {
        Row(Modifier.padding(top = 150.dp)) {
            ApartadoInicio1()
        }
        Row(
            modifier = Modifier
                .height(60.dp)
                .padding(start = 30.dp)
        ) {
            menu1View()
        }

        Row(modifier = Modifier.padding(start = 30.dp)) {
            menu2View()
        }

        Row(
            modifier = Modifier
                .height(35.dp)
                .padding(start = 25.dp)
                .padding(end = 25.dp)
        ) {
            lineaDiv()
        }
        Row(modifier = Modifier.height(60.dp)) {
            ApartadoInicio2()
        }
        Row(modifier = Modifier.padding(start = 30.dp)) {
            menu3View()
        }

        Row(modifier = Modifier.padding(top = 30.dp)) {
            FrameBotonesApp(
                menuButton = { navController.navigate(Routes.Screen_FoodMenu.route) },
                contactoButton = { navController.navigate(Routes.Screen_Contact.route) },
                carritoButton = { navController.navigate(Routes.Screen_Carrito.route) },
                homeButton = {navController.navigate(Routes.Screen_Inic.route)}
            )
        }

    }

}