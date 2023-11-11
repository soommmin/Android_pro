package android.part2_chapter7

import android.app.ForegroundServiceStartNotAllowedException
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.RemoteViews
import androidx.core.content.ContextCompat

class WeatherAppWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        //wiget id를 가져와서 pendingIntent 설정
        appWidgetIds.forEach { appWidgetId ->
            val pendingIntent: PendingIntent = Intent(context, UpdateWeatherService::class.java)
                .let { intent ->
                    PendingIntent.getForegroundService(
                        context,
                        1,
                        intent,
                        PendingIntent.FLAG_IMMUTABLE
                    )
                }
            //view에 pending intent가 클릭이 되도록
            val views: RemoteViews = RemoteViews(
                context.packageName,
                R.layout.widget_weather
            ).apply {
                setOnClickPendingIntent(R.id.temperatureTextView, pendingIntent)
            }
            //위젯에 내용 반영
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }


        //포그라운드 서비스 실행되도록
        val serviceIntent = Intent(context, UpdateWeatherService::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            try {
                ContextCompat.startForegroundService(context, serviceIntent)

            } catch (e: ForegroundServiceStartNotAllowedException) {
                e.printStackTrace()
            }
        } else {
            ContextCompat.startForegroundService(context, serviceIntent)
        }
    }
}