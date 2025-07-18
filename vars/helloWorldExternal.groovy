def call(map params = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    loadLinuxScriptMyFolder(name: 'hello-world-mf.sh')
    sh "./hello-world.sh ${params.name} ${config.dayOfWeek}"
    sh "./hello-worldmf.sh ${params.name} ${config.dayOfWeek}"
}