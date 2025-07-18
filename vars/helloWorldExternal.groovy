def call(Map params = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    loadLinuxScriptMyFolder(name: 'hello-world-mf.sh')
    sh "./hello-world.sh ${params.name} ${params.dayOfWeek}"
    sh "./hello-world-mf.sh ${params.name} ${params.dayOfWeek}"
}