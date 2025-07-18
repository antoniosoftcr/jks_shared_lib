def call() {
    echo "test mesasge"
}

def info(msg) {
    echo "test ${msg}"
}

def warning(Map params = [:]) {
    echo "test mesasge: ${params.msg} for ${params.name}"
}