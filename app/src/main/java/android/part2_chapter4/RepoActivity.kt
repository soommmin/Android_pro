package android.part2_chapter4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part2_chapter4.adapter.RepoAdapter
import android.part2_chapter4.databinding.ActivityRepoBinding
import android.part2_chapter4.model.Repo
import android.part2_chapter4.network.GithubService
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRepoBinding
    private lateinit var repoAdapter: RepoAdapter

    private var page = 0
    private var hasMore = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRepoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username = intent.getStringExtra("username") ?: return

        binding.usernameTextView.text = username
        repoAdapter = RepoAdapter {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it.htmlUrl))
            startActivity(intent)
        }
        val linearLayoutManager = LinearLayoutManager(this@RepoActivity)

        binding.repoRecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = repoAdapter
        }

        binding.repoRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val totalCount = linearLayoutManager.itemCount

                //마지막으로 보여지는 아이템 포지션을 가져온다
                val lastVisiblePosition =
                    linearLayoutManager.findLastCompletelyVisibleItemPosition()

                //마지막을 보고있으면서 뒤에 더 값이 있다면
                //다음 페이지를 불러온다
                if (lastVisiblePosition >= (totalCount - 1) && hasMore) {
                    page += 1
                    listRepo(username, page)
                }
            }
        })

        listRepo(username, 0)

    }

    private fun listRepo(username: String,page: Int) {
        val githubService = APIClient.retrofit.create(GithubService::class.java)
        githubService.listRepos(username, page).enqueue(object : Callback<List<Repo>> {
            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {

                if (response.isSuccessful) {
                    Log.e("mainActivity", "List Repo: ${response.body().toString()}")

                    
                    hasMore = response.body()?.count() == 30
                    repoAdapter.submitList(repoAdapter.currentList + response.body().orEmpty())

                }
            }

            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {

            }

        })
    }
}