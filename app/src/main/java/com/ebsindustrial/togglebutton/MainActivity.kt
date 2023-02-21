package com.ebsindustrial.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.ebsindustrial.togglebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setStatus()

        binding.toggleButton.setOnCheckedChangeListener{_, _ ->
            setStatus()
        }
    }

    fun setStatus(){
        binding.textView.text = if (binding.toggleButton.isChecked){
            binding.progressBar.isVisible = true
            "Ligado"
        }else{
            binding.progressBar.isVisible = false
            "Desligado"
        }
    }
}