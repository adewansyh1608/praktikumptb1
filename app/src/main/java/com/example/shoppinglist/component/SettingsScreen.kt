package com.example.shoppinglist.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shoppinglist.ui.theme.ShoppingListTheme

@Composable
fun SettingsScreen(useDarkTheme: Boolean, onThemeChange: (Boolean) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Title("Settings")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Dark Mode",
                style = MaterialTheme.typography.bodyLarge
            )
            Switch(
                checked = useDarkTheme,
                onCheckedChange = onThemeChange
            )
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun SettingsScreenPreview() {
    ShoppingListTheme {
        SettingsScreen(useDarkTheme = false, onThemeChange = {})
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun SettingsScreenDarkPreview() {
    ShoppingListTheme(darkTheme = true) {
        SettingsScreen(useDarkTheme = true, onThemeChange = {})
    }
}
