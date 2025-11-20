package com.sample.prak7.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.sample.prak7.R
import com.sample.prak7.model.Siswa

fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked:() ->Unit,
){
    val items = listOf(
        Pair(first = stringResource(R.string.nama), second = statusUiSiswa.nama),
        Pair(first = stringResource(R.string.gender), second = statusUiSiswa.gender),
        Pair(first = stringResource(R.string.alamat), second = statusUiSiswa.alamat),
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.purple_200)),
            )
        }){isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        )

    }
}