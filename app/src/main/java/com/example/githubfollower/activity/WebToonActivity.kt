package com.example.githubfollower.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.githubfollower.R
import com.example.githubfollower.adapter.WebtoonAdapter
import com.example.githubfollower.data.WebtoonData
import kotlinx.android.synthetic.main.activity_web_toon.*

class WebToonActivity : AppCompatActivity() {

    private lateinit var webtoonAdapter: WebtoonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_toon)
        init()
    }
    fun init(){
        webtoonAdapter = WebtoonAdapter(this)
        val gridLayoutManager : GridLayoutManager = GridLayoutManager(this,3)
        webtoon_recyclerview.layoutManager = gridLayoutManager
        webtoon_recyclerview.adapter = webtoonAdapter
        setData()
        webtoonAdapter.notifyDataSetChanged()
    }
    fun setData(){
        webtoonAdapter.datas = listOf(
            WebtoonData(
                webtoon_img = 1,
                webtoon_name = "프리드로우",
                rating = "9.90",
                writer = "전선욱"
            ),
            WebtoonData(
                webtoon_img = 2,
                webtoon_name = "유미의 세포들",
                rating = "9.96",
                writer = "이동건"
            ),
            WebtoonData(
                webtoon_img = 3,
                webtoon_name = "호랑이 형님",
                rating = "9.98",
                writer = "이상규"
            ),
            WebtoonData(
                webtoon_img = 4,
                webtoon_name = "용이산다",
                rating = "9.76",
                writer = "초"
            ),
            WebtoonData(
                webtoon_img = 5,
                webtoon_name = "부활남",
                rating = "9.48",
                writer = "채용택/김재한"
            ),
            WebtoonData(
                webtoon_img = 6,
                webtoon_name = "스터디그룹",
                rating = "9.95",
                writer = "신형욱/유승연"
            ),
            WebtoonData(
                webtoon_img = 7,
                webtoon_name = "취사병 전설이 되다",
                rating = "9.95",
                writer = "제이로빈/이진수"
            ),
            WebtoonData(
                webtoon_img = 8,
                webtoon_name = "머니게임",
                rating = "9.95",
                writer = "배진수"
            ),
            WebtoonData(
                webtoon_img = 9,
                webtoon_name = "비질란테",
                rating = "9.98",
                writer = "김규삼"
            )
        )
    }
}
