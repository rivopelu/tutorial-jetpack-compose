package com.gunder.market.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R
import com.gunder.market.model.ListTopMenu
import com.gunder.market.model.dummyListTopMenu
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun TopMenu(modifier: Modifier = Modifier, listTopMenu: ListTopMenu) {
    Row(
        modifier = modifier
            .padding(8.dp)
            .height(IntrinsicSize.Max),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = listTopMenu.imgTopBar),
            contentDescription = listTopMenu.txtTopBar.toString(),
            modifier = modifier.size(40.dp)
        )
        Column {
            Text(text = stringResource(id = listTopMenu.txtTopBar), fontSize = 16.sp)
            Text(text = stringResource(id = listTopMenu.descTopBar), fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
        Divider(
            modifier
                .width(1.dp)
                .height(40.dp))
    }
}


@Composable
fun MainTopMenu() {
    LazyRow(horizontalArrangement = Arrangement.SpaceBetween){
        items(dummyListTopMenu){
            TopMenu(listTopMenu = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopMenuPreview() {
    MarketTheme {
        MainTopMenu()
    }
}