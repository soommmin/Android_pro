package android.part2_chapter11

import android.content.Context
import com.google.gson.Gson
import java.io.IOException


//파일을 읽어와서 내보내기
//<T> 를 받아와서 <T>로 내보내기

fun <T> Context.readData(fileName: String, classT: Class<T>): T? {
    return try {
        val inputStream = this.resources.assets.open(fileName)
        val buffer = ByteArray(inputStream.available())
        inputStream.read(buffer)
        inputStream.close()

        val gson = Gson()
        gson.fromJson(String(buffer), classT)
    } catch (e: IOException) {
        null
    }

}

