package echo.music.iad1tya.playback

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder

/**
 * Temporary Android 6-compatible stub.
 * MP3 export is disabled while the app is being ported.
 */
class AudioExportService : Service() {

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        stopSelf(startId)
        return START_NOT_STICKY
    }

    companion object {
        fun cancelAll(context: Context) {
            // MP3 export is temporarily disabled.
        }

        fun start(
            context: Context,
            songId: String,
            songTitle: String,
            songArtist: String,
            songAlbum: String,
            artworkUrl: String,
            targetDirectoryUri: String,
        ) {
            // MP3 export is temporarily disabled.
        }
    }
}
