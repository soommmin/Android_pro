package android.part2_chapter5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part2_chapter5.databinding.ActivityWebViewBinding
import android.webkit.WebViewClient
import android.widget.Toast

class WebViewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = intent.getStringExtra("url")

        binding.webView.webViewClient = WebViewClient()
        binding.webView.settings.javaScriptEnabled = true

        if (url.isNullOrEmpty()) {
            Toast.makeText(this, "잘못된 URL 입니다.", Toast.LENGTH_SHORT).show()
            finish()
        } else {
            binding.webView.loadUrl(url)
        }


    }
}