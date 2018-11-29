package christopher.androidguide

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val message = "This is the message passed between activities"
        val Intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


    //Java version of explicit intent below

    /* public void sendMessage(View view)
     {
         String message = "This is the message passed between activities";
         Intent intent = new Intent(this, SecondActivity.class);
         intent.putExtra(EXTRA_MESSAGE, message);
         startActivity(intent);
     }*/


}

