def call(Map params = [:]) {
    def scriptcontents = libraryResource "com/yi/scripts/linux/${params.name}"
    writeFile file: "${params.name}", text: scriptcontents
    sh "chmod a+x ./${params.name}"
}