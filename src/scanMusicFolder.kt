import java.io.File

fun scanMusicFolder(folderPath: String): List<Any> {
    val folder = File(folderPath)

    if(!folder.exists() || !folder.isDirectory){
        return emptyList()
    }
    return folder.walkTopDown()
            .filter { it.isFile && it.extension.lowercase() == "mp3"}
            .mapNotNull { file ->
                //ler metadados das músicas
                //criar instânica da classe Song

            }.toList()

}