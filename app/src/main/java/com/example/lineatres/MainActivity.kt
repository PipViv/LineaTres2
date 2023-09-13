package com.example.lineatres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.lineatres.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var turno = "X"
    lateinit var imageViews: Array<ImageView>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageViews = arrayOf(
            binding.image1,
            binding.image2,
            binding.image3,
            binding.image4,
            binding.image5,
            binding.image6,
            binding.image7,
            binding.image8,
            binding.image9
        )
    }
    fun actionClic(view: View) {
        val imageView = view as ImageView
        if (imageView.tag == null) {
            if (turno == "X") {
                imageView.setImageResource(R.drawable.x1)
                turno = "O"
            } else {
                imageView.setImageResource(R.drawable.o1)
                turno = "X"
            }
            imageView.tag = turno
        }
    }
    fun reiniciar(view: View) {

        for (imagen in imageViews) {
            imagen.setImageResource(R.drawable.vacio)
            imagen.tag = null
        }
        turno = "X"
    }
}