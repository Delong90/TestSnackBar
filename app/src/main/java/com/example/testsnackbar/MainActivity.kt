package com.example.testsnackbar



import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener{
            var snackbar = Snackbar.make(binding.root, "Hello Android", Snackbar.LENGTH_LONG)

//            snackbar.setTextColor(R.color.teal_200)
//            snackbar.setBackgroundTint(R.color.white)
//            snackbar.setActionTextColor(R.color.purple_200)
//            snackbar.setTextColor(R.color.black)
//            snackbar.setBackgroundTint(R.color.purple_200)
//            snackbar.setActionTextColor(R.color.black)
            snackbar.setAction("Next...") {
                val toast = Toast.makeText(applicationContext, "Next clicked!", Toast.LENGTH_LONG)
                toast.show()
            }
            snackbar.show()

        }

//        Snackbar создается с помощью метода make(), в который передаются три параметра: объект View,
    //        к которому прикрепляется всплывающее ообщение, само сообщение в виде строки и параметр,
    //        который указывает, сколько будет отображаться сообщение. Последний параметр может принимать
    //        числовое значение - количество миллисекунд, либо одну из трех констант:
    //        Snackbar.LENGTH_INDEFINITE (отображение в течение неопределенного периода времени),
    //        Snackbar.LENGTH_LONG (долгое отображение) или
    //        Snackbar.LENGTH_SHORT (недолгое отображение).

//        Настройка визуального вида
//        Ряд методов Snackbar позволяет настроить внешний вид:
//        setTextColor(): настраивает цвет текста
//        setBackgroundTint(): настраивает цвет фона
//        setActionTextColor(): настраивает цвет текста кнопки в всплывающем сообщении
    }
}