def call(Map params = [:]) {
    def scriptcontents = LibraryResource("myfolder/${params.name}")
    writeFile file: "${params.name}", text: scriptcontents
    sh "chmod a+x ./${params.name}"
}