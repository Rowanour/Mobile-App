import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : ComponentActivity() {

    lateinit var c: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //relate activity with xml file

        c = findViewById(R.id.c)
        c.text = "Hello Android"

        c.setOnClickListener {
            Toast.makeText(this, "Welcome to my app", Toast.LENGTH_LONG).show()
        }
    }
}