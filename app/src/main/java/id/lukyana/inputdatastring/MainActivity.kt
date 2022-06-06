package id.lukyana.inputdatastring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isiData: EditText = findViewById(R.id.inputData)
        val hasilIsi: TextView = findViewById(R.id.hasilInput)
        val tombol: Button = findViewById(R.id.submit)

        tombol.setOnClickListener {
            val data = isiData.text.toString()

            if (data.isNullOrBlank()){
                hasilIsi.text = "Data tidak boleh kosong"
            }else{
                hasilIsi.text = data
            }
        }
    }
}