
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object BookmarkScreen :Tab{


    override val options: TabOptions
        @Composable
        get() {
            val title ="Bookmark"
            val icon = rememberVectorPainter(Icons.Default.FavoriteBorder)
            return remember {
                TabOptions(1u,title,icon)

            }
        }

    @Composable
    override fun Content() {

        Text(text = "Hello Bookmark")
    }
}