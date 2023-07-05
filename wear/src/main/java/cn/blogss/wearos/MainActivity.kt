package cn.blogss.wearos

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.wear.widget.DismissibleFrameLayout
import cn.blogss.wearos.demo.databinding.LayoutMainActivityBinding

class MainActivity: AppCompatActivity() {
    private lateinit var vb: LayoutMainActivityBinding
    companion object {
        private const val TAG = "MainActivity"
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = LayoutMainActivityBinding.inflate(layoutInflater)
        setContentView(vb.root)
        initView()
    }

    private fun initView() {
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}