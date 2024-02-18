package android.part2_chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.part2_chapter4.adapter.UserAdapter
import android.part2_chapter4.databinding.ActivityMainBinding
import android.part2_chapter4.model.Repo
import android.part2_chapter4.model.UserDto
import android.part2_chapter4.network.GithubService
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userAdapter : UserAdapter



    private val handler = Handler(Looper.getMainLooper())
    private var searchFor: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




         userAdapter = UserAdapter{
             val intent = Intent(this@MainActivity, RepoActivity::class.java)
             intent.putExtra("username", it.username)
             startActivity(intent)
         }

        binding.userRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = userAdapter
        }

        val runnable = Runnable {
            searchUser()
        }

        binding.searchEditText.addTextChangedListener {

            searchFor = it.toString()
            handler.removeCallbacks(runnable)
            handler.postDelayed(
                runnable,
                300,
            )
        }

    }

    private fun searchUser(){
        val githubService = APIClient.retrofit.create(GithubService::class.java)
        githubService.searchUsers(searchFor).enqueue(object : Callback<UserDto>{
            override fun onResponse(call: Call<UserDto>, response: Response<UserDto>) {
                if(response.isSuccessful){
                    Log.e("mainActivity", "SearchUser: ${response.body().toString()}")

                    userAdapter.submitList(response.body()?.items)
                }


            }

            override fun onFailure(call: Call<UserDto>, t: Throwable) {
                Toast.makeText(this@MainActivity, "에러가 발생했습니다.", Toast.LENGTH_SHORT).show()
                t.printStackTrace()
            }

        })
    }
}