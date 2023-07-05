package cn.blogss.wearos.tile

import android.util.Log
import androidx.wear.tiles.ColorBuilders.argb
import androidx.wear.tiles.LayoutElementBuilders
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.ResourceBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileService
import androidx.wear.tiles.TimelineBuilders
import androidx.wear.tiles.TimelineBuilders.TimelineEntry
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

class MyTileService: TileService() {
    companion object {
        private const val RESOURCES_VERSION = "1"
        private const val TAG = "MyTileService"
    }

    /**
     * 在此函数中定义卡片的布局以及数据与卡片的绑定方式
     */
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        Log.i(TAG, "onTileRequest: ")
        return Futures.immediateFuture(
            TileBuilders.Tile.Builder()
            .setResourcesVersion(RESOURCES_VERSION)
            .setTimeline(
                TimelineBuilders.Timeline.Builder().addTimelineEntry(
                    TimelineEntry.Builder().setLayout(
                        LayoutElementBuilders.Layout.Builder().setRoot(
                            LayoutElementBuilders.Text.Builder().setText("Hello world!").setFontStyle(
                                LayoutElementBuilders.FontStyle.Builder().setColor(argb(0xff00ff00.toInt())).build()
                            ).build()
                        ).build()
                    ).build()
                ).build()
            ).build()
        )

    }

    /**
     * 在此函数中提供要在卡片中使用的图片资源
     */
    override fun onResourcesRequest(requestParams: RequestBuilders.ResourcesRequest): ListenableFuture<ResourceBuilders.Resources> {
        return Futures.immediateFuture(
            ResourceBuilders.Resources.Builder()
            .setVersion(RESOURCES_VERSION)
            .build()
        )
    }
}