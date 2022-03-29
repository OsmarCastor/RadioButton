package castor.no.c.programar.ejercicio3radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edNumJuan: EditText
    lateinit var edNumDonas: EditText
    lateinit var rdSuma: RadioButton
    lateinit var rdResta: RadioButton
    lateinit var rdMulti: RadioButton
    lateinit var rdDiv: RadioButton
    lateinit var txtResultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNumJuan = findViewById(R.id.edNumJuan)
        edNumDonas = findViewById(R.id.edNumDonas)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdMulti = findViewById(R.id.rdMulti)
        rdDiv = findViewById(R.id.rdDiv)
        txtResultado = findViewById(R.id.txtResultado)
    }

    /**
     * Metodo para cuando se presione el boton
     */
    fun boton(view: View){
        var res:Int = 0
        val num1 = edNumJuan.text.toString().toInt()
        val num2 = edNumDonas.text.toString().toInt()
        if(rdSuma.isChecked)
            res = num1+num2
            else if(rdResta.isChecked)
                res = num1-num2
                else if(rdMulti.isChecked)
                    res = num1*num2
                    else if(rdDiv.isChecked)
                        res = num1/num2
            txtResultado.text = "El resultado es: $res"
    }
}