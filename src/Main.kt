import java.io.File

fun run() {
    println("path")
    val basePath = readLine()?.replace("\\", "/")
    println("subtittle_extention")
    val stirngSubtitleAdded = readLine()
    (stirngSubtitleAdded == null).println()
    val file = File(basePath)
    file.listFiles().filter { it.extension == "mp4" }.forEach {
        it.renameTo(
            File(
                basePath + "/" + it.nameWithoutExtension + stirngSubtitleAdded + ".mp4"
            )
        )
    }
    file.listFiles().filter { it.extension == "mp4" }.forEach { fileMp4 ->
        file.listFiles().filter { it.extension == "srt" }.forEach {
            if (fileMp4.nameWithoutExtension.split("-")[1] == it.nameWithoutExtension.split("-")[1]) {
                println(basePath + "/" + (fileMp4.name.split("-")[1]) + "-" + it.name.substringAfter("-"))
                it.renameTo(File(basePath + "/" + (fileMp4.name.split("-")[0]) + "-" + it.name.substringAfter("-")))
            }

        }
    }
}

private fun Any?.println() {
    println(this)
}
