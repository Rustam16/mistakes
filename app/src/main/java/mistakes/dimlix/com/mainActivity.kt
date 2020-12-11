@file:Suppress("ClassName", "unused", "FunctionName")

package mistakes.dimlix.com

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout

class mainActivity : AppCompatActivity() {

    var _click_counter = 0
    var appendedstring = ""

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).text = "Append 'X' to field below"
        findViewById<Button>(R.id.button1).setOnClickListener {
            appendedstring += 'X'
            findViewById<TextView>(R.id.textView2).text = appendedstring.toString()
        }

        findViewById<Button>(R.id.button1).setOnClickListener {
            _click_counter += 1
            findViewById<TextView>(R.id.textView1).text = _click_counter.toString()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            WriteToLog("Hello world")
        }
    }


    fun WriteToLog() {
        Log.e("!@#", "Hello world")
    }

    fun WriteToLog(string: String) {
        Log.e("!@#", string)
    }

    }