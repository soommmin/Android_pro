package android.part2_chapter5


//리스트에서 사용할 용도로
data class NewsModel(
    val title: String,
    val link: String,
    var imageUrl: String? = null
)


//rss item -> newsModel
fun List<NewsItem>.transform() : List<NewsModel> {
    return this.map {
        NewsModel(
            title = it.title ?: "",
            link = it.link ?: "",
            imageUrl = null
        )
    }
}