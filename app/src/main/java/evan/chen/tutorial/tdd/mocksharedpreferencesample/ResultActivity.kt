package evan.chen.tutorial.tdd.mocksharedpreferencesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        intent.getStringExtra("ID")

    }
}
