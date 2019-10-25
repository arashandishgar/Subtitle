import java.io.File

fun run() {
    println("path")
    val basePath = readLine()?.replace("\\", "/")
    val file = File(basePath)
    val subtitlesFile=   file.listFiles().filter { it.extension == "srt" }.toMutableList()
    file.listFiles().filter { it.extension == "mp4" }.forEach { fileMp4 ->
        var it1:File?=null
        it1?:subtitlesFile.remove(it1)
        subtitlesFile.forEach() {
            if (condition(fileMp4,it)) {
                it1=it
                println(basePath+"/"+fileMp4.nameWithoutExtension+".srt")
                it.renameTo(File(basePath+"/"+fileMp4.nameWithoutExtension+".srt"))

            }

        }
    }
}

fun condition(fileMp4:File, it:File)=
    fileMp4.nameWithoutExtension.split("-")[1] .contains(it.nameWithoutExtension.split("-")[1]) or it.nameWithoutExtension.split("-")[1] .contains(fileMp4.nameWithoutExtension.split("-")[1])


fun Any?.println() {
    println(this)
}
