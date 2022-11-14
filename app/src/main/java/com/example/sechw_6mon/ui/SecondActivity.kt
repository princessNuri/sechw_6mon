package com.example.sechw_6mon.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.sechw_6mon.R
import com.example.sechw_6mon.common.Constants.MAIN_KEY
import com.example.sechw_6mon.common.Constants.SECOND_KEY
import com.example.sechw_6mon.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(R.layout.activity_second) {
    private val binding by viewBinding(ActivitySecondBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getIntents()
        transit()
    }

    private fun transit() {
        binding.btnNext.setOnClickListener {
            if (binding.etInfo.text.isEmpty())
                Toast.makeText(this, getString(R.string.placeholder_field), Toast.LENGTH_SHORT)
                    .show()
            else
                sendMessage(binding.etInfo.text.toString())
        }
    }

    private fun sendMessage(message: String) {
        setResult(RESULT_OK, Intent().putExtra(SECOND_KEY, message))
        finish()
    }

    private fun getIntents() {
        binding.etInfo.setText(intent.getStringExtra(MAIN_KEY))
        binding.etInfo.setSelection(binding.etInfo.text.length)

    }
}