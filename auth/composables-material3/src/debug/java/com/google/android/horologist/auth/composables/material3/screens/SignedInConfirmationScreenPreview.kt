package com.google.android.horologist.auth.composables.material3.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.google.android.horologist.auth.composables.material3.R
import com.google.android.horologist.auth.composables.material3.theme.HorologistMaterialTheme
import com.google.android.horologist.images.base.paintable.DrawableResPaintable

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenPreview() {
    HorologistMaterialTheme {
        SignedInConfirmationDialogContent(
            modifier = Modifier.fillMaxSize(),
            name = "Maggie",
            email = "maggiesworkaccount@gmail.com",
            avatar = DrawableResPaintable(R.drawable.avatar_small_3),
        )
    }
}

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenDefaultAvatarPreview() {
    HorologistMaterialTheme {
        SignedInConfirmationDialogContent(
            modifier = Modifier.fillMaxSize(),
            name = "Maggie",
            email = "maggiesworkaccount@gmail.com",
            avatar = null
        )
    }
}

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenContentPreview() {
    HorologistMaterialTheme {
        SignedInConfirmationDialogContent(
            modifier = Modifier.fillMaxSize(),
            name = "Timothy Andrews",
            email = "timandrews123@example.com",
            avatar = DrawableResPaintable(R.drawable.avatar_small_1),
        )
    }
}
@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenPreviewNoName() {
    SignedInConfirmationScreen(
        onDismissOrTimeout = {},
        email = "timandrews123@example.com",
        avatar = DrawableResPaintable(R.drawable.avatar_small_1),
    )
}

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenPreviewNoEmail() {
    SignedInConfirmationScreen(
        onDismissOrTimeout = {},
        name = "Maggie",
    )
}

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenPreviewNoInformation() {
    SignedInConfirmationScreen(onDismissOrTimeout = {})
}

@WearPreviewDevices
@Composable
fun SignedInConfirmationScreenPreviewTruncation() {
    SignedInConfirmationScreen(
        onDismissOrTimeout = {},
        name = "Wolfeschlegelsteinhausenbergerdorff",
        email = "wolfeschlegelsteinhausenbergerdorff@example.com",
    )
}
