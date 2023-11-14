package android.part2_chapter9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part2_chapter9.databinding.ActivityEmailLoginBinding
import android.widget.Toast

class EmailLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.doneButton.setOnClickListener {
            if (binding.emailEditText.text.isNotEmpty()) {
                val data = Intent().apply {
                    putExtra("email", binding.emailEditText.text.toString())
                }
                setResult(RESULT_OK, data)
                finish()
            } else {
                Toast.makeText(this, "이메일을 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}